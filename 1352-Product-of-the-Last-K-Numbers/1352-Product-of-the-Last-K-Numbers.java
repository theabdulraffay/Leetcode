class ProductOfNumbers {
    ArrayList<Integer> arr;
    int n;

    public ProductOfNumbers() {
        arr = new ArrayList<>();
        arr.add(1);
        n = 1;
    }

    public void add(int num) {
        if (num == 0) {
            arr.clear();
            arr.add(1);
            n = 1;
            return;
        }
        arr.add(arr.get(n - 1) * num);
        n++;
    }

    public int getProduct(int k) {
        if (k >= n)
            return 0;
        return arr.get(n - 1) / arr.get(n - k - 1);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
