<h2><a href="https://leetcode.com/problems/maximum-xor-for-each-query">1829. Maximum XOR for Each Query</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a sorted array <code>nums</code> of <code>n</code> non-negative integers and an integer <code>maximumBit</code>. You want to perform the following query <code>n</code> times:</p>

<ol>
<li>Find a non-negative integer <code>k &lt; 2^maximumBit</code> such that <code>nums[0] XOR nums[1] XOR ... XOR nums[nums.length-1] XOR k</code> is maximized. <code>k</code> is the answer to the <code>i<sup>th</sup></code> query.</li>
<li>Remove the last element from the current array <code>nums</code>.</li>
</ol>

<p>Return an array <code>answer</code>, where <code>answer[i]</code> is the answer to the <code>i<sup>th</sup></code> query.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [0,1,1,3], maximumBit = 2
<strong>Output:</strong> [0,3,2,3]
<strong>Explanation:</strong> The queries are answered as follows:
1st query: nums = [0,1,1,3], k = 0 since 0 XOR 1 XOR 1 XOR 3 XOR 0 = 3.
2nd query: nums = [0,1,1], k = 3 since 0 XOR 1 XOR 1 XOR 3 = 3.
3rd query: nums = [0,1], k = 2 since 0 XOR 1 XOR 2 = 3.
4th query: nums = [0], k = 3 since 0 XOR 3 = 3.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [2,3,4,7], maximumBit = 3
<strong>Output:</strong> [5,2,6,5]
<strong>Explanation:</strong> The queries are answered as follows:
1st query: nums = [2,3,4,7], k = 5 since 2 XOR 3 XOR 4 XOR 7 XOR 5 = 7.
2nd query: nums = [2,3,4], k = 2 since 2 XOR 3 XOR 4 XOR 2 = 7.
3rd query: nums = [2,3], k = 6 since 2 XOR 3 XOR 6 = 7.
4th query: nums = [2], k = 5 since 2 XOR 5 = 7.
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> nums = [0,1,2,2,5,7], maximumBit = 3
<strong>Output:</strong> [4,3,6,4,6,7]
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li><code>nums.length == n</code></li>
<li><code>1 &lt;= n &lt;= 10<sup>5</sup></code></li>
<li><code>1 &lt;= maximumBit &lt;= 20</code></li>
<li><code>0 &lt;= nums[i] &lt; 2^maximumBit</code></li>
<li><code>nums</code> is sorted in ascending order.</li>
</ul>
