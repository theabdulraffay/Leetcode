<h2><a href="https://leetcode.com/problems/prime-subtraction-operation">2601. Prime Subtraction Operation</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a 0-indexed integer array <code>nums</code> of length <code>n</code>.</p>

<p>You can perform the following operation as many times as you want:</p>
<ul>
<li>Pick an index <code>i</code> that you haven’t picked before, and pick a prime <code>p</code> strictly less than <code>nums[i]</code>, then subtract <code>p</code> from <code>nums[i]</code>.</li>
</ul>

<p>Return <code>true</code> if you can make <code>nums</code> a strictly increasing array using the above operation and <code>false</code> otherwise.</p>

<p>A strictly increasing array is an array in which each element is strictly greater than its preceding element.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [4,9,6,10]
<strong>Output:</strong> true
<strong>Explanation:</strong> 
In the first operation: Pick i = 0 and p = 3, then subtract 3 from nums[0], so that nums becomes [1,9,6,10].
In the second operation: i = 1, p = 7, subtract 7 from nums[1], so nums becomes equal to [1,2,6,10].
After the second operation, nums is sorted in strictly increasing order, so the answer is true.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [6,8,11,12]
<strong>Output:</strong> true
<strong>Explanation:</strong> Initially nums is sorted in strictly increasing order, so we don't need to make any operations.
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> nums = [5,8,3]
<strong>Output:</strong> false
<strong>Explanation:</strong> It can be proven that there is no way to perform operations to make nums sorted in strictly increasing order, so the answer is false.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li><code>1 <= nums.length <= 1000</code></li>
<li><code>1 <= nums[i] <= 1000</code></li>
<li><code>nums.length == n</code></li>
</ul>
