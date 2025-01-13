package String;

public class Question_3223 {
    public static void main(String[] args) {
        
    }
    public static int minimumLength(String s) {
        int[] arr = new int[26];

        for (char ch : s.toCharArray()){
            arr[ch-'a']++;
            if (arr[ch - 'a'] == 3){
                arr[ch - 'a'] -= 2;
            }
        }
        int ans = 0;
        for (int i = 0; i < 26; i++){
            ans += arr[i];
        }
        return ans;
    }
}
