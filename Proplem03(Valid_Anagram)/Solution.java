
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class Solution {
    

    public static Dictionary charOccurrence(String data){
        char[] dataChar = data.toCharArray();

        Hashtable<Character, Integer> occurrence = new Hashtable<>();
        occurrence.put('a', 1);
        occurrence.put('b', 1);
        occurrence.put('c', 1);
        for(int i=0; i < dataChar.length; i++){
            
            for (int j=0; j<occurrence.keySet().size(); j++){
                if(dataChar[i] == occurrence)
            }
        }

        System.out.println(occurrence.keySet());
  
        // for (Character key: occurrence.keySet())
        // {
        //     System.out.println(key +"\b" + occurrence.get(key));
        // }


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
        charOccurrence("Ahmed");
        
    
    }
}
