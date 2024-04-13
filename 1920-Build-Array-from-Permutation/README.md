<h2><a href="https://leetcode.com/problems/build-array-from-permutation">1920. Build Array from Permutation</a></h2>
<h3>Easy</h3>
<hr>
<p>Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 ≤ i < nums.length and return it.</p>
<p>A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [0,2,1,5,3,4]
<strong>Output:</strong> [0,1,2,4,5,3]
<strong>Explanation:</strong> The array ans is built as follows: 
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
    = [0,1,2,4,5,3]
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [5,0,1,2,3,4]
<strong>Output:</strong> [4,5,0,1,2,3]
<strong>Explanation:</strong> The array ans is built as follows:
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[5], nums[0], nums[1], nums[2], nums[3], nums[4]]
    = [4,5,0,1,2,3]
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ <em>nums.length</em> ≤ 1000</li>
<li>0 ≤ <em>nums[i]</em> < <em>nums.length</em></li>
<li>The elements in nums are distinct.</li>
</ul>
<p><strong>Follow-up:</strong> Can you solve it without using an extra space (i.e., O(1) memory)?</p>
