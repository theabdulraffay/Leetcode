<h2><a href="https://leetcode.com/problems/zero-array-transformation-ii">3356. Zero Array Transformation II</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given an integer array <code>nums</code> of length <code>n</code> and a 2D array <code>queries</code> where <code>queries[i] = [li, ri, vali]</code>.</p>
<p>Each <code>queries[i]</code> represents the following action on <code>nums</code>:</p>
<ul>
  <li>Decrement the value at each index in the range <code>[li, ri]</code> in <code>nums</code> by at most <code>vali</code>.</li>
  <li>The amount by which each value is decremented can be chosen independently for each index.</li>
</ul>
<p>A Zero Array is an array with all its elements equal to 0.</p>
<p>Return the minimum possible non-negative value of <code>k</code>, such that after processing the first <code>k</code> queries in sequence, <code>nums</code> becomes a Zero Array. If no such <code>k</code> exists, return <code>-1</code>.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [2,0,2], queries = [[0,2,1],[0,2,1],[1,1,3]]
<strong>Output:</strong> 2
<strong>Explanation:</strong>
For i = 0 (l = 0, r = 2, val = 1):
Decrement values at indices [0, 1, 2] by [1, 0, 1] respectively.
The array will become [1, 0, 1].
For i = 1 (l = 0, r = 2, val = 1):
Decrement values at indices [0, 1, 2] by [1, 0, 1] respectively.
The array will become [0, 0, 0], which is a Zero Array. Therefore, the minimum value of k is 2.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [4,3,2,1], queries = [[1,3,2],[0,2,1]]
<strong>Output:</strong> -1
<strong>Explanation:</strong>
For i = 0 (l = 1, r = 3, val = 2):
Decrement values at indices [1, 2, 3] by [2, 2, 1] respectively.
The array will become [4, 1, 0, 0].
For i = 1 (l = 0, r = 2, val = 1):
Decrement values at indices [0, 1, 2] by [1, 1, 0] respectively.
The array will become [3, 0, 0, 0], which is not a Zero Array.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>1 <= <code>nums.length</code> <= 10<sup>5</sup></li>
  <li>0 <= <code>nums[i]</code> <= 5 * 10<sup>5</sup></li>
  <li>1 <= <code>queries.length</code> <= 10<sup>5</sup></li>
  <li><code>queries[i].length == 3</code></li>
  <li>0 <= <code>li</code> <= <code>ri</code> < <code>nums.length</code></li>
  <li>1 <= <code>vali</code> <= 5</li>
</ul>
