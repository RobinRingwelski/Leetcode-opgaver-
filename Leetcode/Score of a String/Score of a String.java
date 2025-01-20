class Solution {
    public static int scoreOfString(String s) {
        int score = 0;
        for (int i = 1; i < s.length(); i++){
            score += Math.abs((int) s.charAt(i) - (int) s.charAt(i - 1));
        }
        return score;
    }
     public static void main(String[] args) {
        String s1 = "hello";
        System.out.println("Score of \"" + s1 + "\": " + scoreOfString(s1)); 

        String s2 = "zaz";
        System.out.println("Score of \"" + s2 + "\": " + scoreOfString(s2));
    }
}