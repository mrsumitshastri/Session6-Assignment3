package com.Session6.Assignment3;

public class MainClass {
	/*
	 * Calculate an area of different shapes .Create an interface Shape and define all the methods that different types of Shape objects 
	 * will implement.For simplicity purpose, you can keep only two methods draw() to draw the shape and getArea() that will return the area of the shape
	 * 
	 */

	public static void main(String[] args) {
		
		Rectangle rect = new Rectangle(10,5);
		rect.draw();
		System.out.println("Area of Rectangle "+rect.getArea());
		
		Triangle tri = new Triangle(5,5,5);
		tri.draw();
		System.out.println("Area of Triangle "+tri.getArea());
		
		Circle cir = new Circle(5);
		cir.draw();
		System.out.println("Area of Circle "+cir.getArea());
	}
}



interface Shape
{
	public void draw();
	public double getArea();	
}


class Rectangle implements Shape
{
	double height;
	double width;
	
	public Rectangle(double height ,double width )
	{
	  this.height = height;
	  this.width = width;
	}

	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Rectangle");
	}

	public double getArea() {
		// TODO Auto-generated method stub
		return height*width;
	}
	
}

class Triangle implements Shape
{
	double side1;
	double side2;
	double side3;
	
	public Triangle(double side1 ,double side2, double side3 )
	{
	  this.side1 = side1;
	  this.side2 = side2;
	  this.side3 = side3;
	}
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Triangle");
	}

	public double getArea() {
		// TODO Auto-generated method stub
		double p = (this.side1+this.side2+this.side3)/2;
		return Math.pow(p*(p-this.side1)*(p-this.side2)*(p-this.side3), 0.5);
	}
	
}



class Circle implements Shape
{

	double redius;
	
	public Circle(double redius)
	{
		this.redius = redius;
	}

	public double getArea() {
		// TODO Auto-generated method stub
		return 3.14*redius*redius;
	}

	public void draw() {
		System.out.println("Drawing Circle");
		// TODO Auto-generated method stub
		
	}
	
}