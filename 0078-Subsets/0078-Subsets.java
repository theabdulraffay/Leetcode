class Solution {
    public List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
		list.add(new ArrayList<Integer>());
		for (int nums : arr) {
            int n = list.size();
            for (int i = 0; i < n; i++) {
                List<Integer> newList = new ArrayList<>(list.get(i));
                newList.add(nums);
                list.add(newList);
            }
        }
        return list;
    }
}
