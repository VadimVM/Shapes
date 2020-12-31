package Task1.Factory;

import Task1.Core.GeneratorShapes;
import Task1.Models.Square;
import Task1.Core.Shape;

public class CreateSquare implements GeneratorShapes {
    @Override
    public Shape create() {
        return new Square(Math.random()*50d);
    }
}
