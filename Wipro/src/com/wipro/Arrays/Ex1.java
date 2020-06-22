package com.wipro.Arrays;

public class Ex1 {
public static void main(String[] args) {
	int sum=0,avg=0;
	int []a= {10,20,30,40,50};
	for(int i=0;i<a.length;i++)
	{
		sum=sum+a[i];
	}
	System.out.println(sum);
	avg=sum/(a.length);
	System.out.println(avg);
}
}
