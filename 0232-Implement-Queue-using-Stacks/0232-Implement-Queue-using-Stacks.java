class MyQueue {
    // int[] data;
    // int size = 0;
    // int front = 0, end = 0;
    Stack<Integer> first = new Stack<Integer>();
	Stack<Integer> second = new Stack<Integer>();

    public MyQueue() {
        // data = new int[100];
    }
  
    public void push(int x) {
        // data[end++] = x;
        // size++;
        first.push(x);
    }
    
    public int pop() {
        // size--;
        // return data[front++];
		while(!first.isEmpty()){
			second.push(first.pop());
		}
		int removed = second.pop();
		while(!second.isEmpty()){
			first.push(second.pop());
		}
	  	return removed;        
    }
    
    public int peek() {
        // return data[front];
        while(!first.isEmpty()){
			second.push(first.pop());
		}

		int removed = second.peek();

		while(!second.isEmpty()){
			first.push(second.pop());
		}
		return removed;	
    }
    
    public boolean empty() {
        // return size == 0;
        return first.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
