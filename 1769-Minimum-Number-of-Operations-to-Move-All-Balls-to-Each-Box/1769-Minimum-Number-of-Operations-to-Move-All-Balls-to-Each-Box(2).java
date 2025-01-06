class Solution {
    public int[] minOperations(String boxes) {
        int[] arr = new int[boxes.length()];
        char[] ch = boxes.toCharArray();
        for(int i = 0; i < ch.length; i++) {
            int n = 0;
            for(int j = 0; j < ch.length; j++) {
                if(i == j) continue;
                if(ch[j] == '1')n += Math.abs(j - i);
            }
            arr[i] = n;
        }
        return arr;
        
    }
}
