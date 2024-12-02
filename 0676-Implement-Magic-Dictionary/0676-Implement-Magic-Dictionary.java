class MagicDictionary {
    class Trie {
        class Node{
            Node[] link = new Node[26];
            boolean flag;
        }

        Node root;
        Trie(){
            root = new Node();
        }

        void add(String s) {
            Node node = root;
            for(char c : s.toCharArray()) {
                int ind = c - 'a';
                if(node.link[ind] == null) node.link[ind] = new Node();
                node = node.link[ind];
            }
            node.flag = true;
        }

        boolean contains(String s, int index, boolean modified, Node node) {
        if (node == null) return false;

        if (index == s.length()) {
            return modified && node.flag;
        }

        int ch = s.charAt(index) - 'a';

        if (node.link[ch] != null && contains(s, index + 1, modified, node.link[ch])) {
            return true;
        }

        if (!modified) {
            for (int i = 0; i < 26; i++) {
                if (i != ch && node.link[i] != null) {
                    if (contains(s, index + 1, true, node.link[i])) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    }


    Trie trie;
    public MagicDictionary() {
        trie = new Trie();
    }
    
    public void buildDict(String[] dictionary) {
        for(String s : dictionary)trie.add(s);
        
    }
    
    public boolean search(String searchWord) {
        return trie.contains(searchWord,0,false, trie.root);
        
    }
}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dictionary);
 * boolean param_2 = obj.search(searchWord);
 */
