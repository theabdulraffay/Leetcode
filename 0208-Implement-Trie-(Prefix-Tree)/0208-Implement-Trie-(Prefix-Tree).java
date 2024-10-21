class Trie {
    class Node {
        Node[] node = new Node[26];
        boolean flag = false;

        boolean containsKey(char c) {
            return node[c - 'a'] != null;
        }

        void put(char c, Node n) {
            node[c - 'a'] = n;
        }

        Node get(char c) {
            return node[c - 'a'];
        }

        void setEnd() {
            flag = true;
        }

        boolean getEnd() {
            return flag;
        }

    }

    Node root;

    public Trie() {
        root  = new Node();
        
    }
    
    public void insert(String word) {
        Node n = root;
        for(char i : word.toCharArray()) {
            if(!n.containsKey(i)) {
                n.put(i, new Node());
            }
            n = n.get(i);
        }

        n.setEnd();
    }
    
    public boolean search(String word) {
        Node n = root;
        for(char i : word.toCharArray()) {
            n = n.get(i);
            if(n == null) return false;

        }
        return n.getEnd();
        
    }
    
    public boolean startsWith(String prefix) {
        Node n = root;
        for(char i : prefix.toCharArray()) {
            n = n.get(i);
            if(n == null) return false;

        }
        return true;
        
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
