class Solution {
    public void moveZeroes(int[] nums) {
     int writer =0;

     for(int reader =0; reader < nums.length; reader++){
        if(nums[reader] != 0){
            nums[writer] = nums[reader];
            writer++;
        }


     }

     while (writer<nums.length) {
        nums[writer] = 0;
        writer++;
        
    }

    }




    public static void main(String[] args) {
        Solution s1 = new Solution();

        int [] nums = {0,1,0,3,12};
        System.out.println(nums);
        s1.moveZeroes(nums);
        

    }
}