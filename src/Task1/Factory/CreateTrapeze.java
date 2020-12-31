package Task1.Factory;

import Task1.Core.GeneratorShapes;
import Task1.Core.Shape;
import Task1.Models.Trapeze;

public class CreateTrapeze implements GeneratorShapes {
    @Override
    public Shape create() {
        return new Trapeze(Math.random()*50d, Math.random()*50d, Math.random()*50d);
    }
}
