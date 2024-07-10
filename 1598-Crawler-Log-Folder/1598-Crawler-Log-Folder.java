class Solution {
    public int minOperations(String[] logs) {
        int op = 0;
        for(String s : logs) {
            if(s.equals("../")) {
                if(op != 0) op--;
            } else if (s.charAt(0) != '.') op++;
          
        }
        return op;
    }
}
