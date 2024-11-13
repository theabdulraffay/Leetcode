<h2><a href="https://leetcode.com/problems/count-the-number-of-fair-pairs">2563. Count the Number of Fair Pairs</a></h2>
<h3>Medium</h3>
<hr>
<p>Given a 0-indexed integer array <code>nums</code> of size <code>n</code> and two integers <code>lower</code> and <code>upper</code>, return the number of fair pairs.</p>

<p>A pair <code>(i, j)</code> is fair if:</p>
<ul>
  <li><code>0 <= i < j < n</code>, and</li>
  <li><code>lower <= nums[i] + nums[j] <= upper</code></li>
</ul>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [0,1,7,4,4,5], lower = 3, upper = 6
<strong>Output:</strong> 6
<strong>Explanation:</strong> There are 6 fair pairs: (0,3), (0,4), (0,5), (1,3), (1,4), and (1,5).
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,7,9,2,5], lower = 11, upper = 11
<strong>Output:</strong> 1
<strong>Explanation:</strong> There is a single fair pair: (2,3).
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 <= nums.length <= 10<sup>5</sup></code></li>
  <li><code>nums.length == n</code></li>
  <li><code>-10<sup>9</sup> <= nums[i] <= 10<sup>9</sup></code></li>
  <li><code>-10<sup>9</sup> <= lower <= upper <= 10<sup>9</sup></code></li>
</ul>
