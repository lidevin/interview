package cn.lwy.utils;

import java.util.UUID;

public class CommonUtils {

	public static String getId10() {
		return UUID.randomUUID().toString().replaceAll("-", "").substring(0, 10);
	}
}
