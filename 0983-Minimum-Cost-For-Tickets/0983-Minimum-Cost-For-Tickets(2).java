class Solution {
    int[] days, costs, arr;
    public int nextInt(int j, int find) {
        while(j < days.length && days[j] < find) j++;
        return j;
    }

    public int helper(int index) {
        if (index == days.length) return 0;
        if(arr[index] != 0) return arr[index];
        int min = costs[0] + helper(index + 1);
        min = Math.min(min, costs[1] + helper(nextInt(index, days[index] + 7)));
        min = Math.min(min, costs[2] + helper(nextInt(index, days[index] + 30)));
        return arr[index] = min;
    }

    public int mincostTickets(int[] days, int[] costs) {
        this.arr = new int[days.length];
        this.days = days;
        this.costs = costs;
        return helper(0);

    }
}
