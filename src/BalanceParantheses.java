import java.util.Stack;

public class BalanceParantheses {
    public static void main(String[] args) {
        String A = "(()())";
        System.out.println(solve(A));
    }

    private static int solve(String A) {
        if(A.charAt (0)==')') return 0;
        Stack<Character> stack = new Stack<>();
        for (char c: A.toCharArray()){
            if (c=='('){
                stack.push(c);
            } else {
                if(stack.isEmpty()) return 0;
                stack.pop();
            }
        }
        return stack.empty()?1:0;
    }
}
//advaned version for any type of parantheses.
/*public class Solution {
    boolean isPair(char open, char close){
        if(open=='(' && close==')') return true;
        else if(open=='{' && close=='}') return true;
        else if(open=='[' && close==']') return true;
        else return false;
    }
    public int solve(String A) {
        Stack<Character> stack = new Stack();
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='('||A.charAt(i)=='{'||A.charAt(i)=='['){
                stack.push(A.charAt(i));
            }else{
                if(stack.isEmpty() || !isPair(stack.peek(),A.charAt(i))){
                    return 0;
                }
                stack.pop();
            }
        }
        return stack.isEmpty()?1:0;
    }
}*/

