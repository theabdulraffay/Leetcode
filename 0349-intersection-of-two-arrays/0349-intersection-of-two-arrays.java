class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i : nums1){
            for(int j : nums2){
                if(i == j){
                    if (temp.contains(i)){
                        continue;
                    }
                    temp.add(i);
                }
            }
        }
        int[] n1 = new int[temp.size()];
        for(int i =0;i<temp.size();i++){
            n1[i] = temp.get(i);
        }
        return n1;
        
    }
}