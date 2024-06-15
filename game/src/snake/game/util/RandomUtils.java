package snake.game.util;

@SuppressWarnings("ALL")
public final class RandomUtils {

    private RandomUtils() {
        throw new UnsupportedOperationException();
    }

    public static int random(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
