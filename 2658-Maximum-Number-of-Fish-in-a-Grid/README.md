<h2><a href="https://leetcode.com/problems/maximum-number-of-fish-in-a-grid">2658. Maximum Number of Fish in a Grid</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a 0-indexed 2D matrix <code>grid</code> of size <code>m x n</code>, where <code>(r, c)</code> represents:</p>
<ul>
  <li>A land cell if <code>grid[r][c] = 0</code>, or</li>
  <li>A water cell containing <code>grid[r][c]</code> fish, if <code>grid[r][c] > 0</code>.</li>
</ul>
<p>A fisher can start at any water cell <code>(r, c)</code> and can do the following operations any number of times:</p>
<ul>
  <li>Catch all the fish at cell <code>(r, c)</code>, or</li>
  <li>Move to any adjacent water cell.</li>
</ul>
<p>Return the maximum number of fish the fisher can catch if he chooses his starting cell optimally, or <code>0</code> if no water cell exists.</p>
<p>An adjacent cell of the cell <code>(r, c)</code> is one of the cells <code>(r, c + 1)</code>, <code>(r, c - 1)</code>, <code>(r + 1, c)</code>, or <code>(r - 1, c)</code> if it exists.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> grid = [[0,2,1,0],[4,0,0,3],[1,0,0,4],[0,3,2,0]]
<strong>Output:</strong> 7
<strong>Explanation:</strong> The fisher can start at cell (1,3) and collect 3 fish, then move to cell (2,3) and collect 4 fish.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> grid = [[1,0,0,0],[0,0,0,0],[0,0,0,0],[0,0,0,1]]
<strong>Output:</strong> 1
<strong>Explanation:</strong> The fisher can start at cells (0,0) or (3,3) and collect a single fish. 
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>m == grid.length</code></li>
  <li><code>n == grid[i].length</code></li>
  <li><code>1 <= m, n <= 10</code></li>
  <li><code>0 <= grid[i][j] <= 10</code></li>
</ul>
