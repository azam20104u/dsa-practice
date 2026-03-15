package gs.fourtyQuestions;

import java.util.Arrays;

public class CycleDetect {
    /**
     *
     * You have an integer array.
     * Starting from arr[startIndex], follow each element to the index it points to.
     * Continue to do this until you find a cycle.
     * Return the length of the cycle. If no cycle is found return -1
     *
     */
    public static int countLengthOfCycle( int[] arr, int startIndex ) {
        int[] visited = new int[arr.length];
        Arrays.fill(visited,-1);
        int index = 0;
        int steps = 0;
        while (index>=0 && index<arr.length){
            if (visited[index]!=-1){
                return  steps - visited[index];
            }
            visited[index]=steps;
            index=visited[index];
            steps++;
        }
        return -1;
    }


    public static void main( String[] args ) {

        boolean testsPassed = true;

        testsPassed &= countLengthOfCycle(new int[]{1, 0}, 0) == 2;
        testsPassed &= countLengthOfCycle(new int[]{1, 2, 0}, 0) == 3;

        if(testsPassed) {
            System.out.println( "Test passed." );
            //return true;
        } else {
            System.out.println( "Test failed." );
            //return false;
        }


    }
}
