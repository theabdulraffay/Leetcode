<h2><a href="https://leetcode.com/problems/minimum-index-of-a-valid-split">2780. Minimum Index of a Valid Split</a></h2>
<h3>Medium</h3>
<hr>
<p>An element <code>x</code> of an integer array <code>arr</code> of length <code>m</code> is dominant if more than half the elements of <code>arr</code> have a value of <code>x</code>.</p>
<p>You are given a 0-indexed integer array <code>nums</code> of length <code>n</code> with one dominant element.</p>
<p>You can split <code>nums</code> at an index <code>i</code> into two arrays <code>nums[0, ..., i]</code> and <code>nums[i + 1, ..., n - 1]</code>, but the split is only valid if:</p>
<ul>
  <li>0 <= <code>i</code> < <code>n - 1</code></li>
  <li><code>nums[0, ..., i]</code>, and <code>nums[i + 1, ..., n - 1]</code> have the same dominant element.</li>
</ul>
<p>Here, <code>nums[i, ..., j]</code> denotes the subarray of <code>nums</code> starting at index <code>i</code> and ending at index <code>j</code>, both ends being inclusive. Particularly, if <code>j < i</code> then <code>nums[i, ..., j]</code> denotes an empty subarray.</p>
<p>Return the minimum index of a valid split. If no valid split exists, return <code>-1</code>.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,2,2,2]
<strong>Output:</strong> 2
<strong>Explanation:</strong> We can split the array at index 2 to obtain arrays [1,2,2] and [2].
In array [1,2,2], element 2 is dominant since it occurs twice in the array and 2 * 2 > 3.
In array [2], element 2 is dominant since it occurs once in the array and 1 * 2 > 1.
Both [1,2,2] and [2] have the same dominant element as nums, so this is a valid split.
It can be shown that index 2 is the minimum index of a valid split.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [2,1,3,1,1,1,7,1,2,1]
<strong>Output:</strong> 4
<strong>Explanation:</strong> We can split the array at index 4 to obtain arrays [2,1,3,1,1] and [1,7,1,2,1].
In array [2,1,3,1,1], element 1 is dominant since it occurs thrice in the array and 3 * 2 > 5.
In array [1,7,1,2,1], element 1 is dominant since it occurs thrice in the array and 3 * 2 > 5.
Both [2,1,3,1,1] and [1,7,1,2,1] have the same dominant element as nums, so this is a valid split.
It can be shown that index 4 is the minimum index of a valid split.
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> nums = [3,3,3,3,7,2,2]
<strong>Output:</strong> -1
<strong>Explanation:</strong> It can be shown that there is no valid split.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>1 <= <code>nums.length</code> <= 10<sup>5</sup></li>
  <li>1 <= <code>nums[i]</code> <= 10<sup>9</sup></li>
  <li><code>nums</code> has exactly one dominant element.</li>
</ul>
