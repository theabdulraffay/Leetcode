class Solution {
    int numberOfPairs(int[] nums, int desiredPairs) {
        int left = 0;
        int count = 0;
        for(int i = 1; i < nums.length; i++) {
            while(nums[i] - nums[left] > desiredPairs) {
                left++;
            }
            count+= i - left;
        }
        return count;
    }
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int start = 0;
        int en = nums[nums.length - 1] - nums[0];
        while(start < en) {
            int mid  = start + (en - start) / 2;
            int temp = numberOfPairs(nums, mid);
            if(temp < k)start = mid + 1;
            else en = mid;
        }
        return start;

    }
}
