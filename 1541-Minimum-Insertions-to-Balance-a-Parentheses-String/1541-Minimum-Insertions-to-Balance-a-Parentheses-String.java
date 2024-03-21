class Solution {
    public int minInsertions(String s) {
        int opening = 0, closing = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '(') {
                opening++;
            } else {
                if (i + 1 < n && s.charAt(i+1) == ')') {
                    if (opening > 0) {
                        opening--;
                    } else {
                        closing++;
                    }
                    i++;
                } else {
                    if (opening > 0) {
                        opening--;
                        closing++;
                    } else {
                        closing += 2;
                    }
                }
            }
        }

        return opening*2 + closing;
        // Stack<Character> stack = new Stack();
        // int counter = 0;

        // for (int i = 0; i < s.length(); i++) {
        // char c = s.charAt(i);
        // if (c == '(') {
        // if (stack.isEmpty()) {
        // stack.push(c);
        // } else {
        // if (stack.peek() == ')') {
        // counter++;
        // stack.pop();
        // stack.pop();
        // }
        // stack.push(c);
        // }
        // } else { // c == ')'
        // if (stack.isEmpty()) {
        // counter++;
        // stack.push('(');
        // stack.push(c);
        // } else {
        // if (stack.peek() == ')') {
        // stack.pop();
        // stack.pop();
        // } else {
        // stack.push(c);
        // }
        // }
        // }
        // }

        // while (!stack.isEmpty()) {
        // if (stack.pop() == '(') {
        // counter+=2;
        // }else {
        // counter += 1;
        // stack.pop();
        // }
        // }
        // return counter;

    }
}
