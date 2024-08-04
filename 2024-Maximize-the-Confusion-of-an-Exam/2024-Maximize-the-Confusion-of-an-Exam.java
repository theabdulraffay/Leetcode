class Solution {
    int check(String s, char c, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != c)list.add(i);
        }
        if(list.size() <= k) return s.length();
        list.add(s.length());
        int max = 0;
        max = list.get(k);
        for(int i = k + 1; i < list.size(); i++) {
            int num = list.get(i) - (list.get(i - k - 1) + 1);
            max = Math.max(max, num);
        }
        return max;

    }
    public int maxConsecutiveAnswers(String answerKey, int k) {

        return Math.max(check(answerKey, 'T', k), check(answerKey, 'F', k));
        
    }
}
