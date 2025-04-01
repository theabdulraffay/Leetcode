class Solution {
    long max = 0;
    Long[] arr;
    long helper(int[][] ques, int ind, long sum) {
        if(ind >= ques.length) {
            // max = Math.max(max, sum);
            return sum;
        }
        if(arr[ind] != null) {return sum + arr[ind];}
        arr[ind] = helper(ques, ind + ques[ind][1] + 1, sum + ques[ind][0]);
        long second = helper(ques, ind + 1, sum);
        return arr[ind] = Math.max(arr[ind], second);

    }
    public long mostPoints(int[][] questions) {
        arr = new Long[questions.length ];
        for(int i = questions.length - 1; i >= 0; i--) {
            max = Math.max(max, helper(questions, i, 0));
        }
        // return helper(questions, 0, 0l);
        return max;
        
    }
}
