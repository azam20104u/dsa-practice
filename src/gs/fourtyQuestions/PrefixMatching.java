package gs.fourtyQuestions;

import java.util.ArrayList;

public class PrefixMatching {
    static ArrayList<Integer> prefixMatch (String st, String m){
        int i = 0;
        int n = st.length();
        int k = m.length();
        ArrayList<Integer> al = new ArrayList<>();
        while (i<n){
            while (i<n&& st.charAt(i)==' '){//skip spaces
                i++;
            }
            if (i+k<=n && st.substring(i, i+k).equalsIgnoreCase(m)){//match  prefix
                al.add(i);
            }
            while (i<n && st.charAt(i)!=' '){// move to end of word
                i++;
            }
        }
        return al;
    }

    public static void main(String[] args) {
        System.out.println(prefixMatch("a aaaa AAA AaAa AAA", "a"));
        System.out.println(prefixMatch("ab abx abc aBcd xyz", "ab"));
        System.out.println(prefixMatch("hello world help held", "hel"));
        System.out.println(prefixMatch("cat dog elephant", "z"));
    }
}
