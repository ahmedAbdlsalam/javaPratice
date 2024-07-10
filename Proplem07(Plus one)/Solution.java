public class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
       for(int i=n-1 ; i>=0; i--){
            if(digits[i] == 9){
                digits[i] = 0;
            }else{
                digits[i]+=1;
                return digits;
            }
       }
        digits = new int[n+1];
        digits[0] = 1;




        return digits;
    }


public int[] AddNewItem(int[] arr){
    int[] arr2 = new int[arr.length + 1];

    for(int i =0; i<arr.length; i++){
        arr2[i] = arr[i];
    }

    return arr2;
}



    public static void main(String[] args) {
        Solution s = new Solution();
        int[] array = new int[]{4,3,2,9};
        int[] result = s.plusOne(array);

        for (int i : result) {
            System.out.println(i);
        }
    }
}
