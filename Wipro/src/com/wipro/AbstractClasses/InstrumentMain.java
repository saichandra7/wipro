package com.wipro.AbstractClasses;

abstract class Instrument
{
	abstract void play();
}

class Piano extends Instrument
{
	void play()
	{
		System.out.println("Piano is playing tan tan tan tan");
	}
}

class Flute extends Instrument
{
	void play()
	{
		System.out.println("Flute is playing toot toot toot toot");
	}
}

class Guitar extends Instrument
{
	void play()
	{
		System.out.println("Guitar is playing tin tin tin tin");
	}
}




public class InstrumentMain {
	public static void main(String[] args) {
		Instrument []ins=new Instrument[10];
		for(int i=0;i<3;i++)
		{
			ins[i]=new Piano();
			ins[i].play();
		}
		for(int i=3;i<7;i++)
		{
			ins[i]=new Flute();
			ins[i].play();
		}
		for(int i=7;i<10;i++)
		{
			ins[i]=new Guitar();
			ins[i].play();
		}
		for(int i=0;i<10;i++)
		{
			if(ins[i] instanceof Piano)
			{
				System.out.println(i+" Piano object");
			}
			else if(ins[i] instanceof Flute)
			{
				System.out.println(i+" Flute object");
			}
			else
			{
				System.out.println(i+" Guitar object");
			}
		}
	}
}
