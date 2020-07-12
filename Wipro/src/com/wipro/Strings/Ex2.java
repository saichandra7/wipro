package com.wipro.Strings;

public class Ex2 {
	public static String conCat(String a, String b) {
		  if((a.length()>0 && b.length()>0) && 
             (a.substring(a.length()-1).equals(b.substring(0,1)))){
		    return a+b.substring(1);
		  }
		  return a.concat(b);
		}

	public static void main(String[] args) {
		String str=String.valueOf(args[0]);
		String str2=String.valueOf(args[1]);
		System.out.println(conCat(str,str2));
	}

}
