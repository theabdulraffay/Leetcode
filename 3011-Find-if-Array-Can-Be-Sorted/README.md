<h2><a href="https://leetcode.com/problems/find-if-array-can-be-sorted">3011. Find if Array Can Be Sorted</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a 0-indexed array of positive integers <code>nums</code>.</p>

<p>In one operation, you can swap any two adjacent elements if they have the same number of set bits. You are allowed to do this operation any number of times (including zero).</p>

<p>Return <code>true</code> if you can sort the array, else return <code>false</code>.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [8,4,2,30,15]
<strong>Output:</strong> true
<strong>Explanation:</strong> 
Let's look at the binary representation of every element:
- The numbers 2, 4, and 8 have one set bit each with binary representation "10", "100", and "1000" respectively.
- The numbers 15 and 30 have four set bits each with binary representation "1111" and "11110".

We can sort the array using 4 operations:
1. Swap nums[0] with nums[1]. The array becomes [4,8,2,30,15].
2. Swap nums[1] with nums[2]. The array becomes [4,2,8,30,15].
3. Swap nums[0] with nums[1]. The array becomes [2,4,8,30,15].
4. Swap nums[3] with nums[4]. The array becomes [2,4,8,15,30].

The array has become sorted, hence we return true.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,2,3,4,5]
<strong>Output:</strong> true
<strong>Explanation:</strong> The array is already sorted, hence we return true.
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> nums = [3,16,8,4,2]
<strong>Output:</strong> false
<strong>Explanation:</strong> It can be shown that it is not possible to sort the input array using any number of operations.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li><code>1 <= nums.length <= 100</code></li>
<li><code>1 <= nums[i] <= 2<sup>28</sup></code></li>
</ul>
