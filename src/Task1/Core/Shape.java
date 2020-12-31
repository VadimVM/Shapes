package Task1.Core;

import static Task1.Core.CreatorColor.randomColor;

public abstract class Shape {
    protected abstract String getName();

    protected abstract void draw();

    protected abstract double getArea();

    public String getColor() {
        return randomColor().toString();
    }
}
