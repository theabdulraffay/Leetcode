class Solution {
    void per(List<List<Integer>> list, List<Integer> temp,int[] nums, boolean[] bol) {
        if (temp.size() == nums.length) {
            System.out.println(temp);
            if (!list.contains(temp)) {
                list.add(new ArrayList<>(temp));
            }
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if(bol[i])continue;
            temp.add(nums[i]);
            bol[i] = true;
            per(list, temp, nums, bol);
            bol[i] = false;
            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        per(list, new ArrayList<Integer>(), nums, new boolean[nums.length]);
        return list;
        
    }
}
