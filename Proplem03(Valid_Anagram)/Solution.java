
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class Solution {
    

    public static Hashtable charOccurrence(String data){
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
        
        Hashtable sOccurrence = charOccurrence(s);
        Hashtable tOccurrence = charOccurrence(t);

        if (sOccurrence.size() != tOccurrence.size()){
            return false;
        }

        Enumeration tKeys = tOccurrence.keys();
        // Enumeration sKeys = sOccurrence.keys();

        // while (tKeys.hasMoreElements()) {

        //     char key = (char)tKeys.nextElement();

        //     if (tOccurrence.get(key) != sOccurrence.get(key)){
        //         return false;
        //     }
        // }
            // System.out.println(tOccurrence);
        while (tKeys.hasMoreElements()) {

            char key = (char)tKeys.nextElement();
            for(int i=0; i<sChar.length; i++){
                if(key == sChar[i]){
                    tOccurrence.replace(sChar[i], (Integer)tOccurrence.get(key)-1);
                }
            }
            
        }
        // System.out.println(tOccurrence);
        Set<Character> keySet = tOccurrence.keySet();
        Object[] keysString = keySet.toArray();
        // char[] keys = keysString.toCharArray();

        
        for(int i =0; i<keysString.length; i++){

            if((Integer)tOccurrence.get(keysString[i]) != 0){
                return false;
            }
            
        }
            
    
        // System.out.println(keys);
        
        return true;
    }


    public static void main(String args[]){

        // System.out.println(isAnagram("anagram", "nagaram"));
        // System.out.println(charOccurrence("fAhmeeemed"));
       
       
        
    
    }
}
