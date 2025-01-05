package PrefixSum;
import java.util.*;

public class Question_1930 {
    public static void main(String[] args) {
        String s = "aabca";
        System.out.println(countPalindromicSubsequence(s));
    }
    
    public static int countPalindromicSubsequence(String s) {
        int n = s.length();
        int count = 0;
        
        for (char c = 'a'; c <= 'z'; c++) {
            int first = s.indexOf(c);
            int last = s.lastIndexOf(c);
            
            if (first != -1 && last != -1 && last - first > 1) {
                HashSet<Character> uniqueChars = new HashSet<>();
                
                for (int i = first + 1; i < last; i++) {
                    uniqueChars.add(s.charAt(i));
                }
                
                count += uniqueChars.size();
            }
        }
        
        return count;
    }
}