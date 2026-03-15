package gs.fourtyQuestions;

public class AddFractions {
    /**
     * Given two fractions passed in as int arrays,
     * returns the fraction which is result of adding the two input fractions.
     */
    public static int[] addFractions(int[] fraction1, int[] fraction2) {
        int a = fraction1[0];
        int b = fraction1[1];
        int c = fraction2[0];
        int d = fraction2[1];
        int numerator = a*d + c*b;
        int denominator = b*d;
        return (new int[]{numerator, denominator});
    }


    public static void main(String[] args) {
        int[] result = addFractions(new int[]{2, 3}, new int[]{1, 2});

        if (result[0] == 7 && result[1] == 6) {
            System.out.println("Test passed.");
        } else {
            System.out.println("Test failed.");
        }
    }
}
