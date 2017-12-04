package com.jihai.mengmian.utils;

import com.alibaba.fastjson.JSON;
import com.jihai.mengmian.utils.common.LOG;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpMessage;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.*;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.LayeredConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.AbstractHttpMessage;
import org.apache.http.util.EntityUtils;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Map;


/**
 * 采用最新的httpclient 4.5.2 封装的工具类
 * 支持http及https 消息体为JSON字符串格式的请求
 * @author kevinchen
 *
 */
public class HttpClientUtil {


	/*** 保证 HttpClient 为单例*/
	private static CloseableHttpClient httpClient = null;

	private static final String UTF_8 = "UTF-8";

	static{
		LayeredConnectionSocketFactory sslsf = null;
		try {
			sslsf = new SSLConnectionSocketFactory(createSSLContext(),NoopHostnameVerifier.INSTANCE);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory>create()
				.register("https", sslsf).register("http", PlainConnectionSocketFactory.INSTANCE).build();

		PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager(socketFactoryRegistry);
		cm.setMaxTotal(200);
		cm.setDefaultMaxPerRoute(20);

		RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(180000)
				.setConnectTimeout(180000).setConnectionRequestTimeout(180000).build();
		httpClient=HttpClients.custom().setConnectionManager(cm).setDefaultRequestConfig(requestConfig).build();
	}

	public static enum MethodType{
		METHOD_GET,METHOD_POST,METHOD_DELETE,METHOD_PUT;
	}

	/**
	 * 支持http及https 请求
	 * @param url
	 * @param headers  消息头 （ps:注意不要重复）
	 * @param params  查询参数,支持get方法查询
	 * @param methodType 支持 GET POST DELETE PUT
	 * @return
	 */
	public static String httpRequest(String url, Map<String, String> headers,
									 Map<String, String> params,MethodType methodType){
		if(!url.contains("?") && params != null){ // 添加查询参数
			url = buildUrlWithQueryString(url, params);
		}
		return httpRequest(url, headers, JSON.toJSONString(params), methodType);
	}

	/**
	 * 支持http及https 请求
	 * @param url
	 * @param headers  消息头 （ps:注意不要重复）
	 * @param bodyJsonStr  字符串格式的消息体
	 * @param methodType 支持 GET POST DELETE PUT
	 * @return
	 */
	public static String httpRequest(String url, Map<String, String> headers,
									 String bodyJsonStr,MethodType methodType){
		AbstractHttpMessage httpMessage = null;
		try {
			switch (methodType) {
				case METHOD_GET:
					httpMessage = new HttpGet(url);
					break;
				case METHOD_POST:
					httpMessage = new HttpPost(url);
					break;
				case METHOD_DELETE:
					httpMessage = new HttpDeleteWithBody(url);
					break;
				case METHOD_PUT:
					httpMessage = new HttpPutWithBody(url);
					break;
				default:
					LOG.info(HttpClientUtil.class,"暂不支持 MethodType:"+methodType);
					throw new RuntimeException("暂不支持 MethodType："+methodType);
			}
			setHttpHeaders(httpMessage, headers);
			if(StringUtils.isNotBlank(bodyJsonStr) && methodType != MethodType.METHOD_GET){
				setHttpEntityBody(bodyJsonStr, (HttpEntityEnclosingRequest)httpMessage, UTF_8);
			}
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error(HttpClientUtil.class,"httpRequest error : ", e);
			return null;
		}
		return getResult((HttpRequestBase)httpMessage);
	}

	/**
	 * boby请求为json格式
	 * @param bodyJsonStr
	 * @param
	 * @param charset
	 */
	private static void setHttpEntityBody(String bodyJsonStr, HttpEntityEnclosingRequest httpEntityEnclosingRequest,String  charset){
		if(bodyJsonStr==null ||bodyJsonStr.isEmpty() || !JsonValidator.INSTANCE.validate(bodyJsonStr))return;
		StringEntity entity = new StringEntity(bodyJsonStr.toString(),charset);//解决中文乱码问题    UTF-8
		entity.setContentEncoding(charset);
		entity.setContentType("application/json");
		httpEntityEnclosingRequest.setEntity(entity);
	}

	/**
	 * 此方法 需要确保消息头与原header不重复 可用addHeader() 此方法执行效率高一些
	 * 如果不确定 header 是否重复 可用使用setHeader();
	 * @param hmsg
	 * @param headers
	 */
	private static void setHttpHeaders(HttpMessage hmsg,Map<String, String> headers){
		if(headers==null || headers.size()==0)return;
		for (Map.Entry<String, String> param: headers.entrySet()) {
			hmsg.addHeader(param.getKey(), param.getValue().toString());
		}
	}

	/**
	 * 构建查询参数
	 *
	 * @param url
	 * @param queryParas
	 * @return
	 */
	private static String buildUrlWithQueryString(String url, Map<String, String> queryParas) {
		if (queryParas == null || queryParas.isEmpty())
			return url;

		StringBuilder sb = new StringBuilder(url);
		boolean isFirst;
		if (url.indexOf("?") == -1) {
			isFirst = true;
			sb.append("?");
		} else {
			isFirst = false;
		}

		for (Map.Entry<String, String> entry : queryParas.entrySet()) {
			if (isFirst) isFirst = false;
			else sb.append("&");

			String key = entry.getKey();
			String value = entry.getValue();
			if (value != null && !"".equals(value.trim()))
				try {
					value = URLEncoder.encode(value, UTF_8);
				} catch (UnsupportedEncodingException e) {
					throw new RuntimeException(e);
				}
			sb.append(key).append("=").append(value);
		}
		return sb.toString();
	}


	/**
	 * 处理Http请求
	 * @param request
	 * @return
	 */
	private static String getResult(HttpRequestBase request){
		CloseableHttpResponse response = null;
		String result ="";
		try{
			response = httpClient.execute(request);
			HttpEntity entity = response.getEntity();
			if(entity!=null){
				result = EntityUtils.toString(entity);
			}
		}catch(ClientProtocolException e){
			LOG.error(HttpClientUtil.class,"httpResponse error : ", e);
			result= JsonFormatUtil.getJsonString(new String[]{"exception:ClientProtocolException"});
		}catch(IOException e){
			LOG.error(HttpClientUtil.class,"httpResponse error : ", e);
			result= JsonFormatUtil.getJsonString(new String[]{"exception:IOException"});
		}finally{
			try {
				if( response != null )
					response.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		return result;
	}


	static class HttpDeleteWithBody extends HttpEntityEnclosingRequestBase {

		public static final String METHOD_NAME = "DELETE";
		public String getMethod() { return METHOD_NAME; }

		public HttpDeleteWithBody(final String uri) {
			super();
			setURI(URI.create(uri));
		}
		public HttpDeleteWithBody(final URI uri) {
			super();
			setURI(uri);
		}
		public HttpDeleteWithBody() { super(); }

	}

	static class HttpPutWithBody extends HttpEntityEnclosingRequestBase{
		public static final String METHOD_NAME = "PUT";
		public String getMethod() { return METHOD_NAME; }
		public HttpPutWithBody(final String uri) {
			super();
			setURI(URI.create(uri));
		}
		public HttpPutWithBody(final URI uri) {
			super();
			setURI(uri);
		}
		public HttpPutWithBody() { super(); }

	}

	/**
	 * 绕过验证
	 * @return
	 * @throws NoSuchAlgorithmException
	 * @throws KeyManagementException
	 */
	private static SSLContext createSSLContext() throws NoSuchAlgorithmException, KeyManagementException {
		SSLContext sc = SSLContext.getInstance("SSLv3");
		// 实现一个X509TrustManager接口，用于绕过验证，不用修改里面的方法
		X509TrustManager trustManager = new X509TrustManager() {
			@Override
			public void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate,
										   String paramString) throws CertificateException {
			}

			@Override
			public void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate,
										   String paramString) throws CertificateException {
			}

			@Override
			public X509Certificate[] getAcceptedIssuers() {
				return null;
			}
		};

		sc.init(null, new TrustManager[] { trustManager }, null);
		return sc;
	}


}
