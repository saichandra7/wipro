package com.wipro.Arrays;
import java.util.Arrays;
public class Ex5 {
public static void main(String[] args) {
	int []a= {7,6,9,11,1,0,55,2,88};
	Arrays.sort(a);
	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[a.length-2]);
	System.out.println(a[a.length-1]);
}
}
