class Solution {
    class Trie {
        class Node {
            Node[] link;
            boolean flag;
            Node() {
                link = new Node[26];
                flag = false;
            }
        }

        Node root;
        Trie(){
            root = new Node();
        }
        void insert(String s) {
            Node node = root;
            for(char i : s.toCharArray()) {
                int c = i - 'a';
                if(node.link[c] == null) {
                    node.link[c] = new Node();
                }
                node = node.link[c];
            }
            node.flag = true;
        }

        List<String> contains(String s) {
            List<String> list = new ArrayList<>();
            Node node = root;
            for(char i : s.toCharArray()) {
                int c = i - 'a';
                if(node.link[c] == null) return list;
                node = node.link[c];
            }
            traverse(node, new StringBuilder(s), list);
            return list;
        }


        void traverse(Node node, StringBuilder sb, List<String> list) {
            if(node == null || list.size() == 3) return;
            if(node.flag) 
                list.add(sb.toString());
            
            for(int i = 0; i < 26; i++) {
                if(node.link[i] != null) {
                    sb.append((char)(i + 'a'));
                    traverse(node.link[i], sb, list);
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
        }

    }
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Trie trie = new Trie();
        for (String i : products) {
            trie.insert(i);
        }
        List<List<String>> toret = new ArrayList<>();
        for(int i = 1; i <= searchWord.length(); i++) {
            List<String> list = trie.contains(searchWord.substring(0, i));
            toret.add(list);
        }
        return toret;

        
    }
}
