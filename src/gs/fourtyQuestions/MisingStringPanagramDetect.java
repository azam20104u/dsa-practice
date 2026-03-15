package gs.fourtyQuestions;

import java.util.HashSet;
import java.util.Set;

public class MisingStringPanagramDetect {
    private static class PanagramDetector {
        private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

        public String findMissingLetters(String sentence) {
            Set<Character> set = new HashSet<>();
            sentence=sentence.toLowerCase();
            for (char c: sentence.toCharArray()){
                if (c>='a' && c<='z'){
                    set.add(c);
                }
            }
            StringBuilder sb = new StringBuilder();
            for (char c: ALPHABET.toCharArray()){
                if (!set.contains(c)){
                    sb.append(c);
                }
            }
            return sb.toString();
        }

    }

    public static void main(String[] args) {
        PanagramDetector pd = new PanagramDetector();
        boolean success = true;

        success = success && "".equals(pd.findMissingLetters("The quick brown fox jumps over the lazy dog"));
        success = success && "abcdefghijklmnopqrstuvwxyz".equals(pd.findMissingLetters(""));

        if (success) {
            System.out.println("Pass ");
        } else {
            System.out.println("Failed");
        }
    }
}
