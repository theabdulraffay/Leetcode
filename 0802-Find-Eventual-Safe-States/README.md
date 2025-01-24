<h2><a href="https://leetcode.com/problems/find-eventual-safe-states/">802. Find Eventual Safe States</a></h2>
<h3>Medium</h3>
<hr>
<p>There is a directed graph of `n` nodes with each node labeled from `0` to `n - 1`. The graph is represented by a **0-indexed** 2D integer array `graph` where `graph[i]` is an integer array of nodes adjacent to node `i`, meaning there is an edge from node `i` to each node in `graph[i]`.</p>

<p>A node is a **terminal node** if there are no outgoing edges. A node is a **safe node** if every possible path starting from that node leads to a **terminal node** (or another safe node).</p>

<p>Return *an array containing all the ****safe nodes**** of the graph*. The answer should be sorted in **ascending** order.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> graph = [[1,2],[2,3],[5],[0],[5],[],[]]
<strong>Output:</strong> [2,4,5,6]
<strong>Explanation:</strong> The given graph is shown above.
Nodes 5 and 6 are terminal nodes as there are no outgoing edges from either of them.
Every path starting at nodes 2, 4, 5, and 6 all lead to either node 5 or 6.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> graph = [[1,2,3,4],[1,2],[3,4],[0,4],[]]
<strong>Output:</strong> [4]
<strong>Explanation:</strong> Only node 4 is a terminal node, and every path starting at node 4 leads to node 4.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>n == graph.length</code></li>
  <li><code>1 <= n <= 10^4</code></li>
  <li><code>0 <= graph[i].length <= n</code></li>
  <li><code>0 <= graph[i][j] <= n - 1</code></li>
  <li><code>graph[i]</code> is sorted in a strictly increasing order.</li>
  <li>The graph may contain self-loops.</li>
  <li>The number of edges in the graph will be in the range <code>[1, 4 * 10^4]</code>.</li>
</ul>
