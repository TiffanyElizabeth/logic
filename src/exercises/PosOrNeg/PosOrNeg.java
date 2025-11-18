package exercises.PosOrNeg;

public class PosOrNeg {
    public static String PositiveOrNegative(int x) {
        if (x > 0) {
            return "positive";
        } else if (x < 0) {
            return "negative";
        } else if (x == 0) {
            return "zero";
        } else {
            return "invalid";
        }
    }
}
