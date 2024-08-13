<h2><a href="https://leetcode.com/problems/sliding-subarray-beauty">2653. Sliding Subarray Beauty</a></h2>
<h3>Solved</h3>
<h3>Medium</h3>
<hr>
<p>Given an integer array <code>nums</code> containing <code>n</code> integers, find the beauty of each subarray of size <code>k</code>.</p>

<p>The beauty of a subarray is the <code>x</code>th smallest integer in the subarray if it is negative, or <code>0</code> if there are fewer than <code>x</code> negative integers.</p>

<p>Return an integer array containing <code>n - k + 1</code> integers, which denote the beauty of the subarrays in order from the first index in the array.</p>

<p>A subarray is a contiguous non-empty sequence of elements within an array.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,-1,-3,-2,3], k = 3, x = 2
<strong>Output:</strong> [-1,-2,-2]
<strong>Explanation:</strong> There are 3 subarrays with size k = 3. 
The first subarray is [1, -1, -3] and the 2nd smallest negative integer is -1. 
The second subarray is [-1, -3, -2] and the 2nd smallest negative integer is -2. 
The third subarray is [-3, -2, 3] and the 2nd smallest negative integer is -2.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [-1,-2,-3,-4,-5], k = 2, x = 2
<strong>Output:</strong> [-1,-2,-3,-4]
<strong>Explanation:</strong> There are 4 subarrays with size k = 2.
For [-1, -2], the 2nd smallest negative integer is -1.
For [-2, -3], the 2nd smallest negative integer is -2.
For [-3, -4], the 2nd smallest negative integer is -3.
For [-4, -5], the 2nd smallest negative integer is -4. 
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> nums = [-3,1,2,-3,0,-3], k = 2, x = 1
<strong>Output:</strong> [-3,0,-3,-3,-3]
<strong>Explanation:</strong> There are 5 subarrays with size k = 2.
For [-3, 1], the 1st smallest negative integer is -3.
For [1, 2], there is no negative integer so the beauty is 0.
For [2, -3], the 1st smallest negative integer is -3.
For [-3, 0], the 1st smallest negative integer is -3.
For [0, -3], the 1st smallest negative integer is -3.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>n == nums.length</code></li>
  <li><code>1 <= n <= 10<sup>5</sup></code></li>
  <li><code>1 <= k <= n</code></li>
  <li><code>1 <= x <= k</code></li>
  <li><code>-50 <= nums[i] <= 50</code></li>
</ul>
