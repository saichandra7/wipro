package com.wipro.AbstractClasses;

import java.util.Random;

abstract class Compartment
{
	abstract String notice();
}

class FirstClass extends Compartment
{
	String notice()
	{
		return "This is First class compartment";
	}
}

class Ladies extends Compartment
{
	String notice()
	{
		return "This is First Ladies compartment";
	}
}

class General extends Compartment
{
	String notice()
	{
		return "This is General compartment";
	}
}

class Luggage extends Compartment
{
	String notice()
	{
		return "This is Luggage compartment";
	}
}


public class TestCompartment {
	public static void main(String[] args) {
		Compartment []c=new Compartment[10];
		Random rand=new Random();
		for(int i=0;i<10;i++)
		{
			int randomNumber=rand.nextInt(4)+1;
			System.out.println(randomNumber);
			if(randomNumber==1)
				c[i]=new FirstClass();
			if(randomNumber==2)
				c[i]=new Ladies();
			if(randomNumber==3)
				c[i]=new General();
			if(randomNumber==4)
				c[i]=new Luggage();
			
			System.out.println(c[i].notice());
			
		}
		
	}
}
