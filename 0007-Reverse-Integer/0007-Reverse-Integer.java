class Solution {
    public int reverse(int x) {
        long fin = 0;
        while(x!=0){
            int t = x%10;
            fin += t;
            fin *= 10;
            x /= 10;
        }
        fin /= 10;
        if(fin > Integer.MAX_VALUE || fin < Integer.MIN_VALUE){
            return 0;
        }
        return ((x<0)? (int)fin * -1 : (int)fin);
    }
}
