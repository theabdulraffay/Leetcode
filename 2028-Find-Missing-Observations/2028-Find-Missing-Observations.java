class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum = 0;
        for(int i : rolls) sum += i;
        int total = ((rolls.length + n) * mean) - sum;
        if(total > n * 6 || total < n) return new int[0];
        int[] toret =  new int[n];
        Arrays.fill(toret, total / n);
        for(int i = 0; i < total % n; i++) toret[i]++;
        return toret;

        
    }
}
