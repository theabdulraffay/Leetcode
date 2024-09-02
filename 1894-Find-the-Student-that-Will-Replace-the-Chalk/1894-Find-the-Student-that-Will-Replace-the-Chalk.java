class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        for(int i : chalk) {
            sum += (long)i;
        }
        sum = k % sum;
        for(int i = 0; i < chalk.length; i++) {
            if(sum < chalk[i]) return i;
            sum -= chalk[i];
        }
        return 0;
        
    }
}
