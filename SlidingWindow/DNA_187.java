package SlidingWindow;

import java.util.*;

public class DNA_187 {
    public static void main(String[] args) {
        
    }
    public static List<String> findRepeatedDnaSequences(String s) {
        Set ans = new HashSet();
        Set seen = new HashSet();

        for (int i = 0; i < s.length() - 9; i++){
            String str = s.substring(i, i + 10);
            if (!seen.add(str)){
                ans.add(str);
            }
        }
        return new ArrayList(ans);
    }
}
