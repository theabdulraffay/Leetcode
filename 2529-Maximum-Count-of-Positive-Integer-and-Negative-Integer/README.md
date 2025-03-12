<h2><a href="https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer">2529. Maximum Count of Positive Integer and Negative Integer</a></h2>
<h3>Easy</h3>
<hr>
<p>Given an array <code>nums</code> sorted in non-decreasing order, return the maximum between the number of positive integers and the number of negative integers.</p>
<p>In other words, if the number of positive integers in <code>nums</code> is <code>pos</code> and the number of negative integers is <code>neg</code>, then return the maximum of <code>pos</code> and <code>neg</code>.</p>
<p>Note that 0 is neither positive nor negative.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [-2,-1,-1,1,2,3]
<strong>Output:</strong> 3
<strong>Explanation:</strong> There are 3 positive integers and 3 negative integers. The maximum count among them is 3.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [-3,-2,-1,0,0,1,2]
<strong>Output:</strong> 3
<strong>Explanation:</strong> There are 2 positive integers and 3 negative integers. The maximum count among them is 3.
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> nums = [5,20,66,1314]
<strong>Output:</strong> 4
<strong>Explanation:</strong> There are 4 positive integers and 0 negative integers. The maximum count among them is 4.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>1 <= <code>nums.length</code> <= 2000</li>
  <li>-2000 <= <code>nums[i]</code> <= 2000</li>
  <li><code>nums</code> is sorted in a non-decreasing order.</li>
</ul>
<p><strong>Follow up:</strong> Can you solve the problem in <code>O(log(n))</code> time complexity?</p>
