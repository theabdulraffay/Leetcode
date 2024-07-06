class Solution {
    int help(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        sb.append(s.charAt(1));
        sb.append(s.charAt(3));
        sb.append(s.charAt(4));

        return Integer.parseInt(sb.toString());
    }

    private int[] get_arr(Queue<Integer> queue){
        int[] times = new int[queue.size()];
        for (int i = 0; i < times.length; i++) {
            times[i] = queue.poll();
        }
        return times;
    }

    public List<String> alertNames(String[] keyName, String[] keyTime) {
        HashMap<String, PriorityQueue<Integer>> map = new HashMap<>();
        for(int i = 0; i < keyName.length; i++) {
            if(!map.containsKey(keyName[i])) {
                map.put(keyName[i], new PriorityQueue<>());
            }
            map.get(keyName[i]).offer(help(keyTime[i]));
        }

        List<String> toret = new ArrayList<>();

        for(String s : map.keySet()) {
            if(map.get(s).size() < 3) continue;
            int[] time = get_arr(map.get(s));
            for(int i = 2; i < time.length; i++) {
                if(time[i] - time[i - 2] <= 100 && time[i] - time[i - 2] > 0) {
                    toret.add(s);
                    break;
                }
            }
        }
        Collections.sort(toret);

        return toret;

        
    }
}
