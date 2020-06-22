package com.wipro.Arrays;

public class Ex8 {
public static void main(String[] args) {
	 int sum = 0,x=6,y=7;
	  boolean flag = false;
      for(String i : args){
    	  int d = Integer.parseInt(i);
          if(d==x){
              flag=true;
          }
          if(flag==true){
              if(d==y){
                  flag=false;
              }
              continue;
          }
          else{
              if(d==y){
                  sum+=x+d;
              }
              else
                  sum+=d ;
          }
      }
      System.out.println("sum is "+sum);
}
}
