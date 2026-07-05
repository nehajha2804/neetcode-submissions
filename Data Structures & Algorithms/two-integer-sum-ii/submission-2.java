class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;

        // for(int i=0; i<numbers.length; i++){
            
        //     for(int j=i+1; j<numbers.length; j++){
        //         if(numbers[j]+numbers[i]==target){
        //             return new int[]{i+1, j+1};
        //         }
        //     }
        // }

        while(left<right){
            int sum = numbers[left]+numbers[right];
            if((left!=right) && (sum==target)){
                return new int[]{left+1, right+1};
            }
            if(sum<target){
                left++;
            }else{
                 right--;
            }
        }

        return new int[]{-1,-1};
    }
}
