import java.util.ArrayList;
class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		

		for(int i : nums1){
		int l1 = nums1.length;
		int l2 = nums2.length;
			for(int j : nums2) {
				if(i == j){
					l1--;
					l2--;
				}
			}
			if(l1 == nums1.length){
				if(a.contains(i)){continue;}
				a.add(i);
			}
		}

		for(int j : nums2){
		int l2 = nums2.length;
		int l1 = nums1.length;
			for(int i : nums1) {
				if(j == i){
					l1--;
					l2--;
				}
			}
			if(l2 == nums2.length){
				if(b.contains(j)){continue;}
				b.add(j);
			}
		}
		List<List<Integer>> fina = new ArrayList<>();
        fina.add(a);
        fina.add(b);

		return fina;
     		   
    }
}
