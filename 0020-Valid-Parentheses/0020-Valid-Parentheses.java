class Solution {
    public boolean isValid(String t) {
        Stack<Character> stack = new Stack<>();
        if(t.length() < 2)return false;
        for(int i = 0;i<t.length(); i++){
            char k = t.charAt(i);
            if(k == '(' || k == '[' || k == '{'){
                stack.push(k);
            }else if(!stack.isEmpty()){
                char top = stack.pop();
                if(k == ')' && top != '('){
                    return false;
                }else if(k == ']' && top != '['){
                    return false;
                }else if(k == '}' && top != '{'){
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return stack.isEmpty();
        
    }
}
