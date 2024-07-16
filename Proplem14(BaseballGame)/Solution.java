import java.util.*; 
public class Solution {

    public int calPoints(String[] operations) {
     int result = 0;
     Deque<Integer> stack = new ArrayDeque<>();
        for (String stringChar : operations) {
            if(stringChar == "C") stack.removeFirst();
            else if(stringChar == "D") stack.addFirst(stack.peek()*2);
            else if(stringChar == "+") {
                int top = stack.remove(); 
                int topNew = top + stack.peekFirst(); 
                stack.addFirst(top);
                stack.addFirst(topNew);}

            else if(stringChar!="C"&&stringChar!="D"&&stringChar!="+") stack.addFirst(Integer.valueOf(stringChar));
        }

        Iterator<Integer> i = stack.iterator();
        while (i.hasNext()) {
            
            result += i.next();
            // System.out.println(result);
            i.hasNext();
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
