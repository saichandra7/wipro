package com.wipro.MultiThreading.ThreadCreation.Question3;

public class SalesPersons extends Thread {
	private String[] names = {"Sai", "Chandra", "Sukhesh", "Ram", "Gopal"};
	
	@Override
	public void run() {		
		for (String name : names) {			
			System.out.println(name);
			try {
				sleep(500);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		
		
	}
}