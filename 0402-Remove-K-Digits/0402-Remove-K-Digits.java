class Solution {
    public String removeKdigits(String num, int k) {
        if (k == num.length()) return "0";
        Stack<Character> st = new Stack<>();
        for (char i : num.toCharArray()) {
            while(k > 0 && !st.isEmpty() && i < st.peek()) {
                st.pop();
                k--;
            }
            st.push(i);
        }

        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }
        StringBuilder temp = new StringBuilder();
        while (!st.isEmpty()) {
            temp.append(st.pop());
        }
        temp.reverse();
        while (temp.length() > 1 && temp.charAt(0) == '0') {
            temp.deleteCharAt(0);
        }
        return temp.toString();
        
        
    }
}
