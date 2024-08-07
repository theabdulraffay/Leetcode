// class Pair implements Comparable<Pair>{
//     char x;
//     int y;
//     Pair(char x, int y) {
//         this.x = x;
//         this.y = y;
//     }

//     public int compareTo(Pair other) {
//         return this.y - other.y;
//     }

//     public String toString() {
//         return this.x + String.valueOf(this.y);
//     }

// }    
class Solution {
    public int minimumPushes(String word) {
        // HashMap<Character, Integer> map = new HashMap<>();
        // for(char i : word.toCharArray()) {
        //     map.put(i, map.getOrDefault(i, 0) + 1);
        // }
        // if(map.size() <= 8) return word.length();

        // List<Pair> list = new ArrayList<>();
        // for(char c : map.keySet()) {
        //     list.add(new Pair(c, map.get(c)));
        // }
        // Collections.sort(list);
        // Collections.reverse(list);
        // System.out.println(list);
        // int count = 0;
        // int press = 0;
        // for(int i = 0; i < list.size(); i++) {
        //     if(i%8 == 0)press++;
        //     count += (list.get(i).y * press);
        // }
        // return count;

        int[] arr = new int[26];
        for(char c : word.toCharArray()) {
            arr[c - 'a']++;
        }
        Arrays.sort(arr);
        int press = 0;
        int count = 0;
        for(int i = 25; i >= 0; i--) {
            if(i % 8 == 1) press++;
            if(arr[i] == 0) break;
            count += (arr[i] * press);
        }
        return count;
        
    }
}
