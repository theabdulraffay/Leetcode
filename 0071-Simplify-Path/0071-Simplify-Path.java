class Solution {
    public String simplifyPath(String path) {
        String[] str = path.split("/");
        Stack<String> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (String i : str) {
            if(i.length() == 0 || i.equals(".")) continue;
            if(i.equals("..")) {
                if(!st.isEmpty()) st.pop();
            } else st.push(i);
        }
        while(!st.isEmpty()) {
            sb.insert(0, st.pop());
            sb.insert(0, "/");
        }
        return sb.length() == 0 ? "/" : sb.toString();
        
    }
}
