class Solution {
    int index(char c) {
        if(c == 'Q') return 0;
            else if(c == 'W') return 1;
            else if(c == 'E') return 2;
            else return 3;
    }
    public int balancedString(String s) {
        int[] arr = new int[4];
        for(char c : s.toCharArray()) {
            arr[index(c)]++;
        }
        int target = s.length()/4;
        int left = 0;
        int min = s.length();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            arr[index(c)]--;
            while(left < s.length()
                && arr[index('Q')] <= target
                && arr[index('E')] <= target
                && arr[index('R')] <= target
                && arr[index('W')] <= target
                ) {
                min = Math.min(min, i - left + 1);
                char m = s.charAt(left++);
                arr[index(m)]++;
            }
        }
        return min;// == s.length() + 1 ? 0 :min;

        
    }
}
