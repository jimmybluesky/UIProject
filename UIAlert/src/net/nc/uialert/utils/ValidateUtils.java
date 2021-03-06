package net.nc.uialert.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 类名：ValidateUtils<br>
 * 类描述：匹配工具<br>
 * 创建人：howtoplay<br>
 */
public class ValidateUtils {
	
	/**
	 * 匹配手机号码是否正确
	 * 添加者：howtoplay
	 * @param phone 输入的号码
	 * @return
	 * boolean
	 */
	public static boolean isMobile(String phone) {
		return matches("[1][34578]\\d{9}", phone);
	}
	
	public static boolean isEmail(String email) {
		if (email.length() < 6) {
			return false;
		}
		return matches(
				"^([a-z0-9A-Z]+[-|\\.|_]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$",
				email);
	}

	/**
	 * 匹配正则
	 * 添加者：howtoplay
	 * @param regex 正则表达式
	 * @param input 输入的内容
	 * @return
	 * boolean
	 */
	private static boolean matches(String regex, String input) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		return matcher.matches();
	}

}
