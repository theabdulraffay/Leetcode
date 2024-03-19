class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] t = s.toCharArray();
        for ( char c : t) {
            if ( c == '(') {stack.push(c);}
            else {
                if(!stack.isEmpty() && stack.peek() == '(') {stack.pop();}
                else {stack.push(c);}
            }
        }
        return stack.size();
    }
}
