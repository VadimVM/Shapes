package Task1.Models;

import Task1.Core.Shape;

import java.util.Locale;

public class Square extends Shape {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    protected String getName() {
        return "квадрат";
    }

    @Override
    protected void draw() {
        // Square draw
    }

    public double getSide() {
        return side;
    }

    @Override
    protected double getArea() {
        return Math.round(this.side*this.side*100.00)/100.00;
    }

    @Override
    public String toString() {
        return String.format(Locale.ENGLISH, "%s, площадь: %.2f, сторона: %.2f, цвет: %s.",
                this.getName(), this.getArea(), this.getSide(), this.getColor());
    }
}
