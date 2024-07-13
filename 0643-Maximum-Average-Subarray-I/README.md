<h2><a href="https://leetcode.com/problems/maximum-average-subarray-i">643. Maximum Average Subarray I</a></h2>
<h3>Easy</h3>
<hr>
<p>You are given an integer array <code>nums</code> consisting of <code>n</code> elements, and an integer <code>k</code>.</p>
<p>Find a contiguous subarray whose length is equal to <code>k</code> that has the maximum average value and return this value. Any answer with a calculation error less than <code>10<sup>-5</sup></code> will be accepted.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,12,-5,-6,50,3], k = 4
<strong>Output:</strong> 12.75000
<strong>Explanation:</strong> Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [5], k = 1
<strong>Output:</strong> 5.00000
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li><code>n == nums.length</code></li>
<li><code>1 ≤ k ≤ n ≤ 10<sup>5</sup></code></li>
<li><code>-10<sup>4</sup> ≤ nums[i] ≤ 10<sup>4</sup></code></li>
</ul>
