class Solution {
    boolean helper(String[] s1, String[] s2) {
        int i = 0;
        int j = 0;
        while(j < s2.length && s1[j].equals(s2[j])) j++;
        while(i < s2.length && s1[s1.length - 1 - i].equals(s2[s2.length - 1 - i])) i++;
        return i + j >= s2.length;

    }
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] s1 = sentence1.split(" ");
        String[] s2 = sentence2.split(" ");
        return s1.length > s2.length ? helper(s1, s2) : helper(s2, s1);
        
    }
}
