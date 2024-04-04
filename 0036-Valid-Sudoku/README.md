<h2><a href="https://leetcode.com/problems/valid-sudoku">36. Valid Sudoku</a></h2>
<h3>Medium</h3>
<hr>
<p>Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:</p>
<ol>
<li>Each row must contain the digits 1-9 without repetition.</li>
<li>Each column must contain the digits 1-9 without repetition.</li>
<li>Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.</li>
</ol>
<p><strong>Note:</strong></p>
<ul>
<li>A Sudoku board (partially filled) could be valid but is not necessarily solvable.</li>
<li>Only the filled cells need to be validated according to the mentioned rules.</li>
</ul>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> board = 
[["5","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
<strong>Output:</strong> true
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> board = 
[["8","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
<strong>Output:</strong> false
<strong>Explanation:</strong> Same as Example 1, except with the 5 in the top left corner being modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li><code>board.length == 9</code></li>
<li><code>board[i].length == 9</code></li>
<li><code>board[i][j]</code> is a digit 1-9 or '.'.</li>
</ul>
