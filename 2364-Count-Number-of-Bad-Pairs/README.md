<h2><a href="https://leetcode.com/problems/count-number-of-bad-pairs">2364. Count Number of Bad Pairs</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a 0-indexed integer array <code>nums</code>. A pair of indices <code>(i, j)</code> is a bad pair if <code>i < j</code> and <code>j - i != nums[j] - nums[i]</code>.</p>
<p>Return the total number of bad pairs in <code>nums</code>.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [4,1,3,3]
<strong>Output:</strong> 5
<strong>Explanation:</strong> The pair (0, 1) is a bad pair since 1 - 0 != 1 - 4.
The pair (0, 2) is a bad pair since 2 - 0 != 3 - 4, 2 != -1.
The pair (0, 3) is a bad pair since 3 - 0 != 3 - 4, 3 != -1.
The pair (1, 2) is a bad pair since 2 - 1 != 3 - 1, 1 != 2.
The pair (2, 3) is a bad pair since 3 - 2 != 3 - 3, 1 != 0.
There are a total of 5 bad pairs, so we return 5.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,2,3,4,5]
<strong>Output:</strong> 0
<strong>Explanation:</strong> There are no bad pairs.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>1 <= <code>nums.length</code> <= 10<sup>5</sup></li>
  <li>1 <= <code>nums[i]</code> <= 10<sup>9</sup></li>
</ul>
