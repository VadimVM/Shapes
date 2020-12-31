package Task1.Models;

import Task1.Core.Shape;

import java.util.Locale;

public class Trapeze extends Shape {
    private final double height;
    private final double base;
    private final double side;

    public Trapeze(double height, double base, double side) {
        this.height = height;
        this.base = base;
        this.side = side;
    }

    public double getBase() {
        return base;
    }

    @Override
    protected String getName() {
        return "трапеция";
    }

    @Override
    protected void draw() {
        //TrapezeDraw;

    }

    @Override
    protected double getArea() {
        return Math.round(this.height*this.base*this.side/2*100.00)/100.00;
    }

    @Override
    public String toString() {
        return String.format(Locale.ENGLISH, "%s, площадь: %.2f, основание: %.2f, цвет: %s.",
                this.getName(), this.getArea(), this.getBase(), this.getColor());
    }
}
