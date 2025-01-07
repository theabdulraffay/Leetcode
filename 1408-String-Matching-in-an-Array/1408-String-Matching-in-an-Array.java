class Solution {
    public List<String> stringMatching(String[] words) {
        Arrays.sort(words, (a,b) -> b.length() - a.length());
        List<String> list  = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for(String i : words) {
            for(String j : set) {
                if(j.contains(i)) if(!list.contains(i))list.add(i);
            }
            set.add(i);
        }
        return list;

        
    }
}
