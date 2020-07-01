package com.wipro.ExceptionHandling;
import java.util.Scanner;
public class Ex1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		String str = sc.nextLine();
		
		try {
			int x = Integer.parseInt(str);
			System.out.println("The square value is: " + x * x);
			System.out.println("The work has been done successfully");
		} catch (Exception e) {
			System.out.println("Entered input is not a valid format for an integer.");
			e.printStackTrace();
		}
		
		

	}
}
