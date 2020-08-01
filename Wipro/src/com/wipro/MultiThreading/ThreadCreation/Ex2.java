package com.wipro.MultiThreading.ThreadCreation;

import java.util.Random;

public class Ex2 implements Runnable {

	public static void main(String[] args) {
		Ex2 ex2 = new Ex2();
		Thread t1 = new Thread(ex2);
		t1.start();
	}

	@Override
	public void run() {
		Random random = new Random();
		String colours[] = {"white", "blue", "black", "green", "red", "yellow"};
		int index;
		
		while ((index = random.nextInt(6)) != 4) {
			System.out.println(colours[index]);
		}		
	}

}
