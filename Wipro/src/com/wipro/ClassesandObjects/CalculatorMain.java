package com.wipro.ClassesandObjects;

class Calculator
{
	 static double powerInt(int num1,int num2)
	    {
	        return Math.pow(num1,num2);
	    }
	static double powerDouble(double num1,int num2)
	{
	    return Math.pow(num1,num2);
	}
}
public class CalculatorMain {
	public static void main(String[] args) {
		System.out.println(Calculator.powerDouble(85.0, 2));
	    System.out.println(Calculator.powerInt(85,3));
	}
	
}
