<h2><a href="https://leetcode.com/problems/equal-row-and-column-pairs">2352. Equal Row and Column Pairs</a></h2>
<h3>Medium</h3>
<hr>
<p>Given a 0-indexed n x n integer matrix grid, return the number of pairs (ri, cj) such that row ri and column cj are equal.</p>
<p>A row and column pair is considered equal if they contain the same elements in the same order (i.e., an equal array).</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> grid = [[3,2,1],[1,7,6],[2,7,7]]
<strong>Output:</strong> 1
<strong>Explanation:</strong> There is 1 equal row and column pair:
- (Row 2, Column 1): [2,7,7]
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> grid = [[3,1,2,2],[1,4,4,5],[2,4,2,2],[2,4,2,2]]
<strong>Output:</strong> 3
<strong>Explanation:</strong> There are 3 equal row and column pairs:
- (Row 0, Column 0): [3,1,2,2]
- (Row 2, Column 2): [2,4,2,2]
- (Row 3, Column 2): [2,4,2,2]
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>n == grid.length == grid[i].length</li>
<li>1 <= n <= 200</li>
<li>1 <= grid[i][j] <= 10^5</li>
</ul>
