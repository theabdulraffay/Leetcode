class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] arrOfStr = sentence.split(" ");
        HashSet<String> map = new HashSet<>();
        for(String s : dictionary) {
            map.add(s);
        }

        for(int i = 0; i < arrOfStr.length; i++) {
            // String te = "";
            StringBuilder sb = new StringBuilder();
            char[] curr = arrOfStr[i].toCharArray();
            for(int j = 0; j < curr.length; j++) {
                // te += curr[j];
                sb.append(curr[j]);
                if(map.contains(sb.toString())){
                    arrOfStr[i] = sb.toString();
                    break;
                }
            }
        }

        StringBuilder s = new StringBuilder("");
        for(String x : arrOfStr) {
            s.append(x);
            s.append(" ");
        }
        return s.toString().trim();
        
    }
}
