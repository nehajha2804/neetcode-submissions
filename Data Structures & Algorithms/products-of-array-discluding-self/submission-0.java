class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int output[] = new int[n];
        for(int j = 0; j<n; j++){
            int product = 1;
            for(int i=0; i<j; i++){
                product = nums[i]*product;
            }

            for(int i = j+1; i<n; i++){
                product = nums[i]*product;
            }

            output[j]=product;
        }

        return output;
    }
}  
