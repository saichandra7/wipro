package com.wipro.Arrays;

public class Ex10 {
public static void main(String[] args) {
    int l = args.length;
    int e=0,o=l-1;
    int[] evenodd = new int[l];
     for(int i=0;i<l;i++)
    {
	      int d = Integer.parseInt(args[i]);
	      if(d%2==0)
	      {
	    	  evenodd[e++]=d;
	      }
	      else
	      {
	    	  evenodd[o--]=d;
	      }
   }
     for(int i=0;i<l;i++)
     {
    	 System.out.print(evenodd[i]+" ");
     }
}
}
