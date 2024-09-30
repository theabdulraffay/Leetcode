class CustomStack {
    int in;
    int[] arr;


    public CustomStack(int maxSize) {
        in = 0;
        arr = new int[maxSize];
        
    }
    
    public void push(int x) {
        if(in == arr.length) return;
        arr[in++] = x;
        
    }
    
    public int pop() {
        if(in == 0) return -1;
        return arr[--in];
        
    }
    
    public void increment(int k, int val) {
        int index = Math.min(k, in);
        for(int i = 0; i < index; i++) {
            arr[i] += val;
        }
        
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
