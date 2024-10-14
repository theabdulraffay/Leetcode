<h2><a href="https://leetcode.com/problems/maximal-score-after-applying-k-operations">2530. Maximal Score After Applying K Operations</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a 0-indexed integer array <code>nums</code> and an integer <code>k</code>. You have a starting score of 0.</p>

<p>In one operation:</p>
<ul>
  <li>Choose an index <code>i</code> such that <code>0 <= i < nums.length</code>,</li>
  <li>Increase your score by <code>nums[i]</code>, and</li>
  <li>Replace <code>nums[i]</code> with <code>ceil(nums[i] / 3)</code>.</li>
</ul>

<p>Return the maximum possible score you can attain after applying exactly <code>k</code> operations.</p>

<p>The ceiling function <code>ceil(val)</code> is the least integer greater than or equal to <code>val</code>.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [10,10,10,10,10], k = 5
<strong>Output:</strong> 50
<strong>Explanation:</strong> Apply the operation to each array element exactly once. The final score is 10 + 10 + 10 + 10 + 10 = 50.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,10,3,3,3], k = 3
<strong>Output:</strong> 17
<strong>Explanation:</strong> You can do the following operations:
Operation 1: Select <code>i = 1</code>, so <code>nums</code> becomes [1,4,3,3,3]. Your score increases by 10.
Operation 2: Select <code>i = 1</code>, so <code>nums</code> becomes [1,2,3,3,3]. Your score increases by 4.
Operation 3: Select <code>i = 2</code>, so <code>nums</code> becomes [1,1,1,3,3]. Your score increases by 3.
The final score is 10 + 4 + 3 = 17.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 <= nums.length, k <= 10^5</code></li>
  <li><code>1 <= nums[i] <= 10^9</code></li>
</ul>
