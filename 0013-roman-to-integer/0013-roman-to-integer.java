class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int n = 0;
        for (int i= 0; i <s.length(); i++){
            char cha = s.charAt(i);
            switch(cha){
            case 'M': if(n == 100){sum += 800;} else{sum += 1000;} 
                n = 1000; break;
            case 'D': if(n == 100){sum += 300;} else{sum += 500;} n = 500; break;
            case 'C': if(n == 10){sum += 80;} else{sum += 100;} ; n = 100; break;
            case 'L': if(n == 10){sum += 30;} else{sum += 50;}  n = 50; break;
            case 'X': if(n == 1){sum += 8;} else{sum += 10;} ; n = 10; break;
            case 'V': if(n == 1){sum += 3;} else{sum += 5;}; n = 5; break;
            case 'I': sum += 1; n = 1; break;
            }

        }
        return sum;
    }
}