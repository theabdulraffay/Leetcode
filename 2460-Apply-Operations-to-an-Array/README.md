<h2><a href="https://leetcode.com/problems/apply-operations-to-an-array">2460. Apply Operations to an Array</a></h2>
<h3>Easy</h3>
<hr>
<p>You are given a 0-indexed array <code>nums</code> of size <code>n</code> consisting of non-negative integers.</p>
<p>You need to apply <code>n - 1</code> operations to this array where, in the <code>i</code>-th operation (0-indexed), you will apply the following on the <code>i</code>-th element of <code>nums</code>:</p>
<ul>
  <li>If <code>nums[i] == nums[i + 1]</code>, then multiply <code>nums[i]</code> by 2 and set <code>nums[i + 1]</code> to 0.</li>
  <li>Otherwise, you skip this operation.</li>
</ul>
<p>After performing all the operations, shift all the 0's to the end of the array.</p>
<p>For example, the array <code>[1,0,2,0,0,1]</code> after shifting all its 0's to the end, is <code>[1,2,1,0,0,0]</code>.</p>
<p>Return the resulting array.</p>
<p>Note that the operations are applied sequentially, not all at once.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,2,2,1,1,0]
<strong>Output:</strong> [1,4,2,0,0,0]
<strong>Explanation:</strong> We do the following operations:
- i = 0: nums[0] and nums[1] are not equal, so we skip this operation.
- i = 1: nums[1] and nums[2] are equal, we multiply nums[1] by 2 and change nums[2] to 0. The array becomes [1,4,0,1,1,0].
- i = 2: nums[2] and nums[3] are not equal, so we skip this operation.
- i = 3: nums[3] and nums[4] are equal, we multiply nums[3] by 2 and change nums[4] to 0. The array becomes [1,4,0,2,0,0].
- i = 4: nums[4] and nums[5] are equal, we multiply nums[4] by 2 and change nums[5] to 0. The array becomes [1,4,0,2,0,0].
After that, we shift the 0's to the end, which gives the array [1,4,2,0,0,0].
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [0,1]
<strong>Output:</strong> [1,0]
<strong>Explanation:</strong> No operation can be applied, we just shift the 0 to the end.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>2 <= <code>nums.length</code> <= 2000</li>
  <li>0 <= <code>nums[i]</code> <= 1000</li>
</ul>
