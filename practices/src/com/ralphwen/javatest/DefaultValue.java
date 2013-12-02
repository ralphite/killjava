/**
 * 
 */
package com.ralphwen.javatest;

import org.junit.*;
import org.junit.Assert.*;
/**
 * @author yadong
 *
 */
public class DefaultValue {
	
	private final int fi;
	static String h = "asdasd";
	/**
	 * 
	 */
	public DefaultValue() {
		// TODO Auto-generated constructor stub
		this.fi = 3;
		int d;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(DefaultValue.h);
		System.out.println((new DefaultValue()).fi);
	}


}
