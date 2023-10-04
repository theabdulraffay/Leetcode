class Solution {
    public int arraySign(int[] nums) {
        short product = 0;
        for(int i =0; i< nums.length; i++){
            if(nums[i]==0){
                return 0;
            }else if(nums[i]<0){
                product++;
            }

        }
        if(product%2==0){
            return 1;
        }else{
            return -1;
        }
        
    }
}