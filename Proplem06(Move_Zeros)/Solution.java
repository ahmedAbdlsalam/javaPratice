class Solution {
    public void moveZeroes(int[] nums) {

        for(int i=0; i<nums.length; i++){

            if(nums[i] == 0){
                for(int j = i; j<nums.length-1; j++){
                    nums = arrayForwardSwap(nums, j);
                }
            }
        }
       
    }

    public int[] arrayForwardSwap(int[] nums, int index){
        
        int item1 = nums[index];
        int item2 = nums[index+1];
        int[] num = nums;

        num[index] = item2;
        num[index+1] = item1;

        return num;
    }



    public static void main(String[] args) {
        Solution s1 = new Solution();

        int [] nums = {0,1,0,3,12};
        System.out.println(nums);
        s1.moveZeroes(nums);
        System.out.println(nums);
    }
}