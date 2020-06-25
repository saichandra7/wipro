package com.wipro.Overriding;

class Shape
{
	void draw()
	{
		System.out.println("Drawing");
	}
	
	void erase()
	{
		System.out.println("Erasing");
	}
}

class Circle extends Shape
{
	 void draw()
	{
		System.out.println("Drawing Circle");
	}
	void erase()
	{
		System.out.println("Erasing Circle");
	}
}

class Triangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Triangle");
	}
	void erase()
	{
		System.out.println("Erasing Triangle");
	}
}

class Square extends Shape
{
	void draw()
	{
		System.out.println("Drawing Square");
	}
	void erase()
	{
		System.out.println("Erasing Square");
	}
}


public class ShapeMain {
	public static void main(String[] args) {
		Circle c=new Circle();
		c.draw();
		c.erase();
		Triangle t=new Triangle();
		t.draw();
		t.erase();
		Square s=new Square();
		s.draw();
		s.erase();
	}
}
