class Solution {
    public boolean isPrime(int x) {
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean primeSubOperation(int[] nums) {
        for(int i = nums[0] - 1; i > 1;i--) {
            if(isPrime(i)) {
                nums[0] -=i;
                break;
            }
        }

        for(int i = 1; i < nums.length; i++) {
            int prime = nums[i] - nums[i-1];
            if(prime <= 0) return false;
            while(prime > 1 ) {
                if(isPrime(prime) && nums[i] - prime > nums[i-1]) {
                    nums[i] -= prime;
                    break;
                }
                prime--;
            }
        }
        return true;
        
    }
}
