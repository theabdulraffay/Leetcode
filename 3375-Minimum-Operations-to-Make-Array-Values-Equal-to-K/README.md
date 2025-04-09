<h2><a href="https://leetcode.com/problems/minimum-operations-to-make-array-values-equal-to-k">3375. Minimum Operations to Make Array Values Equal to K</a></h2>
<h3>Easy</h3>
<hr>
<p>You are given an integer array <code>nums</code> and an integer <code>k</code>.</p>
<p>An integer <code>h</code> is called valid if all values in the array that are strictly greater than <code>h</code> are identical.</p>
<p>For example, if <code>nums = [10, 8, 10, 8]</code>, a valid integer is <code>h = 9</code> because all <code>nums[i] > 9</code> are equal to 10, but 5 is not a valid integer.</p>
<p>You are allowed to perform the following operation on <code>nums</code>:</p>
<ul>
  <li>Select an integer <code>h</code> that is valid for the current values in <code>nums</code>.</li>
  <li>For each index <code>i</code> where <code>nums[i] > h</code>, set <code>nums[i]</code> to <code>h</code>.</li>
</ul>
<p>Return the minimum number of operations required to make every element in <code>nums</code> equal to <code>k</code>. If it is impossible to make all elements equal to <code>k</code>, return <code>-1</code>.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [5,2,5,4,5], k = 2
<strong>Output:</strong> 2
<strong>Explanation:</strong>
The operations can be performed in order using valid integers 4 and then 2.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [2,1,2], k = 2
<strong>Output:</strong> -1
<strong>Explanation:</strong>
It is impossible to make all the values equal to 2.
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> nums = [9,7,5,3], k = 1
<strong>Output:</strong> 4
<strong>Explanation:</strong>
The operations can be performed using valid integers in the order 7, 5, 3, and 1.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>1 <= <code>nums.length</code> <= 100</li>
  <li>1 <= <code>nums[i]</code> <= 100</li>
  <li>1 <= <code>k</code> <= 100</li>
</ul>
