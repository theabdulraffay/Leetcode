class Solution {
    class Trie {
        class Node {
            Node[] links = new Node[10];
            boolean flag;
        }
        Node root;
        Trie() {
            root = new Node();
        }
        void addString(String s) {
            Node node = root;
            for(char i : s.toCharArray()) {
                int ind = i - '0';
                if (node.links[ind] == null) node.links[ind] = new Node();
                node = node.links[ind];
            }
            node = new Node();
            node.flag = true;
        }

        int contains(String s) {
            int c = 0;
            Node node = root;
            for(char i : s.toCharArray()) {
                int ind = i - '0';
                if(node.links[ind] == null || node.links[ind].flag) return c;
                node = node.links[ind];
                c++;
            }
            return c;
        }
    }
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Trie n = new Trie();
        for(int i : arr2) {
            n.addString(String.valueOf(i));
        }
        int max = 0;
        for(int i : arr1) {
            int t = n.contains(String.valueOf(i));
            max = Math.max(max, t);
        }
        return max;
        
    }
}
