package com.wipro.Arrays;

import java.util.Arrays;
class Ex7
{    
	static int removeDuplicates(int a[], int n) 
    { 
        if (n == 0 || n == 1) 
            return n; 
        int j = 0; 
       
        for (int i = 0; i < n-1; i++) 
            if (a[i] != a[i+1]) 
                a[j++] = a[i]; 
       
        a[j++] = a[n-1]; 
       
        return j; 
    } 
    public static void main(String[] args) 
    { 
	
    	int []a= {10,20,10,5,20,5};
		int n=a.length;
		Arrays.sort(a);
		n = removeDuplicates(a, n); 
        for (int i=0; i<n; i++) 
           System.out.print(a[i]+" "); 
   }
}