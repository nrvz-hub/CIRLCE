/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Narvaez_Alec;

import java.util.Scanner;



class Circle {
    private double radius;
    public Circle() {
        this.radius = 1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    public double getDiameter() {
        return 2 * radius;
    }
}

public class CircleTest {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Circle defaultCircle = new Circle();
            System.out.println("Default Circle:");
            System.out.println("Radius: " + defaultCircle.getRadius());
            System.out.println("Area: " + defaultCircle.getArea());
            System.out.println("Circumference: " + defaultCircle.getCircumference());
            System.out.println("Diameter: " + defaultCircle.getDiameter());
            System.out.print("\nEnter the radius of the circle: ");
            double userRadius = scanner.nextDouble();
            Circle userCircle = new Circle(userRadius);
            
            System.out.println("\nUser-defined Circle:");
            System.out.println("Radius: " + userCircle.getRadius());
            System.out.println("Area: " + userCircle.getArea());
            System.out.println("Circumference: " + userCircle.getCircumference());
            System.out.println("Diameter: " + userCircle.getDiameter());
            
            System.out.print("\nEnter a new radius for the circle: ");
            double newRadius = scanner.nextDouble();
            userCircle.setRadius(newRadius);
            
            System.out.println("\nUpdated User-defined Circle:");
            System.out.println("Radius: " + userCircle.getRadius());
            System.out.println("Area: " + userCircle.getArea());
            System.out.println("Circumference: " + userCircle.getCircumference());
            System.out.println("Diameter: " + userCircle.getDiameter());
            
            double[] radii = {1.0, 2.5, 4.0, 7.5};
            System.out.println("\nCircle calculations for multiple radii:");
            for (double radius : radii) {
                Circle circle = new Circle(radius);
                System.out.println("For radius: " + radius);
                System.out.println("Area: " + circle.getArea());
                System.out.println("Circumference: " + circle.getCircumference());
                System.out.println();
            }
        }
    }
}