package com.wipro.FlowControlStatements;

public class Ex6 {
	public static void main(String args[])
	  {
		  String gender=args[0];
		  int age=Integer.parseInt(args[1]);
		  if(gender.equalsIgnoreCase("Female"))
		  {
			  if(age>=1&&age<=58) {
				  System.out.println("percentage of interest is 8.2%");
			  }
			  if(age>=59&&age<=100) {
				  System.out.println("percentage of interest is 9.2%");
			  }
			  
		  }
		  else {
			  if(age>=1&&age<=58) {
				  System.out.println("percentage of interest is 8.4%");
			  }
			  if(age>=59&&age<=100) {
				  System.out.println("percentage of interest is 10.5%");
			  }
		  }
			  
		  
	  }
}
