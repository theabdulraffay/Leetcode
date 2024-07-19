class Solution {
    public int countGoodSubstrings(String s) {
        char[] ch = s.toCharArray();
        int count = 0;
        for(int i = 2; i < ch.length; i++) {
            if(ch[i] != ch[i - 1] && ch[i] != ch[i - 2] && ch[i - 1] != ch[i - 2]) count++;
        }
        return count;

        // if(s.length() < 3) return 0;
        // HashSet<Character> st = new HashSet<>();
        // int left = 1;
        // int right = 0;
        // while(right < 3) {
        //     st.add(s.charAt(right++));
        // }
        // int count = 0;
        // if(st.size() == 3)count++;
        // st.clear();

        // while(right < s.length()) {
        //     while(left<= right) {
        //         st.add(s.charAt(left++));
        //     }
        //     if(st.size() == 3) count++;
        //     right++;
        //     left -= 2;
        //     st.clear();
        // }
        // return count;
        
    }
}
