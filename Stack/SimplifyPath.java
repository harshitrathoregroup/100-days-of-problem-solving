package Stack;

import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {
        String str = "/a/./b/../..//c/";
        System.out.println(simplifyPath(str));
    }
    
    public static String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] components = path.split("/");

        for (String str : components){
            if (str.equals("") || str.equals(".")){
                continue;
            }

            if (str.equals("..")){
                if (!st.isEmpty()){
                    st.pop();
                }
            } else {
                st.push(str);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()){
            sb.insert(0, "/" + st.pop());
        }

        return sb.length() == 0 ? "/" : sb.toString();
    }
}
