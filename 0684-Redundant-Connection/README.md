<h2><a href="https://leetcode.com/problems/redundant-connection">684. Redundant Connection</a></h2>
<h3>Medium</h3>
<hr>
<p>In this problem, a tree is an undirected graph that is connected and has no cycles.</p>
<p>You are given a graph that started as a tree with <code>n</code> nodes labeled from 1 to <code>n</code>, with one additional edge added. The added edge has two different vertices chosen from 1 to <code>n</code>, and was not an edge that already existed. The graph is represented as an array <code>edges</code> of length <code>n</code> where <code>edges[i] = [ai, bi]</code> indicates that there is an edge between nodes <code>ai</code> and <code>bi</code> in the graph.</p>
<p>Return an edge that can be removed so that the resulting graph is a tree of <code>n</code> nodes. If there are multiple answers, return the answer that occurs last in the input.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> edges = [[1,2],[1,3],[2,3]]
<strong>Output:</strong> [2,3]
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> edges = [[1,2],[2,3],[3,4],[1,4],[1,5]]
<strong>Output:</strong> [1,4]
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li><code>n == edges.length</code></li>
  <li><code>3 <= n <= 1000</code></li>
  <li><code>edges[i].length == 2</code></li>
  <li><code>1 <= ai < bi <= edges.length</code></li>
  <li><code>ai != bi</code></li>
  <li>There are no repeated edges.</li>
  <li>The given graph is connected.</li>
</ul>
