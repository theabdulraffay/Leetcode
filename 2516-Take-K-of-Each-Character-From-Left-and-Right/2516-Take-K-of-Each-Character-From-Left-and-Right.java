class Solution {
    public int takeCharacters(String s, int k) {
        if(k == 0) return 0;
        int[] arr = new int[3];
        int n = s.length();
        int j = n - 1;
        while(arr[0] < k || arr[1] < k || arr[2] < k) {
            if(j == -1) return -1;
            arr[s.charAt(j--) - 'a']++;
        }
        int min = n;

        for(int i = 0; i <= n; i++) {
            while(j < n && arr[0] >= k && arr[2] >= k && arr[1] >= k) {
                min = Math.min(min, i + (n - j - 1));
                ++j;
                if(j < n)arr[s.charAt(j) - 'a']--;
            }
            if(i < n)arr[s.charAt(i) - 'a']++;
        }
        return min;
        
    }
}
