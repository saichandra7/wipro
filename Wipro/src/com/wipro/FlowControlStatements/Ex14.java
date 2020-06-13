package com.wipro.FlowControlStatements;

public class Ex14 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int rem=0,sum=0;
		while(n!=0)
		{
			rem=n%10;
			n=n/10;
			sum=sum+rem;
		}
		System.out.println(sum);
	}
}
