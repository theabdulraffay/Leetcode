<h2><a href="https://leetcode.com/problems/magic-squares-in-grid">840. Magic Squares In Grid</a></h2>
<h3>Solved</h3>
<h3>Medium</h3>
<hr>
<p>A <code>3 x 3</code> magic square is a <code>3 x 3</code> grid filled with distinct numbers from <code>1</code> to <code>9</code> such that each row, column, and both diagonals all have the same sum.</p>

<p>Given a row x col grid of integers, how many <code>3 x 3</code> contiguous magic square subgrids are there?</p>

<p><strong>Note:</strong> while a magic square can only contain numbers from <code>1</code> to <code>9</code>, grid may contain numbers up to <code>15</code>.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> grid = [[4,3,8,4],[9,5,1,9],[2,7,6,2]]
<strong>Output:</strong> 1
<strong>Explanation:</strong> 
The following subgrid is a <code>3 x 3</code> magic square:
4 3 8
9 5 1
2 7 6

while this one is not:

In total, there is only one magic square inside the given grid.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> grid = [[8]]
<strong>Output:</strong> 0
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>row == grid.length</code></li>
  <li><code>col == grid[i].length</code></li>
  <li><code>1 <= row, col <= 10</code></li>
  <li><code>0 <= grid[i][j] <= 15</code></li>
</ul>
