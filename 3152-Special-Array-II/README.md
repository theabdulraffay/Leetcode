<h2><a href="https://leetcode.com/problems/special-array-ii">3152. Special Array II</a></h2>
<h3>Medium</h3>
<hr>
<p>An array is considered special if every pair of its adjacent elements contains two numbers with different parity.</p>

<p>You are given an array of integers <code>nums</code> and a 2D integer matrix <code>queries</code>, where for <code>queries[i] = [from<sub>i</sub>, to<sub>i</sub>]</code>, your task is to check whether the subarray <code>nums[from<sub>i</sub>..to<sub>i</sub>]</code> is special.</p>

<p>Return an array of booleans <code>answer</code> such that <code>answer[i]</code> is <code>true</code> if <code>nums[from<sub>i</sub>..to<sub>i</sub>]</code> is special.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [3,4,1,2,6], queries = [[0,4]]
<strong>Output:</strong> [false]
<strong>Explanation:</strong>
The subarray is [3,4,1,2,6]. 2 and 6 are both even.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [4,3,1,6], queries = [[0,2],[2,3]]
<strong>Output:</strong> [false,true]
<strong>Explanation:</strong>
- The subarray is [4,3,1]. 3 and 1 are both odd. So the answer to this query is <code>false</code>.
- The subarray is [1,6]. There is only one pair: (1,6) and it contains numbers with different parity. So the answer to this query is <code>true</code>.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 <= nums.length <= 10<sup>5</sup></code></li>
  <li><code>1 <= nums[i] <= 10<sup>5</sup></code></li>
  <li><code>1 <= queries.length <= 10<sup>5</sup></code></li>
  <li><code>queries[i].length == 2</code></li>
  <li><code>0 <= queries[i][0] <= queries[i][1] <= nums.length - 1</code></li>
</ul>
