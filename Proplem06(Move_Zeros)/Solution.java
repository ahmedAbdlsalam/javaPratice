class Solution {
    public void moveZeroes(int[] nums) {
        int reader = 0;
        int writer = 0;

        do{
            if(nums[reader] == 0){
                reader++;
            }else{

                if(nums[writer] == 0){
                    nums[writer] = nums[reader];
                    nums[reader] =0;
            
                    writer++;
                }else{ writer++;}

            }
        }while(nums.length>reader);

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
        

    }
}