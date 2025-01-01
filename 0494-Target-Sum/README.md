<h2><a href="https://leetcode.com/problems/target-sum">494. Target Sum</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given an integer array <code>nums</code> and an integer <code>target</code>.</p>
<p>You want to build an expression out of <code>nums</code> by adding one of the symbols '+' and '-' before each integer in <code>nums</code> and then concatenating all the integers.</p>

<p>For example, if <code>nums = [2, 1]</code>, you can add a '+' before 2 and a '-' before 1 and concatenate them to build the expression <code>"+2-1"</code>.</p>

<p>Return the number of different expressions that you can build, which evaluates to <code>target</code>.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,1,1,1,1], target = 3
<strong>Output:</strong> 5
<strong>Explanation:</strong> There are 5 ways to assign symbols to make the sum of nums be target 3.
-1 + 1 + 1 + 1 + 1 = 3
+1 - 1 + 1 + 1 + 1 = 3
+1 + 1 - 1 + 1 + 1 = 3
+1 + 1 + 1 - 1 + 1 = 3
+1 + 1 + 1 + 1 - 1 = 3
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [1], target = 1
<strong>Output:</strong> 1
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 <= nums.length <= 20</code></li>
  <li><code>0 <= nums[i] <= 1000</code></li>
  <li><code>0 <= sum(nums[i]) <= 1000</code></li>
  <li><code>-1000 <= target <= 1000</code></li>
</ul>
