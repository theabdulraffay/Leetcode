class MyHashSet {
    boolean[] b = new boolean[1000001];
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        b[key] = true;   
    }
    
    public void remove(int key) {
        b[key] = false;
    }
    
    public boolean contains(int key) {
        return b[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
