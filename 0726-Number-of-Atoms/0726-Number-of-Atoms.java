class Robo {
    String f;
    int val;
    Robo(String f) {
        this.f = f;
        val = 1;
    }
}
class Solution { // A tough one indeed 
    void recursiveUpdate(Stack<Robo> st, int n) {
        if(st.peek().f.equals("(")) {
            st.pop();
            return;
        }
        Robo r = st.pop();
        recursiveUpdate(st, n);
        r.val *= n;
        st.push(r);

    }
    public String countOfAtoms(String formula) {
        Stack<Robo> st = new Stack<>();
        HashSet<String> toSort = new HashSet<>();

        for(int i = 0; i < formula.length() ; i++) {
            boolean num = false;
            char curr = formula.charAt(i);
            if(Character.isDigit(curr)) num = true;
            String touse = "" + curr; 
            if(num) {
                while(i + 1 < formula.length() && 
                Character.isDigit(formula.charAt(i + 1))) {

                    touse += formula.charAt(i + 1);
                    i++;
                }
                
            } else if(Character.isUpperCase(curr)) {
                while(i + 1 < formula.length() && 
                Character.isLowerCase(formula.charAt(i + 1))) {

                    touse += formula.charAt(i + 1);
                    i++;
                }
                toSort.add(touse);

            }

            //-------------------------------------------

            if(num) {
                int n = Integer.parseInt(touse);
                if(st.peek().f.equals(")")) {
                    st.pop();
                    recursiveUpdate(st, n);
                } else {
                    st.peek().val *= n;
                }

            } else {
                st.push(new Robo(touse));
            }

        }
        List<String> tos = new ArrayList<>(toSort);
        Collections.sort(tos);
        HashMap<String, Integer> map = new HashMap<>();
        while(!st.isEmpty()) {
            map.put(st.peek().f, map.getOrDefault(st.peek().f, 0) + st.peek().val);
            st.pop();
        }
        StringBuilder sb = new StringBuilder();
        for(String c : tos) {
            sb.append(c);
            if(map.get(c) != 1) {
                sb.append(map.get(c));
            }
        }
        

        return sb.toString();

        
    }
}
