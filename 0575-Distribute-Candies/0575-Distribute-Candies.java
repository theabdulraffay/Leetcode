class Solution {
    public int distributeCandies(int[] candyType) {
        int count = 1;
        int type = candyType.length/2;
        Arrays.sort(candyType);
        for(int i = 0;i<candyType.length -1;i++){
            if(candyType[i] == candyType[i+1]){
                continue;
            }
            count++;
        }
        return Math.min(type,count);
        // return ((type >= count)? count : type);
        
        // if(type == count)return count;
        // else if(type< count)return type;
        // else return count;

        
    }
}
