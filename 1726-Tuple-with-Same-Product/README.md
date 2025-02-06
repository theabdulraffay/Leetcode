<h2><a href="https://leetcode.com/problems/tuple-with-same-product">1726. Tuple with Same Product</a></h2>
<h3>Medium</h3>
<hr>
<p>Given an array <code>nums</code> of distinct positive integers, return the number of tuples <code>(a, b, c, d)</code> such that <code>a * b = c * d</code> where <code>a</code>, <code>b</code>, <code>c</code>, and <code>d</code> are elements of <code>nums</code>, and <code>a != b != c != d</code>.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [2,3,4,6]
<strong>Output:</strong> 8
<strong>Explanation:</strong> There are 8 valid tuples:
(2,6,3,4) , (2,6,4,3) , (6,2,3,4) , (6,2,4,3)
(3,4,2,6) , (4,3,2,6) , (3,4,6,2) , (4,3,6,2)
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,2,4,5,10]
<strong>Output:</strong> 16
<strong>Explanation:</strong> There are 16 valid tuples:
(1,10,2,5) , (1,10,5,2) , (10,1,2,5) , (10,1,5,2)
(2,5,1,10) , (2,5,10,1) , (5,2,1,10) , (5,2,10,1)
(2,10,4,5) , (2,10,5,4) , (10,2,4,5) , (10,2,5,4)
(4,5,2,10) , (4,5,10,2) , (5,4,2,10) , (5,4,10,2)
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>1 <= <code>nums.length</code> <= 1000</li>
  <li>1 <= <code>nums[i]</code> <= 10<sup>4</sup></li>
  <li>All elements in <code>nums</code> are distinct.</li>
</ul>
