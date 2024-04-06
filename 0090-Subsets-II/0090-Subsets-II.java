class Solution {
    public List<List<Integer>> subsetsWithDup(int[] arr) {
        Arrays.sort(arr);
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		list.add(new ArrayList<Integer>());
		for (int i = 0; i < arr.length; i++) {
			int n = list.size();
			for (int j = 0; j < n; j++) {
				ArrayList<Integer> newlist = new ArrayList<Integer>(list.get(j));
				newlist.add(arr[i]);
				if(!list.contains(newlist)){
                    list.add(newlist);
                }
			}
		}
		return list;
        
    }
}
