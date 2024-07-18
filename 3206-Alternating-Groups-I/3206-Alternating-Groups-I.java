class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int k = colors.length - 2;
        int n = colors.length;
        int count = 0;
        for(int i = 0; i < colors.length; i++) {
            if(colors[k % n ] == colors[i] && colors[k % n] != colors[(k + 1) % n]) {
                count++;
            }
            k++;
        }
        return count;
        
    }
}
