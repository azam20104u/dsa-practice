package gs.fourtyQuestions;

public class CustomAtoi {
    public static int customAtoi(String s) {
        int i = 0;
        int num = 0;
        while (i<s.length()) {
            if (Character.isDigit( s.charAt(i))){
                while (i<s.length() && Character.isDigit( s.charAt(i))){
                    num = num*10 + (s.charAt(i)-'0');
                    i++;
                }
                break;
            }
            i++;
        }
        return num;
    }
    public static void main(String[] args) {
        System.out.println(customAtoi("-234246asdd3")); // -234246
        System.out.println(customAtoi("abc123xyz"));    // 123
        System.out.println(customAtoi("abc"));          // 0
    }
}
