package com.example.javafx_1;

public class Circle{
    private double radius;
    private static int numberOfObject;

    public Circle() {
        radius = 1;
        numberOfObject++;
    }

    public Circle(double newRadius) throws IllegalArgumentException {
        if (newRadius >= 0) {
            radius = newRadius;
            numberOfObject++;
        } else {
            throw new IllegalArgumentException(" Radius cannot be negative !!");
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws IllegalArgumentException {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException(" Radius cannot be negative !!");
        }
    }

    public static int getNumberOfObject() {
        return numberOfObject;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public void printCircle() {
        System.out.print("The Circle Radius is " + radius);
    }

    public String toString() {
        return super.toString() + " Radius = " + radius;
    }
}
