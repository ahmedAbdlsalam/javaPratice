public class Solution {
    public int lengthOfLastWord(String s) {
        char [] sArray = s.toCharArray();
        int lastWordLength =0;
        boolean catchWord = false;

        for(int i=sArray.length-1; i>=0; i--){
            if(sArray[i] != ' '){
                lastWordLength++;
                catchWord = true;
            }
            else if(catchWord){
                return lastWordLength;
            }
        }
        return lastWordLength;
    }


    public static void main(String[] args) {
        System.out.println("Hello baby");
        Solution s1 = new Solution();

        System.out.println(s1.lengthOfLastWord("luffy is still joyboy"));
    }
}
