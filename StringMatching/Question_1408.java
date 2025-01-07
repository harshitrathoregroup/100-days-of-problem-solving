package StringMatching;

import java.util.ArrayList;
import java.util.List;

public class Question_1408 {
    public static void main(String[] args) {
        String[] words = {"mass","as","hero","superhero"};
        System.out.println(stringMatching(words));
    }
    public static List<String> stringMatching(String[] words) {
        int n = words.length;
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++){
            for (int j = 0; j < words.length; j++){
                if (i != j && words[j].contains(words[i])){
                    ans.add(words[i]);
                    break;
                }
            }
        }
        return ans;
    }
}
