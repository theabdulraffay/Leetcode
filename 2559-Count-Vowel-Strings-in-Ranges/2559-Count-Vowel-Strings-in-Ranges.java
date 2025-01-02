class Solution {
    boolean check(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] temp = new int[words.length + 1];
        int count = 0;

        for(int c = 0; c < words.length; c++) {
            String i = words[c];
            if((check(i.charAt(0)) && check(i.charAt(i.length() - 1)))) {
                temp[c + 1] = ++count;
            } else {
                temp[c + 1] = count;
            }
        }
        System.out.println(Arrays.toString(temp));
        int[] toret = new int[queries.length];
        for(int i = 0; i < queries.length; i++) {
            toret[i] = temp[queries[i][1] + 1] - temp[queries[i][0]];
        }
        return toret;


        
    }
}
