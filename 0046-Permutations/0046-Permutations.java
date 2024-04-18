class Solution {
    void per(List<List<Integer>> list,List<Integer> temp,int[] nums){
        if(temp.size() == nums.length) {
            list.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (temp.contains(nums[i])) continue;
            temp.add(nums[i]);
            per(list, temp, nums);
            temp.remove(temp.size() - 1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        per(list, new ArrayList<Integer>(), nums);
        return list;
        
    }
}
