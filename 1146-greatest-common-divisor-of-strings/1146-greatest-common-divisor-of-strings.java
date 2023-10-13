class Solution {
    public String gcdOfStrings(String str1, String str2) {
       int l2= str2.length();
        int l1 = str1.length();
        int temp = 0;
        if ((str1+str2).equals(str2+str1)) {
            while (l2 != 0) {
                temp = l2;
                l2 = l1 % l2;
                l1 = temp;
            }
            return str1.substring(0, l1);
        }
        return "";
    }
}