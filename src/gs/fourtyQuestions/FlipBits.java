package gs.fourtyQuestions;

public class FlipBits {
    public static void main(String[] args) {
        System.out.println(flipCount("001"));// 10101,  01010
    }
    static int  disCount(String st, char c){
        int count =0;
        for (int i=0; i<st.length(); i++){
            if (i%2==0){
                if (st.charAt(i)!=c) count++;
            }else {
                if (st.charAt(i)==c) count++;
            }
        }
        return  count;
    }
    static int flipCount(String binary){
        int dis1 = disCount(binary, '0');
        int dis2 = disCount(binary, '1');
        return  Math.min(dis2, dis1);
    }

}
// 001

//101-- 1
//010-- 2
