class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] occurence = new int[26];
        for (int i = 0 ; i < s.length(); i++) {
            occurence[s.charAt(i) - 'a']  = i;
        }

        int left = -1, max = 0;
        List<Integer> toret = new ArrayList<>();
        for (int i = 0 ; i < s.length(); i++) {
            char c = s.charAt(i);
            max = Math.max(max, occurence[c - 'a']);
            if (i == max) {
                toret.add(i - left);
                left = i;
            }
        }
        return toret;
        
    }
}
