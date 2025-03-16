class Solution {
    public long repairCars(int[] ranks, int cars) {
        long st = 1, en = 1l * ranks[0] * cars * cars;
      
        while (st < en) {
            long mid = st + (en - st) / 2, repaired = 0;
            for(int rank : ranks) {
                repaired += (long)(Math.sqrt(mid/rank));
            }
            if (repaired < cars) st = mid + 1;
            else en = mid; 
        }

        return st;
        
    }
}
