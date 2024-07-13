import java.util.Dictionary;
import java.util.Hashtable;
public class Solution {
    public int romanToInt(String s) {
        Dictionary<String, Integer> romanDecimalMap= new Hashtable<>();
        romanDecimalMap.put("I", 1);
        romanDecimalMap.put("V", 5);
        romanDecimalMap.put("X", 10);
        romanDecimalMap.put("L", 50);
        romanDecimalMap.put("C", 100);
        romanDecimalMap.put("D", 500);
        romanDecimalMap.put("M", 1000);


        char[] sArray = s.toCharArray();
        int result =0;
        for(int i=0; i<s.length(); i++){
            if((i+1)<=s.length()-1 && romanDecimalMap.get(String.valueOf(sArray[i]))<romanDecimalMap.get(String.valueOf(sArray[i+1]))){
                result += romanDecimalMap.get(String.valueOf(sArray[i+1])) - romanDecimalMap.get(String.valueOf(sArray[i]));
                i++;
            } else result += romanDecimalMap.get(String.valueOf(sArray[i]));
        }

        return result;  
    }    


    public static void main(String[] args) {
        Solution s = new Solution();

        String input = "III";
        String input2 = "MCMXCIV";

        System.out.println(s.romanToInt(input));
    }
}
