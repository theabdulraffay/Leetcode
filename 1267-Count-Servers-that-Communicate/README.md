<h2><a href="#">1267. Count Servers that Communicate</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a map of a server center, represented as a <code>m * n</code> integer matrix <code>grid</code>, where 1 means that on that cell there is a server and 0 means that it is no server. Two servers are said to communicate if they are on the same row or on the same column. Return the number of servers that communicate with any other server.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> grid = [[1,0],[0,1]]
<strong>Output:</strong> 0
<strong>Explanation:</strong> No servers can communicate with others.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> grid = [[1,0],[1,1]]
<strong>Output:</strong> 3
<strong>Explanation:</strong> All three servers can communicate with at least one other server.
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> grid = [[1,1,0,0],[0,0,1,0],[0,0,1,0],[0,0,0,1]]
<strong>Output:</strong> 4
<strong>Explanation:</strong> The two servers in the first row can communicate with each other. The two servers in the third column can communicate with each other. The server at right bottom corner can't communicate with any other server.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>m == grid.length</code></li>
  <li><code>n == grid[i].length</code></li>
  <li><code>1 <= m <= 250</code></li>
  <li><code>1 <= n <= 250</code></li>
  <li><code>grid[i][j] == 0 or 1</code></li>
</ul>
