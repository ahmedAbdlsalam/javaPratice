// package Proplem05(Repeated_SubstringPattern);

public class Solution {
    public boolean repeatedSubstringPattern(String s) {

        for(int i=1; i<=s.length()/2; i++){
            if(s.length()%i ==0){
                StringBuilder battern= new StringBuilder();

            for(int j=0; j<s.length()/i; j++){
                battern.append(s.substring(0, i));
            }
            System.out.println(battern);
            System.out.println("==============");
            if(s.equals(battern.toString())) return true;
        }
            }
            

        return false;
    }

    public static void main(String[] args) {
        System.out.println("Hello mode");

        String x = "abcabcabcabc";
        // String y = "abcabcabcabc";
        
        // System.out.println( (x==y) ?  true:  false);
        Solution s = new Solution();
        System.out.println(s.repeatedSubstringPattern(x));

    }
}
