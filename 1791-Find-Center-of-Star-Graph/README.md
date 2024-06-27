<h2><a href="https://leetcode.com/problems/find-center-of-star-graph">1791. Find Center of Star Graph</a></h2>
<h3>Easy</h3>
<hr>
<p>There is an undirected star graph consisting of <code>n</code> nodes labeled from 1 to <code>n</code>. A star graph is a graph where there is one center node and exactly <code>n - 1</code> edges that connect the center node with every other node.</p>

<p>You are given a 2D integer array <code>edges</code> where each <code>edges[i] = [u<sub>i</sub>, v<sub>i</sub>]</code> indicates that there is an edge between the nodes <code>u<sub>i</sub></code> and <code>v<sub>i</sub></code>. Return the center of the given star graph.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> edges = [[1,2],[2,3],[4,2]]
<strong>Output:</strong> 2
<strong>Explanation:</strong> As shown in the figure above, node 2 is connected to every other node, so 2 is the center.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> edges = [[1,2],[5,1],[1,3],[1,4]]
<strong>Output:</strong> 1
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>3 ≤ <code>n</code> ≤ 10<sup>5</sup></li>
<li><code>edges.length == n - 1</code></li>
<li><code>edges[i].length == 2</code></li>
<li>1 ≤ <code>u<sub>i</sub></code>, <code>v<sub>i</sub></code> ≤ <code>n</code></li>
<li><code>u<sub>i</sub> != v<sub>i</sub></code></li>
<li>The given edges represent a valid star graph.</li>
</ul>
