class Solution {
    public int trailingZeroes(int n) {
        // int count = 0;
        // for (int i = 5; n / i >= 1; i *= 5) {
        //     count += n / i;
        // }
        // return count;

        int multiplesOf5 = n / 5;
        int multiplesOf25 = n / 25;
        int multiplesOf125 = n / 125;
        int multiplesOf625 = n / 625;
        int multiplesOf3125 = n / 3125;

        return multiplesOf5 + multiplesOf25 + multiplesOf125 + multiplesOf625 + multiplesOf3125;
         
    }
}
