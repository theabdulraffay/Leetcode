class Solution {
    public int compress(char[] chars) {
        if (chars.length < 2) return chars.length;
        int index = 0;
        int counter = 1;
        for(int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                counter++;
            } else {
                chars[index++] = chars[i - 1];
                if (counter != 1) 
                    for (char j : String.valueOf(counter).toCharArray()) 
                        chars[index++] = j;
                counter = 1;
            }
        }
        chars[index++] = chars[chars.length - 1];
        if (counter != 1) 
            for (char j : String.valueOf(counter).toCharArray()) 
                chars[index++] = j;
        return index;
    }
}
