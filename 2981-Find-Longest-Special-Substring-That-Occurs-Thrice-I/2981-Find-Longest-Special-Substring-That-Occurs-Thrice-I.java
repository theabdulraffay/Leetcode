class Solution {
    public int maximumLength(String s) {
        int c = 1;
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {
                if(s.charAt(j) == s.charAt(j - 1)) {
                    map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + 1);
                    sb.append(s.charAt(j));
                } else break;
            }
            map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + 1);
        }
        int max = -1;
        for(String i : map.keySet()) {
            if(map.get(i) >= 3) max = Math.max(max, i.length());
        }
        return max;
        
    }
}
