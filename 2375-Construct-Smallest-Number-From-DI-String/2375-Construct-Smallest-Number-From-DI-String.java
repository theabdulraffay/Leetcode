class Solution {
    boolean helper(String pattern, StringBuilder n, int i, boolean[] visited) {
        if(i == pattern.length()) return true;
        int t = n.charAt(i) - '0';
        for(int k = 1; k < 10; k++) {
            if(visited[k]) continue;
            if((pattern.charAt(i) == 'I' && k > t) || (pattern.charAt(i) == 'D' && k < t)){
                n.append(k);
                visited[k] = true;
                if(helper(pattern, n, i + 1, visited)) return true;
                n.deleteCharAt(n.length() - 1);
                visited[k] = false;
            }
        }
        return false;

    }
    public String smallestNumber(String pattern) {
        for(int i = 1; i < 10; i++) {
            StringBuilder sb = new StringBuilder();
            boolean[] v = new boolean[10];
            sb.append(i);
            v[i] = true;
            if(helper(pattern, sb, 0, v)) return sb.toString();
        }
        return "";

        
    }
}
