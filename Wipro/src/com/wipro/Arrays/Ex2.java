package com.wipro.Arrays;

public class Ex2 {
public static void main(String[] args) {
	int []a= {10,20,30,7,40,50};
	int max=a[0],min=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	for(int i=0;i<a.length;i++)
	{
		if(a[i]<min)
		{
			min=a[i];
		}
	}
	System.out.println(max);
	System.out.println(min);
}
}
