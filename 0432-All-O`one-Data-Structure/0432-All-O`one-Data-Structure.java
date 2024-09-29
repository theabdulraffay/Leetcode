class AllOne {
    private Map<String, Integer> map;
    private TreeSet<Pair<String, Integer>> set;

    public AllOne() {
        map = new HashMap<>();
        set = new TreeSet<>((a, b) -> a.getValue() == b.getValue() ? a.getKey().compareTo(b.getKey()) : a.getValue() - b.getValue());
        
    }
    
    public void inc(String key) {
        int n = map.getOrDefault(key, 0);
        map.put(key, n + 1);
        set.remove(new Pair<>(key, n));
        set.add(new Pair<>(key, n + 1));
        
    }
    
    public void dec(String key) {
        int n = map.get(key);
        set.remove(new Pair<>(key, n));
        if(n == 1) {
            map.remove(key);
            return;
        }
        map.put(key, n - 1);
        set.add(new Pair<>(key, n - 1));
        
    }
    
    public String getMaxKey() {
        return set.isEmpty() ? "" : set.last().getKey();
        
    }
    
    public String getMinKey() {
        return set.isEmpty() ? "" : set.first().getKey();

        
    }
}

/**
 * Your AllOne object will be instantiated and called as such:
 * AllOne obj = new AllOne();
 * obj.inc(key);
 * obj.dec(key);
 * String param_3 = obj.getMaxKey();
 * String param_4 = obj.getMinKey();
 */
