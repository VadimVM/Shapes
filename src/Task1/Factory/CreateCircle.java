package Task1.Factory;

import Task1.Core.GeneratorShapes;
import Task1.Models.Circle;
import Task1.Core.Shape;

public class CreateCircle implements GeneratorShapes {
    @Override
    public Shape create() {
        return new Circle(Math.random()*50d);
    }
}
