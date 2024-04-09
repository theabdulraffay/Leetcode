class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        // int sold = 0;
        // while (tickets[k] != 0) {
        //     for (int i = 0; i < tickets.length; i++) {
        //         if (tickets[i] != 0) {
        //             tickets[i] = tickets[i] - 1;
        //             sold++;
        //         }
        //         if (tickets[k] == 0) break;
        //     }
        // }
        // return sold;

        int time = 0;
        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                time += Math.min(tickets[k], tickets[i]);
            } else {
                time += Math.min(tickets[i], tickets[k] - 1);
            }
        }
        return time;
        
    }
}
