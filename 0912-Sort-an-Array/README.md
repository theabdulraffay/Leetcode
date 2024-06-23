<h2><a href="https://leetcode.com/problems/sort-an-array">912. Sort an Array</a></h2>
<h3>Medium</h3>
<hr>
<p>Given an array of integers <code>nums</code>, sort the array in ascending order and return it.</p>
<p>You must solve the problem without using any built-in functions in <code>O(nlog(n))</code> time complexity and with the smallest space complexity possible.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [5,2,3,1]
<strong>Output:</strong> [1,2,3,5]
<strong>Explanation:</strong> After sorting the array, the positions of some numbers are not changed (for example, 2 and 3), while the positions of other numbers are changed (for example, 1 and 5).
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [5,1,1,2,0,0]
<strong>Output:</strong> [0,0,1,1,2,5]
<strong>Explanation:</strong> Note that the values of <code>nums</code> are not necessarily unique.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ <code>nums.length</code> ≤ 5 * 10<sup>4</sup></li>
<li>-5 * 10<sup>4</sup> ≤ <code>nums[i]</code> ≤ 5 * 10<sup>4</sup></li>
</ul>
