package StringMatching;

class Question_2185 {
    public static void main(String[] args) {
        String[] words = {"pay","attention","practice","attend"};
        String pref = "att";
        System.out.println(prefixCount(words, pref));
    }
    public static int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String str : words){
            if (pref.length() <= str.length() && str.substring(0, pref.length()).equals(pref)){
                count++;
            }
        }
        return count;
    }
}
