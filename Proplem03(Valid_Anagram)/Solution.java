
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class Solution {
    

    public static Dictionary charOccurrence(String data){
        char[] dataChar = data.toCharArray();

        Hashtable<Character, Integer> occurrence = new Hashtable<>();

        for(int i=0; i < dataChar.length; i++){

            Set<Character> keysSet = new HashSet<Character>();
            keysSet = occurrence.keySet();
            String keysString = keysSet.toString();
            char[] keys = keysString.toCharArray();
            for (int j=0; j<keys.length; j++){

                if(dataChar[i] == keys[j]){
                    occurrence.replace(dataChar[i], (((Integer)occurrence.get(dataChar[i]))+1));
                    break;
                } else if (j == keys.length-1){
                    occurrence.put(dataChar[i], 1);
                }

                
            }
        }
        return occurrence;
    }

    public static boolean isAnagram(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        
        // if (s.length() != t.length()){
        //     return false;
        // }
        // for (int i =0 ; i<t.length(); i++){
        //     for (int j=0; j<s.length(); j++){
        //         if((tt[i] != ss[j]) && j == s.length()-1){
        //             return false;
        //         }

        //         if((tt[i] == ss[j])){
        //             break;
        //         }

        //     }
        // }
        
        return true;
    }


    public static void main(String args[]){

        // System.out.println(isAnagram("rat", "car"));
        System.out.println(charOccurrence("fAhmeeemed"));
        
    
    }
}
