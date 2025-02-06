class Solution {
    int f(int n) {
        if(n == 2) return 1;
        return (n - 1) + f(n-1);
    }
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                int prod = nums[i] * nums[j];
                map.put(prod, map.getOrDefault(prod, 0) + 1);
            }
        }

        int c = 0;
        for(int i : map.keySet()) {
            if(map.get(i) >= 2){
                c += (8 * f(map.get(i)));
            }
        }
        return c;
        
    }
}
