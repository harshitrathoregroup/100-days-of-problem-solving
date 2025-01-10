package StringMatching;

import java.util.ArrayList;
import java.util.List;

public class WordSubset {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans = new ArrayList<>();
        int[] freq = new int[26];

        for (String word : words2){
            int[] temp = new int[26];
            for (char ch : word.toCharArray()){
                temp[ch - 'a']++;
                freq[ch - 'a'] = Math.max(temp[ch - 'a'], freq[ch - 'a']);
            }
        }   


        for (String word : words1){
            int[] temp = new int[26];

            for (char ch : word.toCharArray()){
                temp[ch - 'a']++;
            }

            if (isSubset(temp, freq)){
                ans.add(word);
            }
        }
        return ans;
    }

    static boolean isSubset(int[] temp, int[] freq){
        for (int i = 0; i < 26; i++){
            if (freq[i] > temp[i]){
                return false;
            }
        }
        return true;
    }
}
