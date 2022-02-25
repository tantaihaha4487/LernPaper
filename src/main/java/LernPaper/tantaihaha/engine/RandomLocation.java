package LernPaper.tantaihaha.engine;

import java.util.Random;
import java.util.Vector;

public class RandomLocation {
    private static Random rand;
    private static Vector vector;
    private static double x;
    private static double y;
    private static double z;

    public RandomLocation() {
        rand = new Random();
    }
    public static double RandomDouble() {
        double a = 0.0D;
        int move = rand.nextInt(999);
        String s = "0";
        if (move != 0) {
            s = "0." + move;
        }

        if (rand.nextBoolean()) {
            a = Double.parseDouble(s);
        } else {
            a = Double.parseDouble("-" + s);
        }

        return a;
    }
}
