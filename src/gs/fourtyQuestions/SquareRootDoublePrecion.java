package gs.fourtyQuestions;

public class SquareRootDoublePrecion {
    /*
     *   double squareRoot( double x )
     *
     */

    public static double squareRoot(double x) {
        double left = 0;
        double right = x;
        double precision = 0.00001;
        while (right-left>precision){
            double mid = (right+left)/2;
            if (mid*mid>x){
                right=mid;
            } else {
                left=mid;
            }
        }
        return (left+right)/2;
    }

    public static void main(String args[]) {
        double[] inputs = {2, 4, 100};
        double[] expected_values = {1.41421, 2, 10};
        double threshold = 0.001;
        for (int i = 0; i < inputs.length; i++) {
            if (Math.abs(squareRoot(inputs[i]) - expected_values[i]) > threshold) {
                System.out.printf("Test failed for %f, expected=%f, actual=%f\n", inputs[i], expected_values[i], squareRoot(inputs[i]));
            }
        }
        System.out.println("All tests passed");
    }
}
