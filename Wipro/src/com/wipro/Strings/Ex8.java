package com.wipro.Strings;

public class Ex8 {
	public static String withoutStar(String str) {
		  int n=0;
		  while(n<str.length()) {
			  if(str.substring(n,n+1).equals("*")) {
				  return str.substring(0,n)+str.substring(n+1);
			  }
			  n++;
		  }
		  return str;
		}
	public static void main(String[] args) {
		String s="ab*cd";
		System.out.println(withoutStar(s));
	}

}
