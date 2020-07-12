package com.wipro.Strings;

public class Ex5 {
	public static String firstLast(String s) {
		return s.substring(1,s.length()-1);
	}
	public static void main(String[] args) {
		String s="Suman";
		System.out.println(firstLast(s));
	}

}
