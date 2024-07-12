import java.util.Arrays;

public class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int[] ardata = arr;
        Arrays.sort(ardata);
        int diff = Math.abs(ardata[1]-ardata[0]);
        for(int i=0; i<ardata.length-1; i++){
            if(Math.abs(ardata[i]-ardata[i+1]) != diff) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        

        int[] arr = {5,1,5,22,-1,4};

        Solution s = new Solution();

        System.out.println(s.canMakeArithmeticProgression(arr));
    }
}
