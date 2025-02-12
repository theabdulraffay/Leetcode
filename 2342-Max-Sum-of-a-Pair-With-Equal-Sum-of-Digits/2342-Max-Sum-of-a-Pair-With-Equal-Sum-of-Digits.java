class Solution {
    int add(int i) {
        int s = 0;
        while(i > 0) {
            s += (i % 10);
            i/=10;
        }
        return s;
    }
    public int maximumSum(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = add(nums[i]);
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int max =-1;
        for(int i = 0; i < n; i++) {
            if(map.containsKey(arr[i])) {
                int j = map.get(arr[i]);
                max = Math.max(max, (nums[i] + nums[j]));
                map.put(arr[i], nums[i] > nums[j] ? i : j);
                continue;
            }
            map.put(arr[i], i);
        }
        return max;
        
    }
}
