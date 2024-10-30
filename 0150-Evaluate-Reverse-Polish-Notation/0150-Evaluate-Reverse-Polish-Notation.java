class Solution {
    boolean check (String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }

    int calculate(int n1, int n2, char s) {
        if(s == '+') return n2 + n1;
        if(s == '-') return n2 - n1;
        if(s == '*') return n2 * n1;
        return n2 / n1;
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String i : tokens) {
            if(check(i)) {
                st.push(calculate(st.pop(), st.pop(), i.charAt(0)));
            } else {
                st.push(Integer.parseInt(i));
            }
        }
        return st.peek();

    }
}
