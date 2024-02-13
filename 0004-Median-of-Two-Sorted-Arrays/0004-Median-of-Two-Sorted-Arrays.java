class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] n = new int[nums1.length + nums2.length];
        for(int i = 0;i<nums1.length;i++){
            n[i] = nums1[i];
        }
        for(int i = 0;i<nums2.length;i++){
            n[nums1.length + i] = nums2[i];
        }
        Arrays.sort(n);
        if(n.length%2 == 0){
            int x = n[n.length/2];
            int y = n[n.length/2 - 1];
            return (double)(x + y)/2;
        }else {
            return (double)(n[n.length/2]);
        }
        
    }
}
