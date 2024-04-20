class Solution {
    // String count(String base) {
    //     String str = "";
    //     ArrayList<Character> n = new ArrayList<>();
    //     for (int i = 0; i < base.length();i++) {
    //         if(!n.isEmpty() && !n.contains(base.charAt(i))) {
    //             str += Integer.toString(n.size()) + n.get(0);
    //             n.clear();
    //         }
    //         n.add(base.charAt(i));
    //     }

    //     if(!n.isEmpty()) {
    //             str += Integer.toString(n.size()) + n.get(0);
    //     }
    //     return str;
    // }
    String count2(String base) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 1; i < base.length(); i++) {
            if (base.charAt(i) == base.charAt(i - 1)) {
                count++;
            } else {
                result.append(count).append(base.charAt(i - 1)); 
                count = 1;
            }
        }
        result.append(count).append(base.charAt(base.length() - 1));
        return result.toString();
    }
    public String countAndSay(int n) {
        String base = "1";
        for (int i = 1; i < n; i++) {
            base = count2(base);
        }
        return base;
    }
}
