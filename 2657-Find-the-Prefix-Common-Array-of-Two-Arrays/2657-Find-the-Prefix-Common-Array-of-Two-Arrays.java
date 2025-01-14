class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int [] arr = new int[A.length];
        int [] toret = new int[A.length];
        int num = 0;
        for(int i = 0; i < A.length; i++) {
            arr[A[i] - 1]++;
            if (arr[A[i] - 1] == 2) num++;
            arr[B[i] - 1]++;
            if (arr[B[i] - 1] == 2) num++;
            toret[i] = num;
        }
        return toret;
        
    }
}
