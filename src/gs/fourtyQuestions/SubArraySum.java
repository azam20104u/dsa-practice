package gs.fourtyQuestions;

public class SubArraySum {
    public static int subArrayExceedsSum(int arr[], int target) {
        int left = 0;
        int sum = 0;
        int length = Integer.MAX_VALUE;
        for (int right = 0; right < arr.length; right++) {
            sum+=arr[right];
            while (sum>target){
                length=Math.min(length,right-left+1);
                sum-=arr[left++];
            }
        }
        return length==Integer.MAX_VALUE?-1:length;
    }

    /**
     * Execution entry point.
     */
    public static void main(String[] args) {
        boolean result = true;
        int[] arr = {1, 2, 3, 4};
        result = result && subArrayExceedsSum(arr, 6) == 2;
        result = result && subArrayExceedsSum(arr, 12) == -1;

        if (result) {
            System.out.println("All tests pass\n");
        } else {
            System.out.println("There are test failures\n");
        }
    }
}
