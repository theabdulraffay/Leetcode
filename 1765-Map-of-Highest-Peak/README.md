<h2><a href="https://leetcode.com/problems/map-of-highest-peak">1765. Map of Highest Peak</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given an integer matrix <code>isWater</code> of size <code>m x n</code> that represents a map of <strong>land</strong> and <strong>water</strong> cells.</p>
<ul>
  <li>If <code>isWater[i][j] == 0</code>, cell <code>(i, j)</code> is a <strong>land</strong> cell.</li>
  <li>If <code>isWater[i][j] == 1</code>, cell <code>(i, j)</code> is a <strong>water</strong> cell.</li>
</ul>

<p>You must assign each cell a height in a way that follows these rules:</p>
<ul>
  <li>The height of each cell must be non-negative.</li>
  <li>If the cell is a <strong>water</strong> cell, its height must be <code>0</code>.</li>
  <li>Any two adjacent cells must have an absolute height difference of <strong>at most</strong> <code>1</code>. A cell is adjacent to another cell if the former is directly north, east, south, or west of the latter (i.e., their sides are touching).</li>
</ul>

<p>Find an assignment of heights such that the maximum height in the matrix is <strong>maximized</strong>.</p>
<p>Return <em>an integer matrix </em><code>height</code><em> of size </em><code>m x n</code><em> where </em><code>height[i][j]</code><em> is cell </em><code>(i, j)</code><em>'s height. If there are multiple solutions, return <strong>any</strong> of them</em>.</p>

<p><strong>Example 1:</strong></p>
<img src="/api/placeholder/400/320" alt="Example 1 illustration showing water and land cells with heights">
<pre>
<strong>Input:</strong> isWater = [[0,1],[0,0]]
<strong>Output:</strong> [[1,0],[2,1]]
<strong>Explanation:</strong> The image shows the assigned heights of each cell.
The blue cell is the water cell, and the green cells are the land cells.
</pre>

<p><strong>Example 2:</strong></p>
<img src="/api/placeholder/400/320" alt="Example 2 illustration showing water and land cells with heights">
<pre>
<strong>Input:</strong> isWater = [[0,0,1],[1,0,0],[0,0,0]]
<strong>Output:</strong> [[1,1,0],[0,1,1],[1,2,2]]
<strong>Explanation:</strong> A height of 2 is the maximum possible height of any assignment.
Any height assignment that has a maximum height of 2 while still meeting the rules will also be accepted.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>m == isWater.length</code></li>
  <li><code>n == isWater[i].length</code></li>
  <li>1 ≤ <code>m, n</code> ≤ 1000</li>
  <li><code>isWater[i][j]</code> is <code>0</code> or <code>1</code>.</li>
  <li>There is at least <strong>one</strong> water cell.</li>
</ul>
