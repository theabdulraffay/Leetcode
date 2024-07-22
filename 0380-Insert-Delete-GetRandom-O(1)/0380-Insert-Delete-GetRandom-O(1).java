class RandomizedSet {
    HashMap<Integer, Integer> map;
    List<Integer> value;
    Random random;
    public RandomizedSet() {
        value = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)) return false;
        map.put(val, value.size());
        value.add(val);
        return true;
        
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;
        int index = map.get(val);
        map.put(value.get(value.size() - 1), index);
        map.remove(val);
        value.set(index, value.get(value.size() - 1));
        value.remove(value.size() - 1);
        return true;
        
    }
    
    public int getRandom() {
        int i = random.nextInt(value.size());
        return value.get(i);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
