class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sum = 0;
        int max = 0;
        int another = 0;
        int n = grumpy.length; 
        for(int i = 0; i < n; i++) {
            if(grumpy[i] == 0)sum += customers[i];
        }
        for(int i = 0; i < minutes; i++) {
            if(grumpy[i] == 1) another += customers[i];
        }
        max = Math.max(max, sum + another);

        for(int i = minutes; i < n; i++) {
            if(grumpy[i - minutes] == 1) another -= customers[i - minutes];
            if(grumpy[i] == 1) another += customers[i];
            max = Math.max(max, sum + another);
        }
        return max;

        
    }
}
