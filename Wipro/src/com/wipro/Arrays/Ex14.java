package com.wipro.Arrays;

public class Ex14 {
public static void main(String[] args) {
      int n = args.length;
      if(n!=9)
      {
    	  System.out.println("Please enter 9 integer numbers");
      }
      else {
      int s=0,c=0,m=n/3;
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
      int max = a[0][0];
      for(int i=0;i<m;i++)
      {
    	  for(int j=0;j<m;j++)
    	  {
    		  if(a[i][j]>max)
    		  {
    			  max = a[i][j];
    		  }
    	  }
    }
      System.out.println("The biggest number in the given array is :"+max);
}
}
}
