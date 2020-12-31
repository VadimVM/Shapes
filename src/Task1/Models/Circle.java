package Task1.Models;

import Task1.Core.Shape;

import java.util.Locale;

public class Circle extends Shape {
    private double radius;
    private final double pi = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "круг";
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public void draw() {
        // Circle draw;

    }

    @Override
    public double getArea() {
        return pi * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return String.format(Locale.ENGLISH, "%s, площадь: %.2f, радиус: %.2f, цвет: %s.",
                this.getName(), this.getArea(), this.getRadius(), this.getColor());
    }
}
