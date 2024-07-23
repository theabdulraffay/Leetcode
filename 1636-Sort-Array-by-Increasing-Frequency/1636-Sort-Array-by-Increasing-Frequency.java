class Custom  implements Comparable<Custom> {
    int a;
    int freq;
    Custom(int x, int b) {
        a = x;
        freq = b;
    }
    public int compareTo(Custom other) {
        if(other.freq != this.freq) return (this.freq - other.freq);
        return (other.a - this.a);
    }
}
class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<Custom> que = new PriorityQueue<>();
        for(int i : map.keySet()) {
            que.offer(new Custom(i, map.get(i)));
        }
        int k = 0; 
        while(!que.isEmpty()) {
            int freq = que.peek().freq;
            for(int i = 0; i < freq; i++) {
                nums[k++] = que.peek().a;
            }
            que.poll();
        }
        return nums;
        
    }
}
