class Solution {
    private int countZeroSumSubarrays(int[] nums) {
        int count = 0, length = 0;
        
        for (int num : nums) {
            if (num == 0) {
                length++; 
            } else {
                count += (length * (length + 1)) / 2;  
                length = 0; 
            }
        }
        count += (length * (length + 1)) / 2;
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int k) {
        if (k == 0) {
            return countZeroSumSubarrays(nums);
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) if(nums[i] == 1) list.add(i);

        if(k > list.size()) return 0;
        list.add(nums.length);
        int num = 0;
        int n1 = list.get(k) - list.get(k - 1);
        int n2 = list.get(0) + 1;
        num += (n1 * n2);
        for(int i = k + 1; i < list.size(); i++) {
            n1 = list.get(i) - list.get(i - 1);
            n2 = list.get(i - k) - list.get(i - k - 1);
            num += (n1 * n2);
        }
        return num;
    
        
    }
}
