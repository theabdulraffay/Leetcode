<h2><a href="https://leetcode.com/problems/count-the-number-of-complete-components">2685. Count the Number of Complete Components</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given an integer <code>n</code>. There is an undirected graph with <code>n</code> vertices, numbered from 0 to <code>n - 1</code>. You are given a 2D integer array <code>edges</code> where <code>edges[i] = [ai, bi]</code> denotes that there exists an undirected edge connecting vertices <code>ai</code> and <code>bi</code>.</p>
<p>Return the number of complete connected components of the graph.</p>
<p>A connected component is a subgraph of a graph in which there exists a path between any two vertices, and no vertex of the subgraph shares an edge with a vertex outside of the subgraph.</p>
<p>A connected component is said to be complete if there exists an edge between every pair of its vertices.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> n = 6, edges = [[0,1],[0,2],[1,2],[3,4]]
<strong>Output:</strong> 3
<strong>Explanation:</strong> From the picture above, one can see that all of the components of this graph are complete.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> n = 6, edges = [[0,1],[0,2],[1,2],[3,4],[3,5]]
<strong>Output:</strong> 1
<strong>Explanation:</strong> The component containing vertices 0, 1, and 2 is complete since there is an edge between every pair of two vertices. On the other hand, the component containing vertices 3, 4, and 5 is not complete since there is no edge between vertices 4 and 5. Thus, the number of complete components in this graph is 1.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>1 <= <code>n</code> <= 50</li>
  <li>0 <= <code>edges.length</code> <= <code>n * (n - 1) / 2</code></li>
  <li><code>edges[i].length == 2</code></li>
  <li>0 <= <code>ai, bi</code> <= <code>n - 1</code></li>
  <li><code>ai != bi</code></li>
  <li>There are no repeated edges.</li>
</ul>
