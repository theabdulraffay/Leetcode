class Solution {
    public int[] minOperations(String boxes) {
        char[] ch = boxes.toCharArray();
        int n = 0, m = 0, size = ch.length;
        int[] arr = new int[size + 1];
        int[] arr2 = new int[size + 1];
        for(int i = size - 1; i >= 0; i--) {
            arr[i] = arr[i + 1] + n;
            if(ch[i] == '1') n++;

            int ind = size - i - 1;
            arr2[ind + 1] = arr2[ind] + m;
            if(ch[ind] == '1') m++;
        }

        int[] toret = new int[size];
        for(int i = 0; i < size; i++) {
            toret[i] = arr[i] + arr2[i+1];
        }

        return toret;
    }
}
