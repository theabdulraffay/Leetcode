class MapSum {
    ArrayList<String> str;
    ArrayList<Integer> num;
    public MapSum() {
        str = new ArrayList<>();
        num = new ArrayList<>();
        
    }
    
    public void insert(String key, int val) {
        if(str.contains(key)) {
            int index = str.indexOf(key);
            num.set(index, val);
            return;
        }
        str.add(key);
        num.add(val);
        
    }
    
    public int sum(String prefix) {
        int sum = 0;
        for (int i = 0; i < str.size(); i++) {
            if(prefix.length() <= str.get(i).length()){
            if(str.get(i).substring(0, prefix.length()).equals(prefix)) {
                sum += num.get(i);
            }
            }
        }
        return sum;
        
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */
