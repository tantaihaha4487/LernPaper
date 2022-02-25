package LernPaper.tantaihaha.engine;

import java.util.Random;
import java.util.Vector;

public class RandomLocation {

    public static double RandomDouble() {
        double a = 0.0D;
        int move = new Random().nextInt(999);
        String s = "0";
        if (move != 0) {
            s = "0." + move;
        }

        if (new Random().nextBoolean()) {
            a = Double.parseDouble(s);
        } else {
            a = Double.parseDouble("-" + s);
        }

        return a;
    }
}
