package gs.fourtyQuestions;

public class MaxSumSubArray {
    static int maxSumSubArr(int[] arr){
        int max = arr[0];
        int cur = arr[0];
        for (int i = 1; i < arr.length; i++) {
            cur = Math.max(arr[i], cur+arr[i]);
            max = Math.max(cur, max);
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(maxSumSubArr(new int[]{2, 3, -8, 7, -1, 2, 3}));
    }
}
