package gs.fourtyQuestions;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianElement {
    static void med(int[] arr){
        PriorityQueue<Integer> leftHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> rightHeap = new PriorityQueue<>();
        for (int num: arr){
            leftHeap.add(num);
            int current = leftHeap.poll();
            rightHeap.add(current);
            current = rightHeap.poll();
            if (rightHeap.size()==leftHeap.size()){
                System.out.println(current);
                leftHeap.add(current);
            } else {
                System.out.println((leftHeap.peek()+current)/2.0);
                rightHeap.add(current);
            }
        }
    }
    public static void main(String[] args) {
        med(new int[]{5,1,3,7,8});
    }
}



