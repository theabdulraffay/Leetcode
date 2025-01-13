class Solution {
    public int minimumLength(String s) {
        int[] arr = new int[26];
        for(char i : s.toCharArray()) arr[i - 'a']++;
        int c = 0;
        for(int i : arr) if(i != 0) c += (i % 2 == 1 ? 1 : 2);
        return c;
        
    }
}
