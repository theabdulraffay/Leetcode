class NumberContainers {
    HashMap<Integer, PriorityQueue<Integer>> map;
    HashMap<Integer, Integer> map2;

    public NumberContainers() {
        map = new HashMap<>();
        map2 = new HashMap<>();
    }
    
    public void change(int index, int number) {
        map2.put(index, number);
        map.putIfAbsent(number, new PriorityQueue<>());
        map.get(number).offer(index);
    }
    
    public int find(int number) {
        if(!map.containsKey(number)) return -1;
        PriorityQueue<Integer> pq = map.get(number);
        while(!pq.isEmpty() && map2.get(pq.peek()) != number) pq.poll();
        return  pq.isEmpty()? -1 : pq.peek();
        
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */
