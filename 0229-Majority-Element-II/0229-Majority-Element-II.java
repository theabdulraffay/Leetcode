class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        int c = 1;
        List<Integer> list = new ArrayList<>();
        if (nums.length /3 == 0) {
            for (int t : nums) { 
            // Add each element into the list 
            if(!list.contains(t))
                list.add(t); 
            } 
            return list;
        }

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1]) {
                c++;
            }
            else {
                c = 1;
            }
            if (c > nums.length/3 && !list.contains(nums[i])) {
                list.add(nums[i]);
            }
        }
        return list;
        
    }
}
