// class Pair{
//     int fir;
//     int sec;
//     Pair(int x, int y) {
//         fir = x;
//         sec = y;
//     }

//     public String toString() {
//         return fir + " " + sec;
//     }
// }
class Solution {
    // public int maximumBeauty(int[] nums, int k) {
    //     Arrays.sort(nums);
    //     int n = nums.length;
    //     Pair[] pair = new Pair[n];
    //     for(int i = 0; i < nums.length; i++) {
    //         int p = nums[i];
    //         pair[i] = new Pair(p - k, p + k);
    //     }
    //     // System.out.println(Arrays.toString(pair));
    //     // int max = 0;
    //     int left = 0;
    //     int i = 0;
    //     int fir = pair[0].sec;
    //     while(i < n && pair[i].fir <= fir) {
    //         i++;
    //     }
    //     if(i == n) return n;
    //     int max = i;

    //     while(i < n) {
    //         while(pair[i].fir > pair[left].sec) {
    //             left++;
    //         }
    //         max = Math.max(max, i - left + 1);
    //         i++;
    //     }
    //     return max;

        
    // }



    public int maximumBeauty(int[] pair, int k) {
        Arrays.sort(pair);
        int left = 0;
        int max = 0;

        for(int i = 0; i < pair.length; i++) {
            while(pair[i] - k > pair[left] + k) {
                left++;
            }
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}
