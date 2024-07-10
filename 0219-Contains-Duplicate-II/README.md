<h2><a href="https://leetcode.com/problems/contains-duplicate-ii">219. Contains Duplicate II</a></h2>
<h3>Easy</h3>
<hr>
<p>Given an integer array <code>nums</code> and an integer <code>k</code>, return <code>true</code> if there are two distinct indices <code>i</code> and <code>j</code> in the array such that <code>nums[i] == nums[j]</code> and <code>abs(i - j) <= k</code>.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,2,3,1], k = 3
<strong>Output:</strong> true
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,0,1,1], k = 1
<strong>Output:</strong> true
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,2,3,1,2,3], k = 2
<strong>Output:</strong> false
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ <code>nums.length</code> ≤ 10<sup>5</sup></li>
<li>-10<sup>9</sup> ≤ <code>nums[i]</code> ≤ 10<sup>9</sup></li>
<li>0 ≤ <code>k</code> ≤ 10<sup>5</sup></li>
</ul>
