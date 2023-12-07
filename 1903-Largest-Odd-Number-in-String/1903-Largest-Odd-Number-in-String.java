class Solution {
    public String largestOddNumber(String num) {  
        char[] nu = num.toCharArray();
        if((nu[nu.length-1] - '0') %2 == 1) return num;
        for(int i = nu.length-1;i>=0;i--){
            int te= nu[i] - '0';
            if(te%2 == 1){
                String str = num.substring(0,i+1);
                return(str);
            }
        }
        return "";
    }
}
