package gs.fourtyQuestions;

public class MedTwoSortedArray {
    public static double logic(int[] A, int[] B) {
        int[] arr = new int[A.length+B.length];
        int length = A.length+B.length;
        int l = 0, r=0;
        int index = 0;
        int smaller=0, bigger = 0;
        while (l<A.length && r<B.length  && (l+r)<=length/2){//
            if (A[l]<B[r]){
                smaller=bigger;
                bigger=A[l++];
            }
            else{
                smaller=bigger;
                bigger=B[r++];
            }
        }
        while (l<A.length && (l+r)<=length/2){
            smaller=bigger;
            bigger=A[l++];
        }
        while (r<A.length && (l+r)<=length/2){
            smaller=bigger;
            bigger=B[r++];
        }
        if (length%2==0){
            return (smaller+bigger)/2.0;
        }
        return bigger;
    }

    public static void main(String[] args) {
        System.out.println(logic(new int[]{1, 3}, new int[]{2, 4, 5}));
    }
}
