class Solution {
    public int findCenter(int[][] edges) { // As it is common between all vertices so we check only 1st vertex and find the cmmon from it
        if(edges[0][0] == edges[1][0]) return edges[0][0];
        if(edges[0][0] == edges[1][1]) return edges[0][0];
        return edges[0][1];

        
    }
}
