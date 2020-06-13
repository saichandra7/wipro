package com.wipro.FlowControlStatements;

public class Ex4 {
	public static void main(String[] args) {
		String s1=args[0];
		String s2=args[1];
		char c1=s1.charAt(0);
		char c2=s2.charAt(0);
		if(c1<c2)
		{
			System.out.println(c1 + ","+c2);
		}
		else
		{
			System.out.println(c2 + ","+c1);
		}
}
}
