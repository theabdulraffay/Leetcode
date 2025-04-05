<h2><a href="https://leetcode.com/problems/sum-of-all-subset-xor-totals">1863. Sum of All Subset XOR Totals</a></h2>
<h3>Easy</h3>
<hr>
<p>The XOR total of an array is defined as the bitwise XOR of all its elements, or 0 if the array is empty.</p>
<p>For example, the XOR total of the array [2,5,6] is 2 XOR 5 XOR 6 = 1.</p>
<p>Given an array <code>nums</code>, return the sum of all XOR totals for every subset of <code>nums</code>.</p>
<p>Note: Subsets with the same elements should be counted multiple times.</p>
<p>An array <code>a</code> is a subset of an array <code>b</code> if <code>a</code> can be obtained from <code>b</code> by deleting some (possibly zero) elements of <code>b</code>.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,3]
<strong>Output:</strong> 6
<strong>Explanation:</strong> The 4 subsets of [1,3] are:
- The empty subset has an XOR total of 0.
- [1] has an XOR total of 1.
- [3] has an XOR total of 3.
- [1,3] has an XOR total of 1 XOR 3 = 2.
0 + 1 + 3 + 2 = 6
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [5,1,6]
<strong>Output:</strong> 28
<strong>Explanation:</strong> The 8 subsets of [5,1,6] are:
- The empty subset has an XOR total of 0.
- [5] has an XOR total of 5.
- [1] has an XOR total of 1.
- [6] has an XOR total of 6.
- [5,1] has an XOR total of 5 XOR 1 = 4.
- [5,6] has an XOR total of 5 XOR 6 = 3.
- [1,6] has an XOR total of 1 XOR 6 = 7.
- [5,1,6] has an XOR total of 5 XOR 1 XOR 6 = 2.
0 + 5 + 1 + 6 + 4 + 3 + 7 + 2 = 28
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> nums = [3,4,5,6,7,8]
<strong>Output:</strong> 480
<strong>Explanation:</strong> The sum of all XOR totals for every subset is 480.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>1 <= <code>nums.length</code> <= 12</li>
  <li>1 <= <code>nums[i]</code> <= 20</li>
</ul>
