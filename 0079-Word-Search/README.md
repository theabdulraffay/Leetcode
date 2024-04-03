<h2><a href="https://leetcode.com/problems/word-search">79. Word Search</a></h2>
<h3>Medium</h3>
<hr>
<p>Given an <em>m x n</em> grid of characters <em>board</em> and a string <em>word</em>, return true if <em>word</em> exists in the grid.</p>
<p>The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
<strong>Output:</strong> true
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
<strong>Output:</strong> true
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
<strong>Output:</strong> false
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li><em>m == board.length</em></li>
<li><em>n = board[i].length</em></li>
<li>1 ≤ <em>m</em>, <em>n</em> ≤ 6</li>
<li>1 ≤ <em>word.length</em> ≤ 15</li>
<li><em>board</em> and <em>word</em> consist of only lowercase and uppercase English letters.</li>
</ul>
<p><strong>Follow up:</strong> Could you use search pruning to make your solution faster with a larger board?</p>
