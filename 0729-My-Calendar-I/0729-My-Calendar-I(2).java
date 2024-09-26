class MyCalendar {
    List<int[]> arr;

    public MyCalendar() {
        arr = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        for(int[] i : arr) {
            if(start < i[1] && end > i[0]) return false;
        }
        arr.add(new int[]{start, end});
        return true;
    }
}
