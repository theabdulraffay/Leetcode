class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        ArrayList<Integer> temp2 = new ArrayList<Integer>();
        for(int i : nums1){
            temp.add(i);
        }
        
        for(int i : nums2){
            if(temp.contains(i)){
                temp2.add(i);
                temp.remove(Integer.valueOf(i));
            }
        }
        
        int[] l = new int[temp2.size()];
        int a = 0;
        for(int i : temp2){
            l[a++] = i;
        }
        return l;
    }
}
