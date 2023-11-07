class Solution {
    public int smallestEqual(int[] nums) {
        //ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == i%10){
                return i;
            }
        }
        return -1;   
    }
}