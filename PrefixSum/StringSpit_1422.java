package PrefixSum;

public class StringSpit_1422 {
    public static void main(String[] args) {
        String s = "011101";
        System.out.println(maxScore(s));
    }

    public static int maxScore(String s) {
        int ones = 0;
        
        for (char ch : s.toCharArray()){
            if (ch == '1'){
                ones++;
            }
        }

        int ans = 0;
        int left = 0;
        for (int i = 0; i < s.length() - 1; i++){
            if (s.charAt(i) == '0'){
                left++;
            }
            ans = Math.max(ans, 2 * left + ones - i - 1);
        }

        return ans;
    }
}
