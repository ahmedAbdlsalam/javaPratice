import java.util.*; 
public class Solution {

    public int calPoints(String[] operations) {
    List<Integer> list = new ArrayList<Integer>();
     int result = 0;
        for(int i=0; i<operations.length; i++){
            if(operations[i] == "C"){
                //System.out.println("At clear condition.");
                list.remove(list.size()-1);
            }else if(operations[i] == "D"){
                //System.out.println("At Duplicate condition.");
                list.add(list.get(list.size()-1)*2);
            }else if(operations[i] == "+"){
                //System.out.println("At Addition condition.");
                list.add( list.get(list.size()-2) + list.get(list.size()-1));
            }else{
                //System.out.println("At Else condition.");
                list.add(Integer.valueOf(operations[i]));
            }

        }

        for (Integer integer : list) {
            result += integer;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Hello mode");
        String[] input = new String[]{"5","2","C","D","+"};
        Solution s1 = new Solution();
        System.out.println(s1.calPoints(input));
        
    }
}
