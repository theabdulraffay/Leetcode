<h2><a href="https://leetcode.com/problems/grid-game">2017. Grid Game</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a <strong>0-indexed</strong> 2D array <code>grid</code> of size <code>2 x n</code>, where <code>grid[r][c]</code> represents the number of points at position <code>(r, c)</code> on the matrix. Two robots are playing a game on this matrix.</p>
<p>Both robots initially start at <code>(0, 0)</code> and want to reach <code>(1, n-1)</code>. Each robot may only move to the <strong>right</strong> (<code>(r, c)</code> to <code>(r, c + 1)</code>) or <strong>down</strong> (<code>(r, c)</code> to <code>(r + 1, c)</code>).</p>
<p>At the start of the game, the <strong>first</strong> robot moves from <code>(0, 0)</code> to <code>(1, n-1)</code>, collecting all the points from the cells on its path. For all cells <code>(r, c)</code> traversed on the path, <code>grid[r][c]</code> is set to <code>0</code>. Then, the <strong>second</strong> robot moves from <code>(0, 0)</code> to <code>(1, n-1)</code>, collecting the points on its path. Note that their paths may intersect with one another.</p>
<p>The <strong>first</strong> robot wants to <strong>minimize</strong> the number of points collected by the <strong>second</strong> robot. In contrast, the <strong>second</strong> robot wants to <strong>maximize</strong> the number of points it collects. If both robots play <strong>optimally</strong>, return <em>the <strong>number of points</strong> collected by the <strong>second</strong> robot</em>.</p>

<p><strong>Example 1:</strong></p>
<img src="/api/placeholder/400/320" alt="Example 1 illustration showing the paths of both robots">
<pre>
<strong>Input:</strong> grid = [[2,5,4],[1,5,1]]
<strong>Output:</strong> 4
<strong>Explanation:</strong> The optimal path taken by the first robot is shown in red, and the optimal path taken by the second robot is shown in blue.
The cells visited by the first robot are set to 0.
The second robot will collect 0 + 0 + 4 + 0 = 4 points.
</pre>

<p><strong>Example 2:</strong></p>
<img src="/api/placeholder/400/320" alt="Example 2 illustration showing the paths of both robots">
<pre>
<strong>Input:</strong> grid = [[3,3,1],[8,5,2]]
<strong>Output:</strong> 4
<strong>Explanation:</strong> The optimal path taken by the first robot is shown in red, and the optimal path taken by the second robot is shown in blue.
The cells visited by the first robot are set to 0.
The second robot will collect 0 + 3 + 1 + 0 = 4 points.
</pre>

<p><strong>Example 3:</strong></p>
<img src="/api/placeholder/400/320" alt="Example 3 illustration showing the paths of both robots">
<pre>
<strong>Input:</strong> grid = [[1,3,1,15],[1,3,3,1]]
<strong>Output:</strong> 7
<strong>Explanation:</strong> The optimal path taken by the first robot is shown in red, and the optimal path taken by the second robot is shown in blue.
The cells visited by the first robot are set to 0.
The second robot will collect 0 + 1 + 3 + 3 + 0 = 7 points.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
    <li><code>grid.length == 2</code></li>
    <li><code>n == grid[r].length</code></li>
    <li>1 ≤ <code>n</code> ≤ 5 * 10<sup>4</sup></li>
    <li>1 ≤ <code>grid[r][c]</code> ≤ 10<sup>5</sup></li>
</ul>
