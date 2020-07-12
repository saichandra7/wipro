package com.wipro.Strings;

public class Ex9 {
	public static void main(String[] args) {
		String a="Hello";
		String b="World";
		for(int i=0;i<a.length() || i<b.length();i++) {
			if(i<a.length()) {
				System.out.print(a.charAt(i));
			}
			if(i<b.length()) {
				System.out.print(b.charAt(i));
			}
		}
	}

}
