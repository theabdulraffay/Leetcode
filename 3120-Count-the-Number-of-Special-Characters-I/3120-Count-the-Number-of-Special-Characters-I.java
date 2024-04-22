class Solution {
    public int numberOfSpecialChars(String word) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')
                list.add(word.charAt(i));
        }
        
        int c = 0;
        ArrayList<Character> list2 = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            char t = (char)((int)word.charAt(i) - 32);
            if(!list2.contains(word.charAt(i)) && word.charAt(i) >= 'a' && word.charAt(i) <= 'z' && list.contains((char)((int)word.charAt(i) - 32))){
                c++;
                list2.add(word.charAt(i));
            }
        }
        return c;
        
        
    }
}
