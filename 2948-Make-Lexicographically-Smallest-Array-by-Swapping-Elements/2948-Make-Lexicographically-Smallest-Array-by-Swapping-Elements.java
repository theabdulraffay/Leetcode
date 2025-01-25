class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int[] arr = nums.clone();
        Arrays.sort(arr);
        Map<Integer, Integer> togroup = new HashMap<>();
        Map<Integer, LinkedList<Integer>> tonum = new HashMap<>();
        int group = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] - arr[i - 1] > limit) {
                group++;
            }
            togroup.put(arr[i], group);
            tonum.putIfAbsent(group, new LinkedList<>());
            tonum.get(group).addLast(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            int num = togroup.get(nums[i]);
            arr[i] = tonum.get(num).removeFirst();
        }
        return arr;

        
    }
}
