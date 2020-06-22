package com.wipro.Arrays;

public class Ex13 {
public static void main(String[] args) {
	int n = args.length;
	int c=0,s=0,m=n/2;
	int[][] a = new int[m][m];
	System.out.println("The given array is :");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<m;j++)
		{
			c++;
			if(c<=n)
			a[i][j]=Integer.parseInt(args[s++]);
			
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("The reverse of the array is :");
		for(int i=m-1;i>=0;i--)
		{
			for(int j=m-1;j>=0;j--)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			
			}
	
	
}
}
