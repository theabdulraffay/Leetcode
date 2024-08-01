class Solution {
    public int countSeniors(String[] details) {
        int counter = 0;
        for(String i : details) {
            if(Integer.parseInt(i.substring(11, 13)) > 60)counter++;
        }
        return counter;
        
    }
}
