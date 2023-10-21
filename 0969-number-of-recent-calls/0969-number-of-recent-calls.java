
class RecentCounter {
    private Queue<Integer> requests;

    public RecentCounter() {
        requests = new LinkedList<>();
    }

    public int ping(int t) {
        while (!requests.isEmpty() && requests.peek() < t - 3000) {
            requests.poll();
        }
        requests.offer(t);
        return requests.size();
    }
}