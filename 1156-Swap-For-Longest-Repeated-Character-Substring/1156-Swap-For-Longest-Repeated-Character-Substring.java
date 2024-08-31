class Solution {
    public int maxRepOpt1(String text) {
        int[] freq = new int[26];
        for (char c: text.toCharArray()) {
            freq[c - 'a']++;
        }
        int max = 1;
        int i = 0;
        int n = text.length();
        for(;i< n;) {
            int curr = text.charAt(i);
            int j = i + 1;
            int len = 1;
            while(j < n && text.charAt(j) == curr) {
                j++;
                len++;
            }
            int diff = j;
            j++;
            while(j < n && text.charAt(j) == curr) {
                j++;
                len++;
            }
            i = diff;
            len = Math.min(len + 1, freq[curr  - 'a']);
            
            max = Math.max(max, len);
        }        
        return max;
    }
}
