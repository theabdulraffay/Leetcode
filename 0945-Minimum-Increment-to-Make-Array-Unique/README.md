<h2><a href="https://leetcode.com/problems/minimum-increment-to-make-array-unique">945. Minimum Increment to Make Array Unique</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given an integer array <code>nums</code>. In one move, you can pick an index <code>i</code> where <code>0 <= i < nums.length</code> and increment <code>nums[i]</code> by 1.</p>
<p>Return the minimum number of moves to make every value in <code>nums</code> unique.</p>
<p>The test cases are generated so that the answer fits in a 32-bit integer.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,2,2]
<strong>Output:</strong> 1
<strong>Explanation:</strong> After 1 move, the array could be [1, 2, 3].
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [3,2,1,2,1,7]
<strong>Output:</strong> 6
<strong>Explanation:</strong> After 6 moves, the array could be [3, 4, 1, 2, 5, 7].
It can be shown with 5 or less moves that it is impossible for the array to have all unique values.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ <code>nums.length</code> ≤ 10<sup>5</sup></li>
<li>0 ≤ <code>nums[i]</code> ≤ 10<sup>5</sup></li>
</ul>
