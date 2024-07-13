public class Solution {
    public String toLowerCase(String s) {
        char[] alpthCapital = 
        {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        
        char[] alphSmall =
         {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        
        char[] sArray = s.toCharArray();
        for(int i=0; i<s.length(); i++){
            for(int j=0; j<alpthCapital.length; j++){
                if(sArray[i]==alpthCapital[j]) sArray[i]=alphSmall[j];
            }
        }
        
         return String.valueOf(sArray);
    }
    public static void main(String[] args) {
        System.out.println("Hello mode");
        Solution s1 = new Solution();
        System.out.println(s1.toLowerCase("LOVELY"));
    }
}
