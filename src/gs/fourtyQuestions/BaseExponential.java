package gs.fourtyQuestions;

public class BaseExponential {
    static double power(int base, int exp){
        if (exp==0) return 1;

        if (exp<0) return 1;

        double half =  power(base,exp/2);

        if (exp%2==0) return half*half;
        else return base*half*half;
    }
}
