class Solution {
    public int numberOfAlternatingGroups(int[] arr, int k) {
        int c = 0;
        for (int i = 1; i < k; i++) {
            if (arr[i] == arr[i - 1]) c++;
        }
        int n = arr.length;
        int max = 0;
        int in = k - 1;

        for (int i = 0; i < n; i++) {
            int ind = (i+k) % n;
            if(arr[ind] == arr[in]) c++;
            if(arr[i] == arr[(i+ 1) % n]) c--;
            in = ind;
            if(c == 0) max++;

        }

        return max;
        
    }
}
