<h2><a href="https://leetcode.com/problems/find-k-th-smallest-pair-distance">719. Find K-th Smallest Pair Distance</a></h2>
<h3>Solved</h3>
<hr>
<p>Hard</p>
<p>The distance of a pair of integers <code>a</code> and <code>b</code> is defined as the absolute difference between <code>a</code> and <code>b</code>.</p>

<p>Given an integer array <code>nums</code> and an integer <code>k</code>, return the kth smallest distance among all the pairs <code>nums[i]</code> and <code>nums[j]</code> where <code>0 <= i < j < nums.length</code>.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,3,1], k = 1
<strong>Output:</strong> 0
<strong>Explanation:</strong> Here are all the pairs:
(1,3) -> 2
(1,1) -> 0
(3,1) -> 2
Then the 1st smallest distance pair is (1,1), and its distance is 0.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,1,1], k = 2
<strong>Output:</strong> 0
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,6,1], k = 3
<strong>Output:</strong> 5
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>n == nums.length</code></li>
  <li><code>2 <= n <= 10<sup>4</sup></code></li>
  <li><code>0 <= nums[i] <= 10<sup>6</sup></code></li>
  <li><code>1 <= k <= n * (n - 1) / 2</code></li>
</ul>
