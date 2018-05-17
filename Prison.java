
/**
 * Created by Lucky on 25.08.2017.
 */
public class Prison {
    public static void main(String[] args) {
        System.out.printf("Bars is/are %d, holes are %d%n", 0, intCountHoles(0));
        System.out.printf("Bars is/are %d, holes are %d%n", 1, intCountHoles(1));
        System.out.printf("Bars is/are %d, holes are %d%n", 7, intCountHoles(7));
        System.out.printf("Bars is/are %d, holes are %d%n", 8, intCountHoles(8));
        System.out.printf("Bars is/are %d, holes are %d%n", 12, intCountHoles(12));
    }

    public static int intCountHoles(int barsQuantity) {
        int holes = 0;
        int addHoles = 0;

        if (barsQuantity == 0)
            return 1;

        if (barsQuantity > 12) {
            throw new IllegalArgumentException(String.format("barsQuantity is %s but it should be no more than 12 inclusive"));
        }

        for (int i = 0; i < barsQuantity; i++) {
            if (i <= 6) {
                addHoles = 2;
            } else if (i > 6) {
                addHoles = 7;
            }
            holes += addHoles;
        }

        return holes;
    }
}
