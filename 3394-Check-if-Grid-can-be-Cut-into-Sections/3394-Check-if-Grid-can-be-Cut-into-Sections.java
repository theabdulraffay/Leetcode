class Solution {
    public boolean checkValidCuts(int n, int[][] rectangles) {
        Arrays.sort(rectangles, (a, b) -> a[1] - b[1]);
        int c = 0;
        int max = rectangles[0][3];
        for(int i = 1; i < rectangles.length; i++) {
            int j[] = rectangles[i];
            if(j[1] < max) {
                max = Math.max(max, j[3]);
            } else {
                c++;
                max = j[3];
            }
        }
        if(c >= 2) return true;

        Arrays.sort(rectangles, (a, b) -> a[0] - b[0]);
        c = 0;
        max = rectangles[0][2];
        for(int i = 1; i < rectangles.length; i++) {
            int j[] = rectangles[i];
            if(j[0] < max) {
                max = Math.max(max, j[2]);
            } else {
                c++;
                max = j[2];
            }
        }

        return c>=2;

        
    }
}
