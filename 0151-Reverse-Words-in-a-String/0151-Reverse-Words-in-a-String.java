class Solution {
    public String reverseWords(String s) {
        List<String> str = Arrays.asList(s.split(" ")).reversed();
        System.out.println(str);
        String newStr = "";
        for(String i : str){
            if(!i.equals(" ") && !i.equals("")){
                newStr += i;
                newStr += " ";
            }
        }
        return newStr.substring(0, newStr.length()-1);
        
    }
}
