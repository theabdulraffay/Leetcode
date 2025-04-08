<h2><a href="https://leetcode.com/problems/minimum-number-of-operations-to-make-elements-in-array-distinct">3396. Minimum Number of Operations to Make Elements in Array Distinct</a></h2>
<h3>Easy</h3>
<hr>
<p>You are given an integer array <code>nums</code>. You need to ensure that the elements in the array are distinct. To achieve this, you can perform the following operation any number of times:</p>
<ul>
  <li>Remove 3 elements from the beginning of the array. If the array has fewer than 3 elements, remove all remaining elements.</li>
</ul>
<p>Note that an empty array is considered to have distinct elements. Return the minimum number of operations needed to make the elements in the array distinct.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,2,3,4,2,3,3,5,7]
<strong>Output:</strong> 2
<strong>Explanation:</strong>
In the first operation, the first 3 elements are removed, resulting in the array [4, 2, 3, 3, 5, 7].
In the second operation, the next 3 elements are removed, resulting in the array [3, 5, 7], which has distinct elements.
Therefore, the answer is 2.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [4,5,6,4,4]
<strong>Output:</strong> 2
<strong>Explanation:</strong>
In the first operation, the first 3 elements are removed, resulting in the array [4, 4].
In the second operation, all remaining elements are removed, resulting in an empty array.
Therefore, the answer is 2.
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> nums = [6,7,8,9]
<strong>Output:</strong> 0
<strong>Explanation:</strong>
The array already contains distinct elements. Therefore, the answer is 0.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>1 <= <code>nums.length</code> <= 100</li>
  <li>1 <= <code>nums[i]</code> <= 100</li>
</ul>
