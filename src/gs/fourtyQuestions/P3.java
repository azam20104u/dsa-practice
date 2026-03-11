package gs.fourtyQuestions;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//Set of Anagram
public class P3 {
    static List<List<String>> anagramSet(String[] arr){
        HashMap<String, List<String>> map = new HashMap();
        for (String st: arr){
            char[] carr = st.toCharArray();
            Arrays.sort(carr);
            String sortSt = new String(carr);
            map.putIfAbsent(sortSt, new ArrayList<>());
            map.get(sortSt).add(st);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        System.out.println(anagramSet(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
}
