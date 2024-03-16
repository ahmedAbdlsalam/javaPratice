class Solution {
    public static char findTheDifference(String s, String t) {
        
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();

        

        
        if (s.length() != 0){
            for(int index=0; index<t.length(); index++){
                for(int index02=0; index02<s.length(); index02++){
                    
                    if(tt[index] == ss[index02]){
                        break;
                    }
                    
                    
                    if (index02 == (s.length()-1)){
                        
                        return tt[index];
                    }
                    
                }
            }
        }


        return t.charAt(0);
    }


    public static void main(String args[]){

        System.out.println(findTheDifference("abcd", "abcde"));

    }
}