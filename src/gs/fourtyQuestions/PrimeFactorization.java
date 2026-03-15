package gs.fourtyQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeFactorization {
    /**
     * Return an array containing prime numbers whose product is x
     * Examples:
     * primeFactorization( 6 ) == [2,3]
     * primeFactorization( 5 ) == [5]
     */
    public static ArrayList<Integer> primeFactorization(int x) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 2;
        while (i<=x){
            if (x%i==0){
                result.add(i);
                x=x/i;
            } else i++;
        }
        return result;
    }

    public static void main(String args[]) {

        System.out.println(primeFactorization(6) + " " + primeFactorization(5));
        if (primeFactorization(6).equals(Arrays.asList(2, 3))
                &&
                primeFactorization(5).equals(Arrays.asList(5))
        ) {
            System.out.println("All passed");
        } else {
            System.out.println("Failed");
        }

    }
}
