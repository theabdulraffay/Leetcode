<h2><a href="https://leetcode.com/problems/maximum-number-of-points-from-grid-queries">2503. Maximum Number of Points From Grid Queries</a></h2>
<h3>Hard</h3>
<hr>
<p>You are given an <code>m x n</code> integer matrix <code>grid</code> and an array <code>queries</code> of size <code>k</code>.</p>
<p>Find an array <code>answer</code> of size <code>k</code> such that for each integer <code>queries[i]</code> you start in the top left cell of the matrix and repeat the following process:</p>
<ul>
  <li>If <code>queries[i]</code> is strictly greater than the value of the current cell that you are in, then you get one point if it is your first time visiting this cell, and you can move to any adjacent cell in all 4 directions: up, down, left, and right.</li>
  <li>Otherwise, you do not get any points, and you end this process.</li>
</ul>
<p>After the process, <code>answer[i]</code> is the maximum number of points you can get. Note that for each query you are allowed to visit the same cell multiple times.</p>
<p>Return the resulting array <code>answer</code>.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> grid = [[1,2,3],[2,5,7],[3,5,1]], queries = [5,6,2]
<strong>Output:</strong> [5,8,1]
<strong>Explanation:</strong> The diagrams above show which cells we visit to get points for each query.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> grid = [[5,2,1],[1,1,2]], queries = [3]
<strong>Output:</strong> [0]
<strong>Explanation:</strong> We can not get any points because the value of the top left cell is already greater than or equal to 3.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li><code>m == grid.length</code></li>
  <li><code>n == grid[i].length</code></li>
  <li>2 <= <code>m, n</code> <= 1000</li>
  <li>4 <= <code>m * n</code> <= 10<sup>5</sup></li>
  <li><code>k == queries.length</code></li>
  <li>1 <= <code>k</code> <= 10<sup>4</sup></li>
  <li>1 <= <code>grid[i][j], queries[i]</code> <= 10<sup>6</sup></li>
</ul>
