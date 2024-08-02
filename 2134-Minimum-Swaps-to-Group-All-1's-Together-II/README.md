<h2><a href="https://leetcode.com/problems/minimum-swaps-to-group-all-1s-together-ii">2134. Minimum Swaps to Group All 1's Together II</a></h2>
<h3>Medium</h3>
<hr>
<p>A swap is defined as taking two distinct positions in an array and swapping the values in them.</p>
<p>A circular array is defined as an array where we consider the first element and the last element to be adjacent.</p>
<p>Given a binary circular array <code>nums</code>, return the minimum number of swaps required to group all 1's present in the array together at any location.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [0,1,0,1,1,0,0]
<strong>Output:</strong> 1
<strong>Explanation:</strong> Here are a few of the ways to group all the 1's together:
[0,0,1,1,1,0,0] using 1 swap.
[0,1,1,1,0,0,0] using 1 swap.
[1,1,0,0,0,0,1] using 2 swaps (using the circular property of the array).
There is no way to group all 1's together with 0 swaps.
Thus, the minimum number of swaps required is 1.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [0,1,1,1,0,0,1,1,0]
<strong>Output:</strong> 2
<strong>Explanation:</strong> Here are a few of the ways to group all the 1's together:
[1,1,1,0,0,0,0,1,1] using 2 swaps (using the circular property of the array).
[1,1,1,1,1,0,0,0,0] using 2 swaps.
There is no way to group all 1's together with 0 or 1 swaps.
Thus, the minimum number of swaps required is 2.
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,1,0,0,1]
<strong>Output:</strong> 0
<strong>Explanation:</strong> All the 1's are already grouped together due to the circular property of the array.
Thus, the minimum number of swaps required is 0.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ <code>nums.length</code> ≤ 10<sup>5</sup></li>
<li><code>nums[i]</code> is either 0 or 1.</li>
</ul>
