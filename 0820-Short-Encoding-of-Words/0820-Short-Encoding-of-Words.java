class Solution {
    class Node {
    Node[] links = new Node[26];
    boolean flag = false;

    boolean containsKey(char c) {
        return links[c - 'a'] != null;
    }

    void put(char ch, Node node) {
        links[ch - 'a'] = node;
    }

    Node get(char ch) {
        return links[ch - 'a']; 
    }

    void setEnd() {
        flag = true;
    }

    boolean isEnd() {
        return flag;
    }
}


class CustomTrie {
    private Node root;

    CustomTrie() {
        root = new Node();
    }

    void insert(String word) {
        Node node = root;
        for(int i = word.length() - 1; i >= 0; i--) {
            char c = word.charAt(i);
            if(!node.containsKey(c)) {
                node.put(c, new Node());
            }
            node = node.get(c);
        }
        node.setEnd();

    }

    boolean startsWith(String s) {
        Node node = root;
        for(int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if(!node.containsKey(c)){
                return false;
            }
            node = node.get(c);
        }

        return true;
    }
}

    public int minimumLengthEncoding(String[] words) {
        CustomTrie trie = new CustomTrie();
        Arrays.sort(words, (a, b) -> b.length() == a.length() ? b.compareTo(a) : b.length() - a.length());
        int c = 0;
        for(String i : words) {
            if(!trie.startsWith(i)) {
                trie.insert(i);
                c += i.length() + 1;
            }
        }
        return c;
        
    }
}
