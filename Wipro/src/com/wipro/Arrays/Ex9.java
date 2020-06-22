package com.wipro.Arrays;

public class Ex9 {
public static void main(String[] args) {
	int l = args.length;
	int[] r = new int[l];
	  int k = 0;
	  for (int i=0;i<l;i++) 
	  {
        int d = Integer.parseInt(args[i]);
	      if (d!=10)
	      {
	          r[k++]=d;
	      }
	  }
for(int i=0;i<l;i++)
{
	System.out.print(r[i]+" ");
}
}
}