<h2><a href="https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element">1493. Longest Subarray of 1's After Deleting One Element</a></h2>
<h3>Medium</h3>
<hr>
<p>Given a binary array <code>nums</code>, you should delete one element from it.</p>
<p>Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,1,0,1]
<strong>Output:</strong> 3
<strong>Explanation:</strong> After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [0,1,1,1,0,1,1,0,1]
<strong>Output:</strong> 5
<strong>Explanation:</strong> After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1].
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,1,1]
<strong>Output:</strong> 2
<strong>Explanation:</strong> You must delete one element.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ <code>nums.length</code> ≤ 10<sup>5</sup></li>
<li><code>nums[i]</code> is either 0 or 1.</li>
</ul>
