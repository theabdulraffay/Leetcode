<h2><a href="https://leetcode.com/problems/minimum-operations-to-make-a-uni-value-grid">2033. Minimum Operations to Make a Uni-Value Grid</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a 2D integer grid of size <code>m x n</code> and an integer <code>x</code>. In one operation, you can add <code>x</code> to or subtract <code>x</code> from any element in the grid.</p>
<p>A uni-value grid is a grid where all the elements of it are equal.</p>
<p>Return the minimum number of operations to make the grid uni-value. If it is not possible, return <code>-1</code>.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> grid = [[2,4],[6,8]], x = 2
<strong>Output:</strong> 4
<strong>Explanation:</strong> We can make every element equal to 4 by doing the following:
- Add x to 2 once.
- Subtract x from 6 once.
- Subtract x from 8 twice.
A total of 4 operations were used.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> grid = [[1,5],[2,3]], x = 1
<strong>Output:</strong> 5
<strong>Explanation:</strong> We can make every element equal to 3.
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> grid = [[1,2],[3,4]], x = 2
<strong>Output:</strong> -1
<strong>Explanation:</strong> It is impossible to make every element equal.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li><code>m == grid.length</code></li>
  <li><code>n == grid[i].length</code></li>
  <li>1 <= <code>m, n</code> <= 10<sup>5</sup></li>
  <li>1 <= <code>m * n</code> <= 10<sup>5</sup></li>
  <li>1 <= <code>x, grid[i][j]</code> <= 10<sup>4</sup></li>
</ul>
