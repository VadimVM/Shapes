package Task1.Factory;

import Task1.Core.GeneratorShapes;
import Task1.Models.Triangle;
import Task1.Core.Shape;

public class CreateTriangle implements GeneratorShapes {
    @Override
    public Shape create() {
        return new Triangle(Math.random()*50d, Math.random()*50d);
    }
}
