// class SmallestInfiniteSet {

//     PriorityQueue<Integer> q;
//     public SmallestInfiniteSet() {
//         q = new PriorityQueue<>(); 
//         for (int i = 1; i <= 1000; i++) {
//             q.add(i);
//         }
//     }
    
//     public int popSmallest() {
//         return q.poll();
        
//     }
    
//     public void addBack(int num) {
//         if(!q.contains(num)) {
//             q.add(num);
//         }
        
//     }
// }

class SmallestInfiniteSet {
    int k;
    PriorityQueue<Integer> q;

    public SmallestInfiniteSet() {
        q = new PriorityQueue<>();
        k = 0;
        
    }
    
    public int popSmallest() {
        if(!q.contains(++k)) {
            q.add(k);
        }
        return q.poll();
        
    }
    
    public void addBack(int num) {
        if(num <= k && !q.contains(num)) {
            q.add(num);
        }
        
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */
