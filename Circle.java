/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baingay21;

/**
 *
 * @author nguen
 */
public class Circle {
    private double radius;
    private String color;
    
    public circle () {
        this.radius= 1.0;
        this.color="red";
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}
public class Circle {
    public static void main(String[] args) {

        Circle c1 = new Circle();

        c1.setRadius(5.5);
        c1.setColor("blue");

        System.out.println(c1.toString());
        System.out.println("Area: " + c1.getArea());
    }
}
