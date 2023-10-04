class Solution {
    public int arraySign(int[] nums) {
        short pro = 1;
        for(int i =0; i < nums.length; i++){
            pro *= nums[i];
            if(pro == 0){
                return 0;
            }else if(pro > 0){
                pro = 1;
            }else{
                pro = -1;
            }
        }

        return pro;
        
    }
}