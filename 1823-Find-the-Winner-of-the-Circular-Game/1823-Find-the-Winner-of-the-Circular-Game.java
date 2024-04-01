class Solution {
    public int findTheWinner(int n, int k) {
        // Queue<Integer> que = new LinkedList<>();
        // for (int i = 1; i <= n; i++) { que.add(i); }
        // k = (k > n) ? k%n : k;
        // while (que.size() > 1) {
        //     for (int i = 1; i < k; i++) {
        //         que.add(que.poll());
        //     }
        //     que.poll();
        // }
        // return que.poll();

        ArrayList<Integer> arr = new ArrayList<>();
        int c = 0;
        for (int i = 1; i <= n; i++) { arr.add(i); }

        while (arr.size() > 1) {
            for (int i = 0; i < arr.size(); i++) {
                c++;
                if (arr.size() == 1) return arr.get(0);
                if(c == k) {
                    arr.remove(i);
                    c = 0;
                    i--;
                }
                
            }
        }
        return arr.get(0);

        
    }
}
