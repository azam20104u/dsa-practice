package gs.fourtyQuestions;

import java.util.Arrays;

public class Min_Num_Platforms_Required {
    public static void main(String[] args) {
        int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };//

        int arr1[] = {900, 940};
        int dep1[] = {910, 1200};
        System.out.println(findPlatform(arr, dep));
        System.out.println(findPlatform(arr1, dep1));

        if (findPlatform(arr, dep) == 3 && findPlatform(arr1, dep1) == 1)
            System.out.println("All Tests Pass");
        else
            System.out.println("There are test failures");

    }

    private static int findPlatform(int[] arr, int[] dep) {
        Arrays.sort(arr); Arrays.sort(dep);
        int i = 0, j = 0;
        int platform = 0;
        int maxPlatform = 0;
        while (i<arr.length && j<dep.length){
            if (arr[i]<dep[j]){
                platform++;
                maxPlatform=Math.max(maxPlatform, platform);
                i++;
            }else {
                platform--;
                j++;
            }
        }
        return maxPlatform;
    }
}
