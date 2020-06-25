package com.wipro.Overriding;

class Fruit
{
	private String name;
	private String taste;

	
	Fruit()
	{
		name="Fruit name";
		taste="taste of the fruit";
	}
	void eat()
	{
		System.out.println(name + " tastes like " + taste);
	}
}

class Apple extends Fruit
{
	void eat()
	{
		System.out.println("The fruit tastes like apple");
	}
}

class Orange extends Fruit
{
	void eat()
	{
		System.out.println("The fruit tastes like orange");
	}
}


public class FruitMain {
	public static void main(String[] args) {
		Apple a=new Apple();
		Orange o=new Orange();
		a.eat();
		o.eat();
	}
}
