class RandomizedCollection {
    HashMap<Integer, Integer> map;
    Random rand;
    List<Integer> list;
    public RandomizedCollection() {
        map = new HashMap<>();
        rand = new Random();
        list = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        boolean toret = true;
        if(map.containsKey(val)) {
            map.put(val, map.get(val) + 1);
            toret = false;
        } else {
            map.put(val, 1);
        }
        list.add(val);
        return toret;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;

        map.put(val, map.get(val) - 1);
        if(map.get(val) == 0) map.remove(val);
        
        int index = list.indexOf(val);
        list.set(index, list.get(list.size() - 1));
        list.remove(list.size() - 1);
        return true;
    }
    
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
