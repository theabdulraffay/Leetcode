class Solution {
    public String originalDigits(String s) {
        int[] map = new int[10];
        for(char c : s.toCharArray()) {
            if(c == 'z') map[0]++;
            if(c == 'w') map[2]++;
            if(c == 'u') map[4]++;
            if(c == 'x') map[6]++;
            if(c == 'g') map[8]++;
            if(c == 's') map[7]++;
            if(c == 'f') map[5]++;
            if(c == 'i') map[9]++;
            if(c == 'o') map[1]++;
            if(c == 'h') map[3]++;
        }

        map[7] -= map[6];
        map[5] -= map[4];
        map[9] -= (map[5] + map[6] + map[8]);
        map[1] -= (map[0] + map[2] + map[4]);
        map[3] -= map[8];

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 9; i++){
            sb.append(String.valueOf(i).repeat(map[i]));
        }
        return sb.toString();


    }
}
