class Solution {
    void add(StringBuilder sb, char c, int n) {
        for (int i = 0; i < n; i++) {
            sb.append(c);
        }
    }

    boolean add(StringBuilder sb, char c, Map<Character, Integer> map) {
        for (char i = c; i >= 'a'; i--) {
            if (map.containsKey(i)) {
                sb.append(i);
                map.put(i, map.get(i) - 1);
                if (map.get(i) == 0)
                    map.remove(i);
                // System.out.println(sb + " "+map);
                return false;
            }
        }
        return true;
    }

    public String repeatLimitedString(String s, int repeatLimit) {
        Map<Character, Integer> map = new HashMap<>();
        for (char i : s.toCharArray()) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for (char i = 'z'; i >= 'a'; i--) {
            while (map.containsKey(i)) {
                int n = Math.min(repeatLimit, map.get(i));
                if (sb.length() != 0 && sb.charAt(sb.length() - 1) == i)
                    --n;
                add(sb, i, n);
                map.put(i, map.get(i) - n);
                if (map.get(i) == 0) {
                    map.remove(i);
                    break;
                }

                if (add(sb, (char) (i - 1), map)) {
                    return sb.toString();
                }
            }
        }
        return sb.toString();

    }
}
