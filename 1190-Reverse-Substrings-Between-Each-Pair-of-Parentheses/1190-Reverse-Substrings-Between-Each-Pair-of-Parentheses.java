class Solution {
    void helper(Stack<Character>  st) { // will reverse the string till the last parenthesis
        Queue<Character> que = new LinkedList<>();
        while(st.peek() != '(') {
            que.offer(st.pop());
        } 
        st.pop();
        while(!que.isEmpty()) {
            st.push(que.poll());
        }
    }

    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == ')') {
                helper(st);
            } else {
                st.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}
