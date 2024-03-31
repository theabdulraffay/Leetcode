<h2><a href="https://leetcode.com/problems/continuous-subarray-sum">523. Continuous Subarray Sum</a></h2>
<h3>Medium</h3>
<hr>
<p>Given an integer array <em>nums</em> and an integer <em>k</em>, return true if <em>nums</em> has a good subarray or false otherwise.</p>
<p>A good subarray is a subarray where:</p>
<ul>
<li>its length is at least two, and</li>
<li>the sum of the elements of the subarray is a multiple of <em>k</em>.</li>
</ul>
<p>Note that:</p>
<ul>
<li>A subarray is a contiguous part of the array.</li>
<li>An integer <em>x</em> is a multiple of <em>k</em> if there exists an integer <em>n</em> such that <em>x = n * k</em>. 0 is always a multiple of <em>k</em>.</li>
</ul>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [23,2,4,6,7], k = 6
<strong>Output:</strong> true
<strong>Explanation:</strong> [2, 4] is a continuous subarray of size 2 whose elements sum up to 6.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [23,2,6,4,7], k = 6
<strong>Output:</strong> true
<strong>Explanation:</strong> [23, 2, 6, 4, 7] is an continuous subarray of size 5 whose elements sum up to 42. 42 is a multiple of 6 because 42 = 7 * 6 and 7 is an integer.
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> nums = [23,2,6,4,7], k = 13
<strong>Output:</strong> false
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>1 &lt;= <em>nums.length</em> <= 10<sup>5</sup></li>
<li>0 &lt;= <em>nums[i]</em> <= 10<sup>9</sup></li>
<li>0 &lt;= sum(<em>nums[i]</em>) <= 2<sup>31</sup> - 1</li>
<li>1 &lt;= <em>k</em> <= 2<sup>31</sup> - 1</li>
</ul>
