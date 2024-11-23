class Solution {
    void toswap(char[] arr) {
        Queue<Integer> que = new LinkedList<>();
        for(int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] == '*') que.clear();
            else if (arr[i] == '.') que.add(i);
            else {
                if(!que.isEmpty()) {
                    arr[que.poll()] = '#';
                    arr[i] = '.';
                    que.add(i);
                }
            }
        }
    }
    public char[][] rotateTheBox(char[][] box) {
        int row = box.length;
        int col = box[0].length;
        char[][] toret = new char[col][row];
        for(int i = 0; i < row; i++) {
            toswap(box[i]);
            for(int j = 0; j < col; j++) {
                toret[j][row - 1 - i] = box[i][j];
            }
        }
        return toret;
    }
}
