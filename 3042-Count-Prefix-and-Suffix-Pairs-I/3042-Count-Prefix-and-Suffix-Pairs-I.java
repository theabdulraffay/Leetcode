class Solution {
    boolean heh(String fir, String sec) {
        if(fir.length() > sec.length()) return false;

        int j = 0;

        for(int i = 0; i < fir.length(); i++) {
            if(fir.charAt(i) != sec.charAt(j++)) {
                return false;
            }
        }

        j = sec.length() - 1;
        for(int i = fir.length() - 1; i >= 0; i--) {
            if(fir.charAt(i) != sec.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
    public int countPrefixSuffixPairs(String[] words) {
        int c = 0;
        int n = words.length;
        for(int i = 0;i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(heh(words[i], words[j])) c++;
            }
        }
        return c;
        
    }
}
