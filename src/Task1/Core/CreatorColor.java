package Task1.Core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum CreatorColor {
красный, оранжевый, желтый, зеленый, голубой, синий, фиолетовый;

    private static final List<CreatorColor> values =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = values.size();
    private static final Random random = new Random();

    public static CreatorColor randomColor()  {
        return values.get(random.nextInt(SIZE));
    }
}
