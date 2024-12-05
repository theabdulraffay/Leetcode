class Solution {
    public String longestWord(String[] words) {
        HashSet<String> set = new HashSet<>();
        Arrays.sort(words);
        String toret = "";
        for (String i : words) {
            if (i.length() == 1 || set.contains(i.substring(0, i.length() - 1))) {
                if (i.length() > toret.length())
                    toret = i;
                set.add(i);
            }
        }
        return toret;

    }
}
