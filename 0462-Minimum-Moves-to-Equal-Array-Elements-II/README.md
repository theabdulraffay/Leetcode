<h2><a href="https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii">462. Minimum Moves to Equal Array Elements II</a></h2>
<h3>Medium</h3>
<hr>
<p>Given an integer array <code>nums</code> of size <code>n</code>, return the minimum number of moves required to make all array elements equal.</p>
<p>In one move, you can increment or decrement an element of the array by 1.</p>
<p>Test cases are designed so that the answer will fit in a 32-bit integer.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,2,3]
<strong>Output:</strong> 2
<strong>Explanation:</strong>
Only two moves are needed (remember each move increments or decrements one element):
[1,2,3]  =>  [2,2,3]  =>  [2,2,2]
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,10,2,9]
<strong>Output:</strong> 16
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li><code>n == nums.length</code></li>
<li>1 ≤ <code>nums.length</code> ≤ 10<sup>5</sup></li>
<li>-10<sup>9</sup> ≤ <code>nums[i]</code> ≤ 10<sup>9</sup></li>
</ul>
