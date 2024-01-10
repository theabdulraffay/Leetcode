class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int sum = 0;
        for(int i : gain){
            sum += i;
            if(sum > max){
                max = sum;
            }
        }
        return((max>0)?max:0);
        
    }
}
