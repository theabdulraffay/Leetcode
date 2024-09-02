<h2><a href="https://leetcode.com/problems/find-the-kth-largest-integer-in-the-array">1985. Find the Kth Largest Integer in the Array</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given an array of strings <code>nums</code> and an integer <code>k</code>. Each string in <code>nums</code> represents an integer without leading zeros.</p>
<p>Return the string that represents the <code>k</code>th largest integer in <code>nums</code>.</p>
<p>Note: Duplicate numbers should be counted distinctly. For example, if <code>nums</code> is ["1","2","2"], "2" is the first largest integer, "2" is the second-largest integer, and "1" is the third-largest integer.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = ["3","6","7","10"], k = 4
<strong>Output:</strong> "3"
<strong>Explanation:</strong> The numbers in nums sorted in non-decreasing order are ["3","6","7","10"].
The 4th largest integer in nums is "3".
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = ["2","21","12","1"], k = 3
<strong>Output:</strong> "2"
<strong>Explanation:</strong> The numbers in nums sorted in non-decreasing order are ["1","2","12","21"].
The 3rd largest integer in nums is "2".
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> nums = ["0","0"], k = 2
<strong>Output:</strong> "0"
<strong>Explanation:</strong> The numbers in nums sorted in non-decreasing order are ["0","0"].
The 2nd largest integer in nums is "0".
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li><code>1 <= k <= nums.length <= 10<sup>4</sup></code></li>
<li><code>1 <= nums[i].length <= 100</code></li>
<li><code>nums[i]</code> consists of only digits.</li>
<li><code>nums[i]</code> will not have any leading zeros.</li>
</ul>
