package gs.fourtyQuestions;

public class SnowPackOrTrappingWater {
    /*
     **  Find the amount of snow that could be captured.
     */
    public static Integer computeSnowpack(Integer[] arr) {// TC = n , SC = n
        int l=0, r=arr.length-1, lmax = 0, rmax=0, snow=0;
        while (l<r){
            lmax=Math.max(lmax,arr[l]);
            rmax=Math.max(rmax,arr[r]);
            if (lmax<rmax){
                snow+=lmax-arr[l++];
            } else {
                snow+=rmax-arr[r--];
            }
        }
        return snow;
    }

    /*
     **  Returns true if the tests pass. Otherwise, returns false;
     */
    public static boolean doTestsPass() {
        boolean result = true;
        result &= computeSnowpack(new Integer[]{0, 1, 3, 0, 1, 2, 0, 4, 2, 0, 3, 0}) == 13;

        return result;
    }

    /*
     **  Execution entry point.
     */
    public static void main(String[] args) {
        if (doTestsPass()) {
            System.out.println("All tests pass");
        } else {
            System.out.println("Tests fail.");
        }
    }
}
