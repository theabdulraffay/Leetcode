<h2><a href="https://leetcode.com/problems/unique-paths">62. Unique Paths</a></h2>
<h3>Medium</h3>
<hr>
<p>There is a robot on an <code>m x n</code> grid. The robot is initially located at the top-left corner (i.e., <code>grid[0][0]</code>). The robot tries to move to the bottom-right corner (i.e., <code>grid[m - 1][n - 1]</code>). The robot can only move either down or right at any point in time.</p>

<p>Given the two integers <code>m</code> and <code>n</code>, return the number of possible unique paths that the robot can take to reach the bottom-right corner.</p>

<p>The test cases are generated so that the answer will be less than or equal to <code>2 * 10<sup>9</sup></code>.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> m = 3, n = 7
<strong>Output:</strong> 28
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> m = 3, n = 2
<strong>Output:</strong> 3
<strong>Explanation:</strong> From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
1. Right -> Down -> Down
2. Down -> Down -> Right
3. Down -> Right -> Down
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li><code>1 <= m, n <= 100</code></li>
</ul>
