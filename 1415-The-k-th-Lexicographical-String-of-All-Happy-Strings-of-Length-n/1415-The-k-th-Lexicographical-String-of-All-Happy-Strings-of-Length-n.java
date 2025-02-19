class Solution {
    int size;
    String s;

    int helper(int n, StringBuilder sb, char v) {
        if (sb.length() == n) {
            if (--size == 0) {
                s = sb.toString();
                return 1;
            }
            return 0;
        }
        for (char i = 'a'; i <= 'c'; i++) {
            if (v == i) continue;
            sb.append(i);
            if (helper(n, sb, i) == 1) return 1;
            sb.deleteCharAt(sb.length() - 1);
        }
        return -1;
    }

    public String getHappyString(int n, int k) {
        size = k;
        s = "";
        helper(n, new StringBuilder(), '.');
        if (s.length() != 0) return s;
        return "";

    }
}
