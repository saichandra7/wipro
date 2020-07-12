package com.wipro.Strings;

public class Ex7 {
	public static String withoutX(String str) {
		  if(str.length()<2){
		    return "";
		  }
		  if(str.substring(0,1).equals("x") && str.substring(str.length()-1).equals("x")){
		    return str.substring(1,str.length()-1);
		  }
		  if(str.substring(0,1).equals("x")){
		    return str.substring(1);
		  }
		  if(str.substring(str.length()-1).equals("x")){
		    return str.substring(0,str.length()-1);
		  }
		  return str;
		}
	public static void main(String[] args) {
		String s="xhix";
		String s1="hello";
		System.out.println(withoutX(s));
		System.out.println(withoutX(s1));
	}

}
