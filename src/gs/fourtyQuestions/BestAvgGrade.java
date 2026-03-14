package gs.fourtyQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BestAvgGrade {
    public static Integer bestAvgGrade(String[][] scores) {
        HashMap<String, int[]> map = new HashMap<>();
        for (int i = 0; i < scores.length; i++) {
            map.putIfAbsent(scores[i][0], new int[]{0,0});
            int[] arr = map.get(scores[i][0]);
            arr[0]+=Integer.parseInt(scores[i][1]);
            arr[1]++;
        }
        int maxAvgGrade = 0;
        for (int[] values: map.values()){
            maxAvgGrade=Math.max(maxAvgGrade, values[0]/values[1]);
        }
        return maxAvgGrade;
    }

    public static boolean pass() {
        String[][] s1 = {{"Rohan", "84"},
                {"Sachin", "102"},
                {"Ishan", "55"},
                {"Sachin", "18"}};

        return bestAvgGrade(s1) == 84;
    }

    public static void main(String[] args) {
        if (pass()) {
            System.out.println("Pass");
        } else {
            System.out.println("Some Fail");
        }
    }
}
