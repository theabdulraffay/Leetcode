class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int noOfZeros = 0, index = 0;
        for (int i = 0;i<nums.length;i++) {
            if(nums[i] == 0){
                noOfZeros++;
                index = i;
                continue;
            }
            prod *= nums[i];
        }
        
        int[] temp = new int[nums.length]; 
        if (noOfZeros>1) return temp;
        else if (noOfZeros == 1) {
            temp[index] = prod;
            return temp;
        } else {
            for(int i = 0;i<nums.length;i++){
                temp[i] = prod/nums[i];
            }
            return temp;
        }
        
    }
}
