package com.wipro.MultiThreading.ThreadCreation.Question3;

public class Days extends Thread {
	private String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	
	@Override
	public void run() {
		SalesPersons salesPersons = new SalesPersons();
		salesPersons.start();
		
		for (String day : days) {
			System.out.println(day);
			try {
				sleep(500);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			
			if (day.equals("Sunday")) {
				System.out.println("Suspending...");
				salesPersons.suspend();
				try {
					sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} 
			
			if (day.equals("Wednesday")) {
				System.out.println("Resuming...");
				salesPersons.resume();
			}
		}
		
		
	}
}
