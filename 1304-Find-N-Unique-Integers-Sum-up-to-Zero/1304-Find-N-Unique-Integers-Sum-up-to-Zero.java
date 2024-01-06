class Solution {
    public int[] sumZero(int n) {
        int[] list = new int[n];
        int c = 0;
        for(int i =1;i<=n/2;i++){
            list[c++] = i;
            list[c++] = i * -1;
        }
        return (list);
        
    }
} 
