package com.ralphwen.javatest;

public class StringComparison {

	public StringComparison() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "a";
		String s2 = "a";
		String s3 = new String("a");
		// equals compare the content
		System.out.println("s1.equals(s2)\t" + s1.equals(s2));
		System.out.println("s2.equals(s3)\t" + s2.equals(s3));
		System.out.println("s1.equals(s3)\t" + s1.equals(s3));
		
		System.out.print("s1==s2\t\t");
		System.out.println(s1==s2);
		System.out.print("s2==s3\t\t");
		System.out.println(s3==s2);
		System.out.print("s1==s3\t\t");
		System.out.println(s1==s3);
	}

}
