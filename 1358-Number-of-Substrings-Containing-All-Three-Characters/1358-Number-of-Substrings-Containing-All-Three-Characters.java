class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;
        int i = 0;
        int left = 0;
        int n = s.length();
        int[] arr =new int[3];
        while(i < n) {
            char c = s.charAt(i);
            arr[c - 'a']++;
            while(arr[0] >= 1 && arr[1] >= 1 && arr[2] >= 1) {
                count += (n - i);
                arr[s.charAt(left++) - 'a']--;
            }
            i++;
        }
        return count;
    }
}
