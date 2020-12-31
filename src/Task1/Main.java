package Task1;

import Task1.Core.GeneratorShapes;
import Task1.Core.Shape;
import Task1.Factory.*;

import static Task1.Core.ClassGenerator.GenerateValue;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GeneratorShapes> creators = new ArrayList<>();
        creators.add(new CreateCircle());
        creators.add(new CreateSquare());
        creators.add(new CreateTriangle());
        creators.add(new CreateTrapeze());

        int sizeOfArr = (int) GenerateValue(1, 100);
        Shape[] shapes = new Shape[sizeOfArr];

        for (int i = 0; i < sizeOfArr; ++i) {
            shapes[i] = creators.get((int) GenerateValue(0, creators.size())).create();// [0,4)
            System.out.println("Фигура: " + shapes[i]);
        }
    }
}
