class Solution {
    public char findTheDifference(String s, String t) {
        char[] r = s.toCharArray();
        char[] m = t.toCharArray();
        Arrays.sort(r);
        Arrays.sort(m);
        int i =0;
        while (i < r.length ){
            if(r[i] != m[i]){
                return m[i];
            }
            i++;
        }
        return m[m.length - 1];
    }
}
