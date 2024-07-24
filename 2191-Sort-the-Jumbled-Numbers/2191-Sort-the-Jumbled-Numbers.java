class Robo implements Comparable<Robo>{
    int fir;
    int sec;
    int index;
    Robo(int fir, int sec, int index) {
        this.fir = fir;
        this.sec = sec;
        this.index = index;
    }

    public int compareTo(Robo other) {
        if(this.sec != other.sec) {
            return this.sec - other.sec;
        }
        return this.index - other.index;
    }

    public String toString() {
        return sec + " " + fir;
    }
}    
class Solution {
     public static int mapNumber(int[] mapping, int number) {
        String numberStr = Integer.toString(number);
        StringBuilder mappedNumberStr = new StringBuilder();

        for (char digitChar : numberStr.toCharArray()) {
            int digit = Character.getNumericValue(digitChar);
            mappedNumberStr.append(mapping[digit]);
        }

        return Integer.parseInt(mappedNumberStr.toString());
    }

    public int[] sortJumbled(int[] mapping, int[] nums) {
        Robo[] robo = new Robo[nums.length];
        for(int i = 0; i < nums.length; i++) {
            int fir = nums[i];
            int sec = mapNumber(mapping, fir);
            robo[i] = new Robo(fir, sec, i);
        }
        Arrays.sort(robo);
        for(int i = 0; i < nums.length; i++) {
            nums[i] = robo[i].fir;
        }


        return nums;
        
    }
}
