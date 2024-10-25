// https://leetcode.com/problems/implement-trie-prefix-tree/description/
class Node {
    Node[] links = new Node[27];
    boolean flag = false;
}


class CustomTrie {
    private Node root;

    CustomTrie() {
        root = new Node();
    }

    void insert(String word) {
        Node node = root;
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int ind = c - 'a';
            if(c == '/') ind = 26;
            if (node.links[ind] == null) node.links[ind] = new Node();
            node = node.links[ind];
        }
        node.links[26] = new Node();
        node = node.links[26];
        node.flag = true;
    }

    boolean search(String s) {
        Node node = root;
        for(char c : s.toCharArray()) {
            int ind = c - 'a';
            if(c == '/') ind = 26;
            node = node.links[ind];
            if (node == null) return false;
            if (node.flag) return true;            
        }
        return false;
    }
    
	
}

class Solution {
    public List<String> removeSubfolders(String[] folder) {
        CustomTrie trie=new CustomTrie();
        Arrays.sort(folder,(a,b)->a.length()-b.length());
        List<String>ans=new ArrayList<>();
        for(String s:folder){
            if(!trie.search(s)){
                ans.add(s);
                trie.insert(s);
            }
        }
        return ans;
    }
}
