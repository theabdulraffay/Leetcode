class Solution {
    public String[] findRelativeRanks(int[] score) {
    int n = score.length;
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0 ; i < score.length; i ++) {
            m.put(score[i], i);
        }
        Arrays.sort(score);
        String[] r = new String[score.length];
        for(int i = 0; i < score.length; i++) {
            int ind = m.get(score[i]);
            if (i == n-1) r[ind] = "Gold Medal";
            else if (i == n-2) r[ind] = "Silver Medal";
            else if (i == n-3) r[ind] = "Bronze Medal";
            else r[ind] = String.valueOf(n-i); 

        }
        return r;
    }
}
