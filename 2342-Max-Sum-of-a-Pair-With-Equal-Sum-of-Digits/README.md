<h2><a href="https://leetcode.com/problems/max-sum-of-a-pair-with-equal-sum-of-digits">2342. Max Sum of a Pair With Equal Sum of Digits</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a 0-indexed array <code>nums</code> consisting of positive integers. You can choose two indices <code>i</code> and <code>j</code>, such that <code>i != j</code>, and the sum of digits of the number <code>nums[i]</code> is equal to that of <code>nums[j]</code>.</p>
<p>Return the maximum value of <code>nums[i] + nums[j]</code> that you can obtain over all possible indices <code>i</code> and <code>j</code> that satisfy the conditions.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [18,43,36,13,7]
<strong>Output:</strong> 54
<strong>Explanation:</strong> The pairs (i, j) that satisfy the conditions are:
- (0, 2), both numbers have a sum of digits equal to 9, and their sum is 18 + 36 = 54.
- (1, 4), both numbers have a sum of digits equal to 7, and their sum is 43 + 7 = 50.
So the maximum sum that we can obtain is 54.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [10,12,19,14]
<strong>Output:</strong> -1
<strong>Explanation:</strong> There are no two numbers that satisfy the conditions, so we return -1.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>1 <= <code>nums.length</code> <= 10<sup>5</sup></li>
  <li>1 <= <code>nums[i]</code> <= 10<sup>9</sup></li>
</ul>
