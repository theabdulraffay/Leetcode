class Solution {
    boolean assist(char logical, boolean exp1, boolean exp2) {
        if (logical == '|')
            return exp1 | exp2;
        return exp1 & exp2;
    }

    void ass(char op, Stack<Character> ch) {
        boolean temp = (ch.pop() == 't');
        if (op == '!') {
            temp = !temp;
        } else {
            while (!ch.isEmpty() && ch.peek() != '(') {
                temp = assist(op, temp, ch.pop() == 't');
            }
        }
        ch.pop();
        ch.push(temp ? 't' : 'f');
    }

    public boolean parseBoolExpr(String expression) {
        Stack<Character> sp = new Stack<>();
        Stack<Character> ch = new Stack<>();

        for (char i : expression.toCharArray()) {
            if (i == ',')
                continue;
            if (i == '|' || i == '&' || i == '!') {
                sp.push(i);
            } else if (i == ')') {
                ass(sp.pop(), ch);
            } else {
                ch.push(i);
            }
        }

        return ch.peek() == 't';
    }
}
