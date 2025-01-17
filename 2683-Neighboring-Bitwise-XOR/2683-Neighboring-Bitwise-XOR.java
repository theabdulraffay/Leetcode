class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int main = derived[0];
        for (int i = 1; i < derived.length; i++) {
            if (derived[i] == 1) {
                main = main == 1 ? 0 : 1;
            } 
        }
        return main == 0;
    }
}
