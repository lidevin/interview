package cn.lwy.utils;

import java.util.UUID;

public class CommonUtils {

	/**
	 * 获取10位的id
	 */
	public static String getId10() {
		return UUID.randomUUID().toString().replaceAll("-", "").substring(0, 10);
	}
	
	/**
	 * 数组转成字符串
	 * @param arr  数组
	 */
	public static String arrToString(String[] arr) {
		if(arr == null) {
			return null;
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0, len=arr.length; i < len; i++) {
			sb.append(arr[i]);
		}
		return sb.toString();
	}
}
