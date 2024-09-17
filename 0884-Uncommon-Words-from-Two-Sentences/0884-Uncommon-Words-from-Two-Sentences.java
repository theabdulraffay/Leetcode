class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] one = s1.split(" ");
        String[] two = s2.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for(String i : one) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for(String i : two) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        ArrayList<String> arr = new ArrayList<>();
        int i = 0;
        for(String m : map.keySet()) {
            if(map.get(m) == 1)
            arr.add(m);
        }
        String[] toret = new String[arr.size()];
        for(String m : arr) {
            toret[i++] = m;
        }

        return toret;
        
    }
}
