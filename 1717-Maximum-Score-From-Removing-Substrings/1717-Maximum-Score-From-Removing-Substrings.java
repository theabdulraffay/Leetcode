class Solution {
    String delete(String s, String torem) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == torem.charAt(1) &&
                !st.isEmpty() &&
                st.peek() == torem.charAt(0)
            ) {
                st.pop();
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
    public int maximumGain(String s, int x, int y) {
        Stack<Character> st = new Stack<>();
        String high = x > y ? "ab" : "ba";
        String low  = x < y ? "ab" : "ba";

        String afterDeletion = delete(s, high);
        int toret = 0;

        toret += (s.length() - afterDeletion.length()) / 2 * Math.max(x, y);

        String another = delete(afterDeletion, low);
        toret += (afterDeletion.length() - another.length()) / 2 * Math.min(x, y);
        return toret;
        
    }
}
