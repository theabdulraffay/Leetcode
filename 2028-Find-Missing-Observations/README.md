<h2><a href="https://leetcode.com/problems/find-missing-observations">2028. Find Missing Observations</a></h2>
<h3>Medium</h3>
<hr>
<p>You have observations of <code>n + m</code> 6-sided dice rolls with each face numbered from 1 to 6. <code>n</code> of the observations went missing, and you only have the observations of <code>m</code> rolls. Fortunately, you have also calculated the average value of the <code>n + m</code> rolls.</p>
<p>You are given an integer array <code>rolls</code> of length <code>m</code> where <code>rolls[i]</code> is the value of the <code>i<sup>th</sup></code> observation. You are also given the two integers <code>mean</code> and <code>n</code>.</p>
<p>Return an array of length <code>n</code> containing the missing observations such that the average value of the <code>n + m</code> rolls is exactly <code>mean</code>. If there are multiple valid answers, return any of them. If no such array exists, return an empty array.</p>
<p>The average value of a set of <code>k</code> numbers is the sum of the numbers divided by <code>k</code>.</p>
<p>Note that <code>mean</code> is an integer, so the sum of the <code>n + m</code> rolls should be divisible by <code>n + m</code>.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> rolls = [3,2,4,3], mean = 4, n = 2
<strong>Output:</strong> [6,6]
<strong>Explanation:</strong> The mean of all n + m rolls is (3 + 2 + 4 + 3 + 6 + 6) / 6 = 4.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> rolls = [1,5,6], mean = 3, n = 4
<strong>Output:</strong> [2,3,2,2]
<strong>Explanation:</strong> The mean of all n + m rolls is (1 + 5 + 6 + 2 + 3 + 2 + 2) / 7 = 3.
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> rolls = [1,2,3,4], mean = 6, n = 4
<strong>Output:</strong> []
<strong>Explanation:</strong> It is impossible for the mean to be 6 no matter what the 4 missing rolls are.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li><code>m == rolls.length</code></li>
<li><code>1 <= n, m <= 10<sup>5</sup></code></li>
<li><code>1 <= rolls[i], mean <= 6</code></li>
</ul>
