class Sort implements Comparator<String> {
    public int compare(String x, String y) {
 
        String xy = x+y;
        String yx = y+x;
        return yx.compareTo(xy);
    }
}

class Solution {
    public String largestNumber(int[] nums) {
        String[] str =  new String[nums.length];
        for(int i = 0; i < nums.length; i++) {
            str[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(str, new Sort());
        if(str[0].charAt(0) == '0') return "0";
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < str.length ; i++)sb.append(str[i]);
        
        return sb.toString();

        
    }
}
