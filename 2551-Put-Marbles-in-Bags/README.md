<h2><a href="https://leetcode.com/problems/put-marbles-in-bags">2551. Put Marbles in Bags</a></h2>
<h3>Hard</h3>
<hr>
<p>You have <code>k</code> bags. You are given a 0-indexed integer array <code>weights</code> where <code>weights[i]</code> is the weight of the <code>i</code>-th marble. You are also given the integer <code>k</code>.</p>
<p>Divide the marbles into the <code>k</code> bags according to the following rules:</p>
<ul>
  <li>No bag is empty.</li>
  <li>If the <code>i</code>-th marble and <code>j</code>-th marble are in a bag, then all marbles with an index between the <code>i</code>-th and <code>j</code>-th indices should also be in that same bag.</li>
  <li>If a bag consists of all the marbles with an index from <code>i</code> to <code>j</code> inclusively, then the cost of the bag is <code>weights[i] + weights[j]</code>.</li>
  <li>The score after distributing the marbles is the sum of the costs of all the <code>k</code> bags.</li>
</ul>
<p>Return the difference between the maximum and minimum scores among marble distributions.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> weights = [1,3,5,1], k = 2
<strong>Output:</strong> 4
<strong>Explanation:</strong>
The distribution [1],[3,5,1] results in the minimal score of (1+1) + (3+1) = 6.
The distribution [1,3],[5,1], results in the maximal score of (1+3) + (5+1) = 10.
Thus, we return their difference 10 - 6 = 4.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> weights = [1, 3], k = 2
<strong>Output:</strong> 0
<strong>Explanation:</strong> The only distribution possible is [1],[3].
Since both the maximal and minimal score are the same, we return 0.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>1 <= <code>k</code> <= <code>weights.length</code> <= 10<sup>5</sup></li>
  <li>1 <= <code>weights[i]</code> <= 10<sup>9</sup></li>
</ul>
