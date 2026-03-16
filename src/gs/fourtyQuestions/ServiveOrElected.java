package gs.fourtyQuestions;

public class ServiveOrElected {
    public static int whoIsElected(int n, int k) {
        int result = 0;//base case
        for (int i=2; i<=n; i++){
            result = (result+k)%i;
        }
        return result+1;
    }

    public static void main(String[] args) {
        int[][] testCases = {
                {1, 1, 1},
                {2, 2, 1},
                {4, 2, 1},
                {100, 2, 73},
                {5, 3, 4},
                {6, 4, 5},
                {1000, 5, 763},
                {14,2,13}
        };

        for (int[] testCase : testCases) {
            int answer = whoIsElected(testCase[0], testCase[1]);
            if (answer != testCase[2]) {
                System.out.println("test failed!");
                System.out.printf("n:%d, k%d, answer got: %d, should be: %d\n", testCase[0], testCase[1], answer, testCase[2]);
            }
        }
        System.out.println("All tested passed");
    }
}
