import static java.lang.Math.floor;

public class Multiples {
    public static void main(String[] args) {
        clever();
        naive();
    }

    private static void clever() {
        int upperBound = 1000;
        int multiplesOfThree = (int) floor(upperBound / 3.0);
        int multiplesOfFive = (int) floor(upperBound / 5.0);
        int multiplesOfBoth = (int) floor(upperBound / 15.0);

        System.out.println(multiplesOfThree + multiplesOfFive - multiplesOfBoth);
    }

    private static void naive() {
        int upperBound = 1000;
        int count = 0;

        for (int i = 1; i <= upperBound; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
