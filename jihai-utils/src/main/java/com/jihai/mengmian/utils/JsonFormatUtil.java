package com.jihai.mengmian.utils;

import java.util.HashMap;
import java.util.Map;

//import org.json.JSONArray;
//import org.json.JSONObject;


public class JsonFormatUtil {
	
	/**
	 * 因为json格式要按照顺序输出
	 * 故 这里便用Stringbuffer实现啦
	 * @return
	 */
	public static String getJsonString(String[] strAry){
		//JSONObject jsonObject = new JSONObject();
		JsonFormatStr jsonStr = new JsonFormatStr().start();
		for (int i = 0; i < strAry.length; i++) {
			String pstr = strAry[i];
			String[] split = pstr.split(":");
			String key = split[0];
			String value = split[1];
			//jsonObject.put(key, value);
			if(i< strAry.length-1)
				jsonStr.append(key, value, false);
			else
				jsonStr.append(key, value, true);	

		}
		return jsonStr.end().toString();
	}
	
	public static Map<String, String> getHeaderMap(String jsonStr){
		Map<String, String> headers = new HashMap<String, String>();
		String str1 = jsonStr.substring(1, jsonStr.length()-1);
		String[] split = str1.split(",");
		for (int i = 0; i < split.length; i++) {
			String str2 = split[i];
			String[] split2 = str2.split(":");
			String key = split2[0];
			String value = split2[1];
			headers.put(key.substring(1, key.length()-1), value.substring(1, value.length()-1));
		}
		return headers;
	}
	
	public static String getFailJson(String errmsg){
		return JsonFormatUtil.getJsonString(new String[]{"success:false","errmsg:"+errmsg});
	}
	public static String getSuccessJson(){
		return JsonFormatUtil.getJsonString(new String[]{"success:true"});
	}
	
	


}
