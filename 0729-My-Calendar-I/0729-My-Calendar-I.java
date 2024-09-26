class MyCalendar {

    class Pair {
        int x;
        int y;
        Pair(int a, int b) {
            x = a;
            y = b;
        }
    }

    List<Pair> arr;

    public MyCalendar() {
        arr = new ArrayList<>();

    }

    public boolean book(int start, int end) {
        for(int i = 0; i < arr.size(); i++) {
            int fir = arr.get(i).x;
            int sec = arr.get(i).y;
            if(start < sec && start >= fir ) return false;
            if(end > fir && end < sec) return false;
            if(start <= fir && end >= sec) return false;
        }
        arr.add(new Pair(start, end));
        return true;

    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
