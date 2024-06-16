<h2><a href="https://leetcode.com/problems/maximum-product-after-k-increments">2233. Maximum Product After K Increments</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given an array of non-negative integers <code>nums</code> and an integer <code>k</code>. In one operation, you may choose any element from <code>nums</code> and increment it by 1.</p>
<p>Return the maximum product of <code>nums</code> after at most <code>k</code> operations. Since the answer may be very large, return it modulo <code>10^9 + 7</code>. Note that you should maximize the product before taking the modulo.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [0,4], k = 5
<strong>Output:</strong> 20
<strong>Explanation:</strong> Increment the first number 5 times.
Now nums = [5, 4], with a product of 5 * 4 = 20.
It can be shown that 20 is maximum product possible, so we return 20.
Note that there may be other ways to increment nums to have the maximum product.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [6,3,3,2], k = 2
<strong>Output:</strong> 216
<strong>Explanation:</strong> Increment the second number 1 time and increment the fourth number 1 time.
Now nums = [6, 4, 3, 3], with a product of 6 * 4 * 3 * 3 = 216.
It can be shown that 216 is maximum product possible, so we return 216.
Note that there may be other ways to increment nums to have the maximum product.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ <code>nums.length</code>, <code>k</code> ≤ 10<sup>5</sup></li>
<li>0 ≤ <code>nums[i]</code> ≤ 10<sup>6</sup></li>
</ul>
