package com.wipro.Arrays;

public class Ex3 {
public static void main(String[] args) {
	int []a= {10,20,30,40,50,7};
	int flag=0;
	int key=Integer.parseInt(args[0]);
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==key)
		{
			flag=1;
			System.out.println(i);
		}
	}
	if(flag==0)
	{
		System.out.println("-1");
	}
	
}
}
