package Stack;

import java.util.Stack;

public class Question_2116 {
    public static void main(String[] args) {
        String s = "))()))", locked = "010100";

        System.out.println(canBeValid(s, locked));
    }

    public static boolean canBeValid(String s, String locked) {
        int n = s.length();
        if (n % 2 != 0){
            return false;
        }
        int open = 0;
        int close = 0;
        int wildCard = 0;

        for (int i = 0; i < n; i++){
            if (locked.charAt(i) == '0'){
                wildCard++;
            } else if (s.charAt(i) == '('){
                open++;
            } else {
                close++;
            }
            if (wildCard < (close - open)){
                return false;
            }
        }

        open = 0;
        close = 0;
        wildCard = 0;
        for (int i = 0; i < n; i++){
            if (locked.charAt(i) == '0'){
                wildCard++;
            } else if (s.charAt(i) == '('){
                close++;
            } else {
                open++;
            }
            if (wildCard < (open - close)){
                return false;
            }
        }

        return true;
        
    }
}
