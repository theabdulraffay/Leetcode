class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        char[] ch = s.toCharArray();
        int[] shift = new int[ch.length + 1];
        for (int[] i : shifts) {
            shift[i[0]] = i[2] == 1 ? shift[i[0]] + 1 : shift[i[0]] - 1;
            shift[i[1] + 1] = i[2] == 1 ? shift[i[1] + 1] - 1 : shift[i[1] + 1] + 1;
        }

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += shift[i];
            int temp = ((ch[i] - 'a') + sum) % 26;
            if (temp < 0)
                ch[i] = (char) (26 + temp + 'a');
            else
                ch[i] = (char) (temp + 'a');
        }
        return new String(ch);

    }
}
