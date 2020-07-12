package com.wipro.Strings;

public class Ex6 {
	public static String comboString(String a, String b) {
		  if(a.length()<b.length()){
		    return a+b+a;
		  }
		  return b+a+b;
		}

	public static void main(String[] args) {
		String a="hi";
		String b="hello";
		System.out.println(comboString(a,b));
	}

}
