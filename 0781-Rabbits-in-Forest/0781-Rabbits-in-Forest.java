class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int s = 0;
        int c = 0;

        for(int i : answers) {
            map.put(i, map.getOrDefault(i, 0) +1);
        }
        for(int ans : map.keySet()) {
            int count = map.get(ans);
            if(ans == 0) c += count;
             else c += (int)Math.ceil((double)count / (ans + 1)) * (ans + 1);
        }
        return c;
        
    }
}
