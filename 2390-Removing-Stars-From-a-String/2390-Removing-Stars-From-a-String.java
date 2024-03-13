class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        char[] t = s.toCharArray();
        for (char ch : t) {
            if(ch == '*') {
                sb.deleteCharAt(sb.length() - 1);
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();


        // Stack<Character> st = new Stack<>();
        // for(int i = 0;i<s.length(); i++) {
        //     char t = s.charAt(i);
        //     if (t == '*'){
        //         st.pop();
        //     }else{
        //         st.push(t);
        //     }
        // }
        // StringBuilder sb = new StringBuilder();
        // while(!st.isEmpty()) {
        //     sb.insert(0, st.pop());
        // }
        // System.out.print(sb);
        // return sb.toString();
        
    }
}
