<h2><a href="https://leetcode.com/problems/count-complete-subarrays-in-an-array/description/">2799. Count Complete Subarrays in an Array</a></h2>
<h3>Solved</h3>
<hr>
<p>You are given an array <code>nums</code> consisting of positive integers.</p>
<p>We call a subarray of an array complete if the following condition is satisfied:</p>
<ul>
  <li>The number of distinct elements in the subarray is equal to the number of distinct elements in the whole array.</li>
</ul>
<p>Return the number of complete subarrays.</p>
<p>A subarray is a contiguous non-empty part of an array.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,3,1,2,2]
<strong>Output:</strong> 4
<strong>Explanation:</strong> The complete subarrays are the following: [1,3,1,2], [1,3,1,2,2], [3,1,2] and [3,1,2,2].
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [5,5,5,5]
<strong>Output:</strong> 10
<strong>Explanation:</strong> The array consists only of the integer 5, so any subarray is complete. The number of subarrays that we can choose is 10.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li>1 <= nums.length <= 1000</li>
  <li>1 <= nums[i] <= 2000</li>
</ul>
