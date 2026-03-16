package gs.fourtyQuestions;
/*

 **                                                           ^
 **                 {{0,0,0,0,5}, New_York (finish)           N
 **                  {0,1,1,1,0},                         < W   E >
 **   So_Cal (start) {2,0,0,0,0}}                             S
*/

//                    {{5,5,5,5,5}, New_York (finish)           N
//**                  {8,8,7,6,5},                         < W   E >
//**   So_Cal (start) {10,8,7,6,5}}
public class OptimalPath {
    public static Integer optimalPath(Integer[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[] prev = new int[n];
        int[] current = new int[n];
        for (int i = 0; i <m; i++) {
            for (int j = n-1; j >=0; j--) {
                current[j]= grid[i][j]+ Math.max(i>0?prev[j]:0, j<n-1?current[j+1]:0);
            }
            prev=current;
        }
        return prev[0];
    }


    public static boolean doTestsPass() {
        boolean result = true;
        result &= optimalPath(new Integer[][]{{0, 0, 0, 0, 5},
                {0, 1, 1, 1, 0},
                {2, 0, 0, 0, 0}}) == 10;
        return result;
    }

    public static void main(String[] args) {
        if (doTestsPass()) {
            System.out.println("All tests pass");
        } else {
            System.out.println("Tests fail.");
        }
    }
}
