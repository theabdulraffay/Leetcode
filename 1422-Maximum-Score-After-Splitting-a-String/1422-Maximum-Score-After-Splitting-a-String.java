class Solution {
    public int maxScore(String s) {
        int one = 0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == '1')
                one++;
        }
        //int  one = (int) s.chars().filter(ch -> ch == '1').count();

        int max = 0;
        int zero = 0;
        for(int i = 0;i<s.length();i++){
            int sum = 0;
            if(s.charAt(i) == '0' && i<s.length()-1)
                sum = ++zero + one;
 
            else sum = zero + --one;

            if(sum > max)max = sum;
        }
        return max;        
    }
}
