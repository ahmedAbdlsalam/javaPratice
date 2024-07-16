public class Solution {
    public boolean judgeCircle(String moves) {
        int xAxis = 0, yAxis =0;
        for(int i=0; i<moves.length(); i++){
            if(moves.charAt(i)  == 'U') yAxis +=1;
            else if(moves.charAt(i) == 'D') yAxis -=1;
            else if(moves.charAt(i) == 'R') xAxis +=1;
            else if(moves.charAt(i) == 'L') xAxis -=1;
        }

        if(xAxis ==0 && yAxis ==0) return true;
        else return false;
        
    }


    public static void main(String[] args) {
        System.out.println("Hello Ahmed, it is a tough life, but trust the process");
        Solution s1 = new Solution();
        System.out.println(s1.judgeCircle("LL"));
    }
}
