package com.wipro.AbstractClasses;

abstract class GeneralBank
{
	abstract double getSavingInterestRate();
	abstract double getFixedInterestRate();
}

class ICICIBank extends GeneralBank {

	double getSavingInterestRate() {
		return 4.0;
	}

	public double getFixedInterestRate() {
		return 8.5;
	}

}

class KotakBank extends GeneralBank {

	public double getSavingInterestRate() {
		return 6.0;
	}

	public double getFixedInterestRate() {
		return 9.0;
	}

}



public class BankMain {
public static void main(String[] args) {
	ICICIBank icici=new ICICIBank();
	KotakBank kotak=new KotakBank();
	
	System.out.println(icici.getSavingInterestRate());
	System.out.println(icici.getFixedInterestRate());
	System.out.println(kotak.getSavingInterestRate());
	System.out.println(kotak.getFixedInterestRate());
	
	GeneralBank gb1 = new ICICIBank();
	GeneralBank gb2 = new KotakBank();
	
	System.out.println(gb1.getSavingInterestRate());
	System.out.println(gb1.getFixedInterestRate());
	System.out.println(gb2.getSavingInterestRate());
	System.out.println(gb2.getFixedInterestRate());
}
}
