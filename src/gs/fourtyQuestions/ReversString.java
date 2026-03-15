package gs.fourtyQuestions;

public class ReversString {
    /**
     * public static String reverseStr( String str )
     * Example: reverseStr(str) where str is "abcd" returns "dcba".
     */
    public static String reverseStr(String str) {
        //your code goes here
        //ther will be some soultion with defect that would need to be identified
        if (str == null) {
            return null;
        }
        char[] arr = str.toCharArray();
        int l = 0, r = arr.length - 1;
        while (l < r) {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {

        String testString;
        String solution;
        boolean result = true;

        result = result && reverseStr("abcd").equals("dcba");

        if (result) {
            System.out.println("All tests pass");
        } else {
            System.out.println("There are test failures");
        }

    }
}
