<h2><a href="https://leetcode.com/problems/k-diff-pairs-in-an-array">532. K-diff Pairs in an Array</a></h2>
<h3>Medium</h3>
<hr>
<p>Given an array of integers <code>nums</code> and an integer <code>k</code>, return the number of unique k-diff pairs in the array.</p>

<p>A k-diff pair is an integer pair <code>(nums[i], nums[j])</code>, where the following are true:</p>
<ul>
  <li><code>0 <= i, j < nums.length</code></li>
  <li><code>i != j</code></li>
  <li><code>|nums[i] - nums[j]| == k</code></li>
</ul>
<p>Notice that <code>|val|</code> denotes the absolute value of <code>val</code>.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [3,1,4,1,5], k = 2
<strong>Output:</strong> 2
<strong>Explanation:</strong> There are two 2-diff pairs in the array, (1, 3) and (3, 5).
Although we have two 1s in the input, we should only return the number of unique pairs.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,2,3,4,5], k = 1
<strong>Output:</strong> 4
<strong>Explanation:</strong> There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,3,1,5,4], k = 0
<strong>Output:</strong> 1
<strong>Explanation:</strong> There is one 0-diff pair in the array, (1, 1).
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li>1 <= nums.length <= 10<sup>4</sup></li>
  <li>-10<sup>7</sup> <= nums[i] <= 10<sup>7</sup></li>
  <li>0 <= k <= 10<sup>7</sup></li>
</ul>
