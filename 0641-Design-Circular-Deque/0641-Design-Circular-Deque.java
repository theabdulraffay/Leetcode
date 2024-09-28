class MyCircularDeque {
    int size;
    int k;
    LinkedList<Integer> arr;

    public MyCircularDeque(int k) {
        this.k = k;
        size = 0;
        arr = new LinkedList<>();
    }
    
    public boolean insertFront(int value) {
        if(isFull()) return false;
        arr.addFirst(value);
        size++;
        return true;
        
    }
    
    public boolean insertLast(int value) {
        if(isFull()) return false;
        arr.addLast(value);
        size++;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty()) return false;
        arr.removeFirst();
        size--;
        return true;

    }
    
    public boolean deleteLast() {
        if(isEmpty()) return false;
        arr.removeLast();
        size--;
        return true;
    }
    
    public int getFront() {
        if(isEmpty()) return -1;
        return arr.getFirst();
    }
    
    public int getRear() {
        if(isEmpty()) return -1;
        return arr.getLast();
        
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == k;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
