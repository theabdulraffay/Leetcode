class Solution {
    public boolean lemonadeChange(int[] bills) {
        int tf = 0, tt = 0;
        for(int i : bills){
            switch(i){
                case 5: tf++;break;
                case 10: if(tf<1)return (false); tf--;tt++;break;
                case 20: 
                	if(tf > 0 && tt > 0){
                		tf--;
                		tt--;
                	}
                	else if (tf > 2){
                		tf-=3;
                	}
                	else return (false);
            }
        }
        return (true);
        
    }
}
