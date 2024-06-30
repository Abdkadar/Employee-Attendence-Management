package com.workouts.solidprinciple;

public class OpenClosed {

}

//Before OCP
/* 
class Rectangle {
 public double length;
 public double width;
}

 class AreaCalculator {
 public double calculateRectangleArea(Rectangle rectangle) {
     return rectangle.length * rectangle.width;
 }
}
*/

//After OCP
interface Shape {
	double calculateArea();
}

class Rectangle implements Shape {
	public double length;
	public double width;

	@Override
	public double calculateArea() {
		return length * width;
	}
}

class Circle implements Shape {
	public double radius;

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
}

class AreaCalculator {
	public double calculateArea(Shape shape) {
		return shape.calculateArea();
	}
}
