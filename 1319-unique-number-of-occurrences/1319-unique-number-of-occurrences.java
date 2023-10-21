class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> nlist = new ArrayList<Integer>();

        for(int i : arr){
            if(list.contains(i)){continue;}
            else{list.add(i);}
        }



        for(int i = 0; i< list.size();i++){
            int counter = 0;
            for(int k = 0; k <arr.length;k++){
                if(list.get(i) == arr[k]){counter++;}
            }
            nlist.add(counter);
        }
        for(int i = 0; i<nlist.size();i++){
            for(int j = 0; j<nlist.size();j++){
                if(i == j)continue;
                if(nlist.get(i) == nlist.get(j)){
                    return false;
                    
                }
            }
        }
        return true;   
    }
}