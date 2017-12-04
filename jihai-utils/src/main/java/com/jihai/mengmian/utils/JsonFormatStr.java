package com.jihai.mengmian.utils;
/**
 * 实现输入先后顺序的json字符串格式
 * @author kevinchen
 *
 */
public class JsonFormatStr {
	
	private StringBuffer sb ;
	
	public JsonFormatStr() {
		sb = new StringBuffer();
	}
	
	public JsonFormatStr start(){
		sb.append("{");
		return this;
	}
	
	public JsonFormatStr append(String str, boolean isField){
		if(isField){
			sb.append("\"").append(str).append("\"");
		}else{
			sb.append(str);
		}
		return this;
	}
	
	public JsonFormatStr append(String key, String value, boolean isEnd){
		sb.append("\"").append(key).append("\"")
		.append(":").append("\"").append(value).append("\"");
		if(!isEnd){
			sb.append(",");
		}
		return this;
	}
	
	public JsonFormatStr end(){
		sb.append("}");
		return this;
	}
	
	public String toString(){
		return sb.toString();
	}

}


