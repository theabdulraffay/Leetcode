<h2><a href="https://leetcode.com/problems/find-unique-binary-string">1980. Find Unique Binary String</a></h2>
<h3>Medium</h3>
<hr>
<p>Given an array of strings <code>nums</code> containing <code>n</code> unique binary strings each of length <code>n</code>, return a binary string of length <code>n</code> that does not appear in <code>nums</code>. If there are multiple answers, you may return any of them.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = ["01","10"]
<strong>Output:</strong> "11"
<strong>Explanation:</strong> "11" does not appear in nums. "00" would also be correct.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = ["00","01"]
<strong>Output:</strong> "11"
<strong>Explanation:</strong> "11" does not appear in nums. "10" would also be correct.
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> nums = ["111","011","001"]
<strong>Output:</strong> "101"
<strong>Explanation:</strong> "101" does not appear in nums. "000", "010", "100", and "110" would also be correct.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li><code>n == nums.length</code></li>
  <li>1 <= <code>n</code> <= 16</li>
  <li><code>nums[i].length == n</code></li>
  <li><code>nums[i]</code> is either '0' or '1'.</li>
  <li>All the strings of <code>nums</code> are unique.</li>
</ul>
