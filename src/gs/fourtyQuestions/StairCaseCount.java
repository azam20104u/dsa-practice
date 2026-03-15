package gs.fourtyQuestions;

public class StairCaseCount {
    public static Integer countSteps(Integer n) {
        if (n==0) return  1;
        if (n==1) return  1;
        if (n==2) return  2;
        int a = 1, b = 1, c = 2;
        for (int i = 3; i <= n ; i++) {
            int d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return c;
    }


    public static boolean doTestsPass() {
        return countSteps(3) == 4
                && countSteps(4) == 7;
    }

    public static void main(String[] args) {
        if (doTestsPass()) {
            System.out.println("All tests pass");
        } else {
            System.out.println("Tests fail.");
        }

        for (Integer n = 1; n <= 5; n++) {
            Integer numberOfCombinations = countSteps(n);
            System.out.println(n + " steps => " + numberOfCombinations);
        }
    }
}
