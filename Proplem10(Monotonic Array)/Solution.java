public class Solution {

    public boolean isMonotonic(int[] nums) {
        boolean isMonotonicIncreading = true;
        boolean isMonotonicDecreasing = true;

        if(nums.length<0 || nums.length > Math.pow(10, 5)) return false;
        for (int i : nums) {
            if(i<Math.pow(-10, 5) || i>Math.pow(10, 5)) return false;
        }

        for(int i=nums.length-1;i>0; i--){
            for(int j=i-1;j>=0;j--){
                if(nums[i]<nums[j]) isMonotonicDecreasing = false;
            }
        }

        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]<nums[j])  isMonotonicIncreading = false;
            }
        }
        System.out.println("isMonotonicDecreasing:- "+ isMonotonicDecreasing);
        System.out.println("isMonotonicIncreading:- "+ isMonotonicIncreading);
        
        return (isMonotonicDecreasing || isMonotonicIncreading);
    }

    public static void main(String[] args) {
        System.out.println("Hello koke");

        int[] arr = new int[]{1,3,2};
        Solution s = new Solution();
        System.out.println(s.isMonotonic(arr));
    }
}
