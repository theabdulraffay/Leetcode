<h2><a href="https://leetcode.com/problems/sliding-window-maximum">239. Sliding Window Maximum</a></h2>
<h3>Solved</h3>
<h3>Hard</h3>
<hr>
<p>You are given an array of integers <code>nums</code>, there is a sliding window of size <code>k</code> which is moving from the very left of the array to the very right. You can only see the <code>k</code> numbers in the window. Each time the sliding window moves right by one position.</p>
<p>Return the max sliding window.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,3,-1,-3,5,3,6,7], k = 3
<strong>Output:</strong> [3,3,5,5,6,7]
<strong>Explanation:</strong> 
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [1], k = 1
<strong>Output:</strong> [1]
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li>1 &lt;= <code>nums.length</code> &lt;= 10<sup>5</sup></li>
  <li>-10<sup>4</sup> &lt;= <code>nums[i]</code> &lt;= 10<sup>4</sup></li>
  <li>1 &lt;= <code>k</code> &lt;= <code>nums.length</code></li>
</ul>
