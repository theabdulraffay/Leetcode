class Solution {
    public String clearDigits(String s) {
        Stack<Character> sb = new Stack<>();
        for(char i : s.toCharArray()) {
            if(Character.isDigit(i) && !sb.isEmpty()) sb.pop();
            if(Character.isLetter(i))sb.push(i);
        }
        StringBuilder sh = new StringBuilder();
        while(!sb.isEmpty()) sh.append(sb.pop());
            // Systm.out.println(sh);
        return sh.reverse().toString();
        
    }
}
