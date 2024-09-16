class Solution {
    public int maxTurbulenceSize(int[] arr) {
        if(arr.length < 2) return arr.length;
        int c = 1;
        int max = 1;
        boolean lef = arr[0] > arr[1];
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i + 1]) {
                c = 1;
                continue;
            }

            if(lef && arr[i] > arr[i + 1]) {
                c++;
                max = Math.max(max, c);
                lef = !lef;
            } else if(!lef && arr[i] < arr[i + 1]) {
                c++;
                max = Math.max(max, c);
                lef = !lef;
            } else {
                c = 1;
                lef = arr[i] > arr[i + 1];
                i--;
            }
        }
        return max;

    }
}
