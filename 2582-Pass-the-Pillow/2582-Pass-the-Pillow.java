class Solution {
    public int passThePillow(int n, int time) {
        while(time >= n * 2) { // we know that time is greater then one complete round so we simply minus it from time
            time -= n*2 - 2;
        }
        int p = 1;
        var dir = true;

        while(time-- > 0) {
            if(dir) {
                p++;
            }else {
                p--;
            }

            if(p == 1 || p == n) {
                dir = !dir;
            }
        }
        return p;
        
    }
}
