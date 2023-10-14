import java.util.ArrayList;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int m = 0;
        for(int i = 0; i < candies.length; i++){
            if(m < candies[i]){m = candies[i];}
            candies[i] = candies[i] + extraCandies;
        }
        

        ArrayList<Boolean> list = new ArrayList<Boolean>() ;
        for(int i = 0; i < candies.length; i++){
            if(candies[i] >= m){list.add(true);}else{list.add(false);}
        }
        return list;
        
    }
}