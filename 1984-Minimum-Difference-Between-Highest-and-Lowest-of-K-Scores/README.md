<h2><a href="https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores">1984. Minimum Difference Between Highest and Lowest of K Scores</a></h2>
<h3>Easy</h3>
<hr>
<p>You are given a 0-indexed integer array <code>nums</code>, where <code>nums[i]</code> represents the score of the <code>i<sup>th</sup></code> student. You are also given an integer <code>k</code>.</p>
<p>Pick the scores of any <code>k</code> students from the array so that the difference between the highest and the lowest of the <code>k</code> scores is minimized.</p>
<p>Return the minimum possible difference.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [90], k = 1
<strong>Output:</strong> 0
<strong>Explanation:</strong> There is one way to pick score(s) of one student:
- [90]. The difference between the highest and lowest score is 90 - 90 = 0.
The minimum possible difference is 0.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [9,4,1,7], k = 2
<strong>Output:</strong> 2
<strong>Explanation:</strong> There are six ways to pick score(s) of two students:
- [9,4,1,7]. The difference between the highest and lowest score is 9 - 4 = 5.
- [9,4,1,7]. The difference between the highest and lowest score is 9 - 1 = 8.
- [9,4,1,7]. The difference between the highest and lowest score is 9 - 7 = 2.
- [9,4,1,7]. The difference between the highest and lowest score is 4 - 1 = 3.
- [9,4,1,7]. The difference between the highest and lowest score is 7 - 4 = 3.
- [9,4,1,7]. The difference between the highest and lowest score is 7 - 1 = 6.
The minimum possible difference is 2.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ <code>k</code> ≤ <code>nums.length</code> ≤ 1000</li>
<li>0 ≤ <code>nums[i]</code> ≤ 10<sup>5</sup></li>
</ul>
