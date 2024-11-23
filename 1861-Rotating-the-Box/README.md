<h2><a href="https://leetcode.com/problems/rotating-the-box">1861. Rotating the Box</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given an <code>m x n</code> matrix of characters <code>box</code> representing a side-view of a box. Each cell of the box is one of the following:</p>
<ul>
<li>A stone <code>'#'</code></li>
<li>A stationary obstacle <code>'*'</code></li>
<li>Empty <code>'.'</code></li>
</ul>
<p>The box is rotated 90 degrees clockwise, causing some of the stones to fall due to gravity. Each stone falls down until it lands on an obstacle, another stone, or the bottom of the box. Gravity does not affect the obstacles' positions, and the inertia from the box's rotation does not affect the stones' horizontal positions.</p>

<p>It is guaranteed that each stone in <code>box</code> rests on an obstacle, another stone, or the bottom of the box.</p>

<p>Return an <code>n x m</code> matrix representing the box after the rotation described above.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> box = [["#",".","#"]]
<strong>Output:</strong> [["."],
         ["#"],
         ["#"]]
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> box = [["#",".","*","."],
              ["#","#","*","."]]
<strong>Output:</strong> [["#","."],
         ["#","#"],
         ["*","*"],
         [".","."]]
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> box = [["#","#","*",".","*","."],
              ["#","#","#","*",".","."],
              ["#","#","#",".","#","."]]
<strong>Output:</strong> [[".","#","#"],
         [".","#","#"],
         ["#","#","*"],
         ["#","*","."],
         ["#",".","*"],
         ["#",".","."]]
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li><code>m == box.length</code></li>
<li><code>n == box[i].length</code></li>
<li><code>1 <= m, n <= 500</code></li>
<li><code>box[i][j]</code> is either <code>'#'</code>, <code>'*'</code>, or <code>'.'</code>.</li>
</ul>
