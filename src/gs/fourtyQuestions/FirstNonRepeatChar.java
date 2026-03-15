package gs.fourtyQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatChar {
    /**
     * Finds the first character that does not repeat anywhere in the input string
     * Given "apple", the answer is "a"
     * Given "racecars", the answer is "e"
     **/
    public static char findFirst(String input) {
        LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
        for (Character c: input.toCharArray()){
            lhm.put(c, lhm.getOrDefault(c,0)+1);
        }
        for (Map.Entry<Character,Integer> entry: lhm.entrySet()){
            if (entry.getValue()==1) return entry.getKey();
        }
        return ('a');
    }

    public static void main(String args[]) {

        String[] inputs = {"apple", "racecars", "ababdc"};
        char[] outputs = {'a', 'e', 'd'};

        boolean result = true;
        for (int i = 0; i < inputs.length; i++) {
            result = result && findFirst(inputs[i]) == outputs[i];
            if (!result)
                System.out.println("Test failed for: " + inputs[i]);
            else
                System.out.println("Test passed for: " + inputs[i]);
        }
    }
}
