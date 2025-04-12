class Solution {
    HashSet<String> set;

    void addToSet(char[] currentNumber, int k) {
        String news = new String(currentNumber);
        if (news.charAt(0) != '0' && Long.valueOf(news) % k == 0) {
            char[] sortedNumber = news.toCharArray();
            Arrays.sort(sortedNumber);
            set.add(new String(sortedNumber));
        }
    }

    void calculatePermutations(char[] currentNumber, int k, int totalDigits, char i, int index) {
        if (index == totalDigits / 2) {
            if (totalDigits % 2 == 1) {
                for (char j = '0'; j <= '9'; j++) {
                    currentNumber[index] = j;
                    addToSet(currentNumber, k);
                }
                return;
            }
            addToSet(currentNumber, k);
            return;
        }

        for (; i <= '9'; i++) {
            currentNumber[index] = i;
            currentNumber[totalDigits - index - 1] = i;
            calculatePermutations(currentNumber, k, totalDigits, '0', index + 1);
        }
    }

    long calculateFactorial(int totalDigits) {
        long[] factorial = new long[totalDigits + 1];
        factorial[0] = 1;
        for (int i = 1; i <= totalDigits; i++) {
            factorial[i] = factorial[i - 1] * i;
        }
        long answer = 0;

        for (String s : set) {

            int[] currentNumber = new int[10];
            for (char c : s.toCharArray()) {
                currentNumber[c - '0']++;
            }
            long total = (totalDigits - currentNumber[0]) * factorial[totalDigits - 1];
            for (int x : currentNumber) {
                total /= factorial[x];
            }
            answer += total;
        }
        return answer;
    }

    public long countGoodIntegers(int totalDigits, int k) {
        set = new HashSet<>();
        calculatePermutations(new char[totalDigits], k, totalDigits, '1', 0);

        return calculateFactorial(totalDigits);
    }
}
