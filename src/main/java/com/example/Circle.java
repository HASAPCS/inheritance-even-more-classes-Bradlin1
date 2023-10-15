package com.example;

public class Circle extends Shape {
    
    private double radius;
    // TODO: Define attributes for the circle
    
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double area() {
        // TODO: Implement the method
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double perimeter() {
        // Implement the method to calculate the perimeter (circumference) of the circle
        return 2 * Math.PI * radius;
    }

}