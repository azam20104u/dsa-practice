package gs.fourtyQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DictionayProb {
    public static Set<String> longestWord(String letters, String[] dict) {
        Set<String> result = new HashSet<String>();
        char[] arr = letters.toCharArray();
        Arrays.sort(arr);
        String sortedLetter = new String(arr);
        for (String st: dict){
            char[] arr2 = st.toCharArray();
            Arrays.sort(arr2);
            String dicLetter = new String(arr2);
            if (sortedLetter.equals(dicLetter)){
                result.add(st);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(longestWord("toe", new String[]{"to", "toe", "toes", "doe", "dog", "god", "dogs", "banana"}));
    }
}
