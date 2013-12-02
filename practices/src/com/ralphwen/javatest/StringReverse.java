package com.ralphwen.javatest;

/**
 * @author yadong
 *
 */
public class StringReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(StringReverse.ReverseIt("abc1234"));
	}
	public static String ReverseIt(String source) {
		int len = source.length();
		StringBuffer sb = new StringBuffer(len);
		for(int i = len-1; i>=0; i--){
			sb.append(source.charAt(i));
		}
		return sb.toString();
	}

}