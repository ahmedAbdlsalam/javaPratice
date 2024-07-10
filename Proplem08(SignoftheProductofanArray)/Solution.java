
public class Solution {
    public int arraySign(int[] nums) {
        int SignProduct=1;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0) nums[i] = 1;
            else if(nums[i] == 0) return 0;
            else nums[i] = -1;
        }

        for (int i : nums) {
            SignProduct *=i;
        }
        return SignProduct;
    }

    public static void main(String[] args) {
        int[] input = new int[]{-1,-2,-3,-4,3,2,1};
        System.out.println("Hello mode");
        Solution s = new Solution();
        System.out.println(s.arraySign(input));
    }
}
