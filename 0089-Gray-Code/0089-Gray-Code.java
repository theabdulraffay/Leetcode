class Solution {
    public List<Integer> grayCode(int n) {
        if(n == 1) {
            List<Integer> l = new LinkedList<>();
            l.add(0);
            l.add(1);
            return l;
        }
        List<Integer> l = grayCode(n - 1);
        int ans = 1 << (n - 1);
        int size = l.size();
        for (int i = size - 1; i >= 0; i--) {
            l.add(l.get(i) + ans);
        }
        return l;
        
    }
}
