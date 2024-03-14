class MinStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minst = new Stack<>();
    public MinStack() {}
    
    public void push(int val) {
        if(val <= min){
            min = val;
            minst.push(min);
        }

        else if(stack.isEmpty()) {
            minst.clear();
            min = Integer.MAX_VALUE;
        }
        stack.push(val);
    }
    
    public void pop() {
        if(!stack.isEmpty() && stack.peek() == min){
            minst.pop();
            if (!minst.isEmpty()) min = minst.peek();
            else min = Integer.MAX_VALUE;
        }
        if(!stack.isEmpty())stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
