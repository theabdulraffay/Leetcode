class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length -1;
        while(start <= end){
            int temp = numbers[start] + numbers[end];
            if(temp == target){
                return new int[]{start+1, end+1};
            }else if(temp > target){
                end--;
            }else{
                start++;
            }
        }
        return new int[]{-1,-1};
        
    }
}
