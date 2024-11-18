class Solution {
    List<Integer> list;
    void helper(int n, int m) {
        if(n > m) return;
        int temp = n == 1 ? n + 9 : n + 10;
        for(int i = n; i < temp; i++) {
            if(i <= m) list.add(i);
            helper(i * 10, m);
        }
    }
    public List<Integer> lexicalOrder(int n) {
        list = new ArrayList<>();
        helper(1, n);
        return list;

    }
}
