<h2><a href="https://leetcode.com/problems/longest-square-streak-in-an-array">2501. Longest Square Streak in an Array</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given an integer array <code>nums</code>. A subsequence of <code>nums</code> is called a <em>square streak</em> if:</p>
<ul>
<li>The length of the subsequence is at least 2, and</li>
<li>after sorting the subsequence, each element (except the first element) is the square of the previous number.</li>
</ul>

<p>Return the length of the longest square streak in <code>nums</code>, or return <code>-1</code> if there is no square streak.</p>

<p>A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [4,3,6,16,8,2]
<strong>Output:</strong> 3
<strong>Explanation:</strong> Choose the subsequence [4,16,2]. After sorting it, it becomes [2,4,16].
- 4 = 2 * 2.
- 16 = 4 * 4.
Therefore, [4,16,2] is a square streak.
It can be shown that every subsequence of length 4 is not a square streak.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [2,3,5,6,7]
<strong>Output:</strong> -1
<strong>Explanation:</strong> There is no square streak in nums so return -1.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li><code>2 <= nums.length <= 10<sup>5</sup></code></li>
<li><code>2 <= nums[i] <= 10<sup>5</sup></code></li>
</ul>
