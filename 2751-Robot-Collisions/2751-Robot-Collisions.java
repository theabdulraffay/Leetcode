class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        HashMap<Integer, Character> direction = new HashMap<>();
        HashMap<Integer, Integer> health = new HashMap<>();
        for(int i = 0; i < positions.length; i++) {
            direction.put(positions[i], directions.charAt(i));
            health.put(positions[i], healths[i]);
        }

        int[] newpos = Arrays.copyOf(positions, positions.length);
        Arrays.sort(newpos);

        Stack<Integer> st = new Stack<>();
        for(int c : newpos) {
            int m = 0;
            while(!st.isEmpty() && 
            direction.get(c) == 'L' && 
            direction.get(st.peek()) == 'R' &&
            health.containsKey(c) &&
            health.containsKey(st.peek())
            ) {
                m = 1;
                int h1 = health.get(c);
                int h2 = health.get(st.peek()); 
                if(h1 == h2) {
                    // st.pop();
                    health.remove(st.pop());
                    health.remove(c);

                } else if(h2 > h1) {
                    health.put(st.peek(), h2 - 1);
                    health.remove(c);
                    // st.pop();
                } else {
                    health.remove(st.pop());
                    health.put(c, h1 - 1);
                }
            }
            if(m == 0){
                st.push(c);
            }
        }

        List<Integer> toret = new ArrayList<>();
        for(int c : positions) {
            if(health.containsKey(c)) {
                toret.add(health.get(c));
            }
        }
        return toret;
        
        

    }
}
