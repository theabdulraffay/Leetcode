class Solution {
    public String compressedString(String word) {
        int n = word.length();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            int count = 0;
            char c = word.charAt(i);
            while(i < n && word.charAt(i) == c) {
                count++;
                i++;
                if(count == 9) break;
            }
            i--;
            sb.append(count);
            sb.append(c);
        }
        return sb.toString();
        
    }
}
