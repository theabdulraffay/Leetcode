class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] leftSmall = new int[n];
        int[] rightSmall = new int[n];
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        int j = n-1;

        for(int i = 0; i< n; i++){
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }

            leftSmall[i] = stack.isEmpty() ? 0 : stack.peek() + 1;
            stack.push(i);
        }
        for(int i = n - 1; j >= 0;j--) {
            while(!stack2.isEmpty() && heights[stack2.peek()] >= heights[j]){
                stack2.pop();
            }
            rightSmall[j] = stack2.isEmpty() ? n-1 : stack2.peek() - 1;
            stack2.push(j);
        }
        int max = 0;
        for (int i = 0;i<n;i++){
            int t = rightSmall[i] - leftSmall[i] + 1;
            t = t * heights[i];
            max = Math.max(max,t);
        }
        return max;

    }
}
