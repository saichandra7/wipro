package com.wipro.Arrays;
import java.util.Arrays;
public class Ex6 {
public static void main(String[] args) {
	int []a= {10,90,87,21,27,55,81,45};
	Arrays.parallelSort(a);
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
}
}
