package gs.fourtyQuestions;

public class SmallestNumber {
    /*
     * public static int FindMin(int a[])
     * Returns the smallest number in array that has been rotated
     * For example - Array {3,4,5,6,1,2} returns 1
     */

    public static int FindMin(int a[]) {
        int l = 0, r=a.length-1;
        while (l<r){
            int m = l+(r-l)/2;
            if (a[m]>a[r]) l=m+1;
            else r=m;
        }
        return a[l];
    }

    public static void main(String args[]) {
        boolean result = true;
        result = result && FindMin(new int[]{3, 4, 5, 6, 1, 2}) == 1;
        result = result && FindMin(new int[]{2, 1}) == 1;
        result = result && FindMin(new int[]{1}) == 1;

        try {
            FindMin(null);
            result = false;
        } catch (Exception e) {
            result = result && true;
        }

        if (result) {
            System.out.println("All tests pass");
        } else {
            System.out.println("There are test failures");
        }
    }
}
