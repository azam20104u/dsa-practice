package gs.fourtyQuestions;

public class MaximumPossibleSum {
    static int maxSum(int[] arr, int k){
        int n = arr.length;
        int curSum = 0;
        for (int i = 0; i<k; i++){
            curSum+=arr[i];
        }
        int max = curSum;
        for (int i = 1; i<=k; i++){
            curSum = curSum - arr[k-i] + arr[n-i];
            max = Math.max(max, curSum);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxSum(new int[]{1,2,3,4,5},2));
        System.out.println(maxSum(new int[]{2,2,2},2));
    }
}
