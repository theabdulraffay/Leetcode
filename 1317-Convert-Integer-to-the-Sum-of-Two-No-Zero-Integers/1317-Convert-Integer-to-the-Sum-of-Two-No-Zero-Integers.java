class Solution {
    public static boolean check(int n){
        String te = String.valueOf(n);
        for(int i =0;i<te.length();i++){
            if(te.charAt(i) == '0'){
                return false;
            }
        }
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
        int[] list = new int[2];
        for(int i =1;i<n;i++){
            int b = n-i;
            if(check(i) && check(b)){
                list[0] = i;
                list[1] = b;
                break;
            }
        }
        return list;
        
    }
}
