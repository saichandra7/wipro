package com.wipro.MultiThreading.ThreadCreation.Question3;

public class Main {
	
	public static void main(String[] args) {				
		Days days = new Days();
		Thread t1 = new Thread(days);
		t1.start();		
	}
}
