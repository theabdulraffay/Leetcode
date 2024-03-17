<h2><a href="https://leetcode.com/problems/3sum/description/">15. 3Sum</a></h2>
<h3>Medium</h3>
<hr>
<p>Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.</p>
<p>Notice that the solution set must not contain duplicate triplets.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [-1,0,1,2,-1,-4]
<strong>Output:</strong> [[-1,-1,2],[-1,0,1]]
<strong>Explanation:</strong> 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [0,1,1]
<strong>Output:</strong> []
<strong>Explanation:</strong> The only possible triplet does not sum up to 0.
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> nums = [0,0,0]
<strong>Output:</strong> [[0,0,0]]
<strong>Explanation:</strong> The only possible triplet sums up to 0.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>3 <= nums.length <= 3000</li>
  <li>-105 <= nums[i] <= 105</li>
</ul>
