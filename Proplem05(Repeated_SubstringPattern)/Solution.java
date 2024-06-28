// package Proplem05(Repeated_SubstringPattern);

public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        
        if(s.length()%2 !=0 ) return false;

        for (int i=0; i < s.length()/2; i++){
            // System.out.println(i);
            // System.out.println(s.length()/2+i);
            // System.out.println(s.charAt(i));
            // System.out.println(s.charAt(s.length()/2+i));
            if(s.charAt(i) != s.charAt(s.length()/2+i)) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Hello mode");

        String x = "abcabcabcabc";
        String y = "abcabcabcabc";
        
        System.out.println( (x==y) ?  true:  false);
        // Solution s = new Solution();
        // System.out.println(s.repeatedSubstringPattern(x));

    }
}
