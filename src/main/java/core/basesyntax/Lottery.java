package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private static final Random random = new Random();
    private static final ColorSupplier color = new ColorSupplier();

    public Ball getRandomBall() {
        int value = random.nextInt(MAX_NUMBER);
        return new Ball(color.getRandomColor(), value);
    }
}
