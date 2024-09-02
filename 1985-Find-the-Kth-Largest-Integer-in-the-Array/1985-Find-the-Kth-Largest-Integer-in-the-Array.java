class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        Arrays.sort(nums, new Comparator<String>() {
            
        public int compare(String e1, String e2) {
            if(e1.length() != e2.length()) 
                return Integer.compare(e1.length(), e2.length());
            else 
                return e1.compareTo(e2);
        }
    });
        // System.out.println(Arrays.toString(nums));
        return nums[nums.length - k];
    }
}
