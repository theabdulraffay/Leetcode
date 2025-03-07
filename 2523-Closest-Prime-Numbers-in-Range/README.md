<h2><a href="https://leetcode.com/problems/closest-prime-numbers-in-range">2523. Closest Prime Numbers in Range</a></h2>
<h3>Medium</h3>
<hr>
<p>Given two positive integers <code>left</code> and <code>right</code>, find the two integers <code>num1</code> and <code>num2</code> such that:</p>
<ul>
  <li><code>left <= num1 < num2 <= right</code>.</li>
  <li>Both <code>num1</code> and <code>num2</code> are prime numbers.</li>
  <li><code>num2 - num1</code> is the minimum amongst all other pairs satisfying the above conditions.</li>
</ul>
<p>Return the positive integer array <code>ans = [num1, num2]</code>. If there are multiple pairs satisfying these conditions, return the one with the smallest <code>num1</code> value. If no such numbers exist, return <code>[-1, -1]</code>.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> left = 10, right = 19
<strong>Output:</strong> [11,13]
<strong>Explanation:</strong> The prime numbers between 10 and 19 are 11, 13, 17, and 19.
The closest gap between any pair is 2, which can be achieved by [11,13] or [17,19].
Since 11 is smaller than 17, we return the first pair.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> left = 4, right = 6
<strong>Output:</strong> [-1,-1]
<strong>Explanation:</strong> There exists only one prime number in the given range, so the conditions cannot be satisfied.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>1 <= <code>left</code> <= <code>right</code> <= 10<sup>6</sup></li>
</ul>
