package com.wipro.Arrays;

public class Ex12 {
public static void main(String[] args) {
	int l = args.length;
	int[] a = new int[l/2];
	int[] b = new int[l/2];
	int[] c = new int[((l/2)/2)+1];
	int l1 = 0;
	int l2=(l/2);
	for(int i=0;i<l/2;i++)
	{
		a[i]=Integer.parseInt(args[l1++]);
		b[i]=Integer.parseInt(args[l2++]);
	}
    c[0]=a[1];
    c[1]=b[1];
    for(int i : c)
    {
    	System.out.print(i+" ");
    }
}
}
