class Solution {
    public int[] maxPoints(int[][] grid, int[] queries) {
        int rows=grid.length, cols=grid[0].length, n=queries.length;
        int ans[] = new int[n];
        int in[][] = new int[n][2];
        boolean visited[][] = new boolean[rows][cols];
        for(int i=0;i<n;i++){
            in[i][0]=queries[i];
            in[i][1]=i;
        }
        Arrays.sort(in, (a, b)->{return a[0]-b[0];});
        PriorityQueue<int[]> queue = new PriorityQueue<int[]>((a, b)->{return a[0]-b[0];});
        queue.offer(new int[]{grid[0][0], 0, 0});
        visited[0][0]=true;
        int count=0;
        
        for(int i=0;i<n;i++){
            int limit=in[i][0];
            int index=in[i][1];
            while(queue.size()>0 && queue.peek()[0]<limit){
                int[] temp = queue.poll();
                int val=temp[0]; int r=temp[1]; int c=temp[2];
                ++count;
                int [][]ne = new int[][]{{r+1, c}, {r-1, c}, {r, c+1}, {r, c-1}};
                for(int dir[]:ne){
                    if(dir[0]>=0 && dir[0]<rows && dir[1]>=0 && dir[1]<cols && !visited[dir[0]][dir[1]]){
                        visited[dir[0]][dir[1]]=true;
                        queue.offer(new int[]{grid[dir[0]][dir[1]], dir[0], dir[1]});
                    }
                }
            }
            ans[index]=count;
        }

        return ans;
        
    }
}
