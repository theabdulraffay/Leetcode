<h2><a href="https://leetcode.com/problems/minimum-cost-walk-in-weighted-graph">3108. Minimum Cost Walk in Weighted Graph</a></h2>
<h3>Hard</h3>
<hr>
<p>There is an undirected weighted graph with <code>n</code> vertices labeled from 0 to <code>n - 1</code>.</p>
<p>You are given the integer <code>n</code> and an array <code>edges</code>, where <code>edges[i] = [ui, vi, wi]</code> indicates that there is an edge between vertices <code>ui</code> and <code>vi</code> with a weight of <code>wi</code>.</p>
<p>A walk on a graph is a sequence of vertices and edges. The walk starts and ends with a vertex, and each edge connects the vertex that comes before it and the vertex that comes after it. It's important to note that a walk may visit the same edge or vertex more than once.</p>
<p>The cost of a walk starting at node <code>u</code> and ending at node <code>v</code> is defined as the bitwise AND of the weights of the edges traversed during the walk. In other words, if the sequence of edge weights encountered during the walk is <code>w0, w1, w2, ..., wk</code>, then the cost is calculated as <code>w0 & w1 & w2 & ... & wk</code>, where <code>&</code> denotes the bitwise AND operator.</p>
<p>You are also given a 2D array <code>query</code>, where <code>query[i] = [si, ti]</code>. For each query, you need to find the minimum cost of the walk starting at vertex <code>si</code> and ending at vertex <code>ti</code>. If there exists no such walk, the answer is <code>-1</code>.</p>
<p>Return the array <code>answer</code>, where <code>answer[i]</code> denotes the minimum cost of a walk for query <code>i</code>.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> n = 5, edges = [[0,1,7],[1,3,7],[1,2,1]], query = [[0,3],[3,4]]
<strong>Output:</strong> [1,-1]
<strong>Explanation:</strong>
To achieve the cost of 1 in the first query, we need to move on the following edges: 0->1 (weight 7), 1->2 (weight 1), 2->1 (weight 1), 1->3 (weight 7).
In the second query, there is no walk between nodes 3 and 4, so the answer is -1.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> n = 3, edges = [[0,2,7],[0,1,15],[1,2,6],[1,2,1]], query = [[1,2]]
<strong>Output:</strong> [0]
<strong>Explanation:</strong>
To achieve the cost of 0 in the first query, we need to move on the following edges: 1->2 (weight 1), 2->1 (weight 6), 1->2 (weight 1).
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>2 <= <code>n</code> <= 10<sup>5</sup></li>
  <li>0 <= <code>edges.length</code> <= 10<sup>5</sup></li>
  <li><code>edges[i].length == 3</code></li>
  <li>0 <= <code>ui, vi</code> <= <code>n - 1</code></li>
  <li><code>ui != vi</code></li>
  <li>0 <= <code>wi</code> <= 10<sup>5</sup></li>
  <li>1 <= <code>query.length</code> <= 10<sup>5</sup></li>
  <li><code>query[i].length == 2</code></li>
  <li>0 <= <code>si, ti</code> <= <code>n - 1</code></li>
  <li><code>si != ti</code></li>
</ul>
