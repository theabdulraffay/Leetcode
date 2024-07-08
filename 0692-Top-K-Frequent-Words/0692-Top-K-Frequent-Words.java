class Pair implements Comparable<Pair> {
    String x;
    int y;
 
    public Pair(String x, int y)
    {
        this.x = x;
        this.y = y;
    }
 
    public String toString()
    {
        return "(" + x + "," + y + ")";
    }
 
    @Override public int compareTo(Pair a)
    {
        return a.y != this.y ? a.y - this.y : -a.x.compareTo(this.x);
    }
}

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();

        for (String word: words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        List<String> toret = new ArrayList<>();
        List<String> word = new ArrayList<>(map.keySet());
        PriorityQueue<Pair> que = new PriorityQueue<>();
        for(String s : word) {
            que.offer(new Pair(s, map.get(s)));

        }

        while(k-- > 0) {
            toret.add(que.poll().x);
        }
        return toret;

        
    }
}
