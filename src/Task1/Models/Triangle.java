package Task1.Models;

import Task1.Core.Shape;

import java.util.Locale;

/**
 * В рамках данной задачи треугольник прямоугольный.
 * В противном случае мы бы создали  абстрактный класс Triangle
 * и для импллементации необходимых наследников(равнобедренный, прямоугольный и т.д.)
 * расширяли б этот класс
 */

public class Triangle extends Shape {
    private final double leg1;
    private final double leg2;

    public Triangle(double leg1, double leg2) {
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    public double getHypotenuse() {
        return Math.round(Math.sqrt(this.leg1 * this.leg1 + this.leg2 * this.leg2) * 100.00) / 100.00;
    }

    @Override
    public String getName() {
        return "треугольник";
    }

    @Override
    public void draw() {
        //triangle draw

    }

    @Override
    public double getArea() {
        return leg1 * leg2;
    }

    @Override
    public String toString() {
        return String.format(Locale.ENGLISH, "%s, площадь: %.2f, гипотенуза: %.2f, цвет: %s.",
                this.getName(), this.getArea(), this.getHypotenuse(), this.getColor());
    }
}
