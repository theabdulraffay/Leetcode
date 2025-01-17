class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int main = 0;
        for (int i = 0; i < derived.length; i++) 
                main ^= derived[i];
                
        return main == 0;
    }
}
