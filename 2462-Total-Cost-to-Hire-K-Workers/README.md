<h2><a href="https://leetcode.com/problems/total-cost-to-hire-k-workers">2462. Total Cost to Hire K Workers</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a 0-indexed integer array <code>costs</code> where <code>costs[i]</code> is the cost of hiring the <code>i<sup>th</sup></code> worker.</p>
<p>You are also given two integers <code>k</code> and <code>candidates</code>. We want to hire exactly <code>k</code> workers according to the following rules:</p>
<ul>
<li>You will run <code>k</code> sessions and hire exactly one worker in each session.</li>
<li>In each hiring session, choose the worker with the lowest cost from either the first <code>candidates</code> workers or the last <code>candidates</code> workers. Break the tie by the smallest index.</li>
<li>If there are fewer than <code>candidates</code> workers remaining, choose the worker with the lowest cost among them. Break the tie by the smallest index.</li>
<li>A worker can only be chosen once.</li>
</ul>
<p>Return the total cost to hire exactly <code>k</code> workers.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> costs = [17,12,10,2,7,2,11,20,8], k = 3, candidates = 4
<strong>Output:</strong> 11
<strong>Explanation:</strong> We hire 3 workers in total. The total cost is initially 0.
- In the first hiring round we choose the worker from [17,12,10,2,7,2,11,20,8]. The lowest cost is 2, and we break the tie by the smallest index, which is 3. The total cost = 0 + 2 = 2.
- In the second hiring round we choose the worker from [17,12,10,7,2,11,20,8]. The lowest cost is 2 (index 4). The total cost = 2 + 2 = 4.
- In the third hiring round we choose the worker from [17,12,10,7,11,20,8]. The lowest cost is 7 (index 3). The total cost = 4 + 7 = 11. Notice that the worker with index 3 was common in the first and last four workers.
The total hiring cost is 11.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> costs = [1,2,4,1], k = 3, candidates = 3
<strong>Output:</strong> 4
<strong>Explanation:</strong> We hire 3 workers in total. The total cost is initially 0.
- In the first hiring round we choose the worker from [1,2,4,1]. The lowest cost is 1, and we break the tie by the smallest index, which is 0. The total cost = 0 + 1 = 1. Notice that workers with index 1 and 2 are common in the first and last 3 workers.
- In the second hiring round we choose the worker from [2,4,1]. The lowest cost is 1 (index 2). The total cost = 1 + 1 = 2.
- In the third hiring round there are less than three candidates. We choose the worker from the remaining workers [2,4]. The lowest cost is 2 (index 0). The total cost = 2 + 2 = 4.
The total hiring cost is 4.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ <code>costs.length</code> ≤ 10<sup>5</sup></li>
<li>1 ≤ <code>costs[i]</code> ≤ 10<sup>5</sup></li>
<li>1 ≤ <code>k</code>, <code>candidates</code> ≤ <code>costs.length</code></li>
</ul>
