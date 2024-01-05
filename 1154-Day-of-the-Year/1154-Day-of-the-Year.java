class Solution {
    public int dayOfYear(String date) {
        String s = date.substring(0,4);
        int t = Integer.parseInt(s);
        s = date.substring(5,7);
        int m = Integer.parseInt(s);
        int sum = 0;
        for(int i = 0;i<=m;i++) {
        switch(i){
            case 1: sum+= 0;break;
            case 2: sum+= 31;break;
            case 3: sum+= 28;break;
            case 4: sum+= 31;break;
            case 5: sum+= 30;break;
            case 6: sum+= 31;break;
            case 7: sum+= 30;break;
            case 8: sum+= 31;break;
            case 9: sum+= 31;break;
            case 10: sum+= 30;break;
            case 11: sum+= 31;break;
            case 12: sum+= 30;break;
        }
    	}
    	return(((t % 4 == 0 && t % 100 != 0) | (t % 400 == 0) && m > 2)? sum + Integer.parseInt(date.substring(8))+1: sum + Integer.parseInt(date.substring(8)) );
        
    }
}
