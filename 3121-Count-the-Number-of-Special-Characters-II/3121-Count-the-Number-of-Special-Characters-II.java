class Solution {
    public int numberOfSpecialChars(String word) {
        Map<Character, Integer> lower = new HashMap<>();        
        Map<Character, Integer> upper = new HashMap<>();
        
        for (int i = 0; i < word.length(); i++) {
            char te = word.charAt(i);
            if (Character.isLowerCase(te)){
                lower.put(te, i);
            }else{
                te = Character.toLowerCase(te);
                if(!upper.containsKey(te)) {
                    upper.put(te, i);
                }
            }
        }
        
        int c = 0;
        for(char i = 'a'; i <= 'z'; i++) {
            if (upper.containsKey(i) && lower.containsKey(i)){
                if(lower.get(i) < upper.get(i))
                    c++;
            }
        }
        
        return c;
        
        

        
    }
}
