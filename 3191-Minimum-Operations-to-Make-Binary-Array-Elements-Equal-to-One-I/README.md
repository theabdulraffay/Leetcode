<h2><a href="https://leetcode.com/problems/minimum-operations-to-make-binary-array-elements-equal-to-one-i">3191. Minimum Operations to Make Binary Array Elements Equal to One I</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a binary array <code>nums</code>.</p>
<p>You can do the following operation on the array any number of times (possibly zero):</p>
<ul>
  <li>Choose any 3 consecutive elements from the array and flip all of them.</li>
</ul>
<p>Flipping an element means changing its value from 0 to 1, and from 1 to 0.</p>
<p>Return the minimum number of operations required to make all elements in <code>nums</code> equal to 1. If it is impossible, return <code>-1</code>.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [0,1,1,1,0,0]
<strong>Output:</strong> 3
<strong>Explanation:</strong>
We can do the following operations:
- Choose the elements at indices 0, 1 and 2. The resulting array is nums = [1,0,0,1,0,0].
- Choose the elements at indices 1, 2 and 3. The resulting array is nums = [1,1,1,0,0,0].
- Choose the elements at indices 3, 4 and 5. The resulting array is nums = [1,1,1,1,1,1].
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [0,1,1,1]
<strong>Output:</strong> -1
<strong>Explanation:</strong>
It is impossible to make all elements equal to 1.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>3 <= <code>nums.length</code> <= 10<sup>5</sup></li>
  <li>0 <= <code>nums[i]</code> <= 1</li>
</ul>
