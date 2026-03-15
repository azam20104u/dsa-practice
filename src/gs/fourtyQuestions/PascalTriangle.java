package gs.fourtyQuestions;

import java.util.HashMap;

public class PascalTriangle {
    static HashMap<String , Integer> cache = new HashMap<>();
    public static int pascal(int col, int row) {
        if (col==0 || col==row) return 1;

        String key = col+","+row;
        if (cache.containsKey(key)) return cache.get(key);

        int value = pascal(col-1,row-1)+pascal(col, row-1);
        cache.put(key,value);
        return value;
    }

    public static void main(String[] args) {
        if (PascalTriangle.pascal(0, 0) == 1 &&
                PascalTriangle.pascal(1, 2) == 2 &&
                PascalTriangle.pascal(5, 6) == 6 &&
                PascalTriangle.pascal(4, 8) == 70 &&
                PascalTriangle.pascal(6, 6) == 1) {
            System.out.println("Pass");
        } else {
            System.out.println("Failed");
        }
    }
}
