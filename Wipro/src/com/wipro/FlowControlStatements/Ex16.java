package com.wipro.FlowControlStatements;

public class Ex16 {
public static void main(String[] args) {
	int n=Integer.parseInt(args[0]);
	int rem=0;
	while(n!=0)
	{
		rem=n%10;
		System.out.print(rem);
		n=n/10;
	}
}
}
