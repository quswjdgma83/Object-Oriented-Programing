package test;

public class RandomUtil {
    public static int randIntInRange(int lower, int upper) {
        int num = ((int) (Math.random() * Integer.MAX_VALUE) % (upper - lower + 1)) + lower; return num;
    }
}
