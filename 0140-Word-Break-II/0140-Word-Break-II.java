class Solution {
    HashSet<String> set;
    List<String> list;

    void helper(String s, int ind, String newstr) {
        if (ind == s.length())
            list.add(newstr.trim());

        StringBuilder sb = new StringBuilder();
        for (int i = ind; i < s.length(); i++) {
            sb.append(s.charAt(i));
            if (set.contains(sb.toString())) {
                sb.append(" ");
                helper(s, i + 1, newstr + sb.toString());
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }

    public List<String> wordBreak(String s, List<String> wordDict) {
        set = new HashSet<>(wordDict);
        list = new ArrayList<>();
        helper(s, 0, "");
        return list;

    }
}
