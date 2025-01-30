<h2><a href="https://leetcode.com/problems/divide-nodes-into-the-maximum-number-of-groups">2493. Divide Nodes Into the Maximum Number of Groups</a></h2>
<h3>Hard</h3>
<hr>
<p>You are given a positive integer <code>n</code> representing the number of nodes in an undirected graph. The nodes are labeled from 1 to <code>n</code>.</p>
<p>You are also given a 2D integer array <code>edges</code>, where <code>edges[i] = [ai, bi]</code> indicates that there is a bidirectional edge between nodes <code>ai</code> and <code>bi</code>. Notice that the given graph may be disconnected.</p>
<p>Divide the nodes of the graph into <code>m</code> groups (1-indexed) such that:</p>
<ul>
  <li>Each node in the graph belongs to exactly one group.</li>
  <li>For every pair of nodes in the graph that are connected by an edge <code>[ai, bi]</code>, if <code>ai</code> belongs to the group with index <code>x</code>, and <code>bi</code> belongs to the group with index <code>y</code>, then <code>|y - x| = 1</code>.</li>
</ul>
<p>Return the maximum number of groups (i.e., maximum <code>m</code>) into which you can divide the nodes. Return <code>-1</code> if it is impossible to group the nodes with the given conditions.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> n = 6, edges = [[1,2],[1,4],[1,5],[2,6],[2,3],[4,6]]
<strong>Output:</strong> 4
<strong>Explanation:</strong> As shown in the image we:
- Add node 5 to the first group.
- Add node 1 to the second group.
- Add nodes 2 and 4 to the third group.
- Add nodes 3 and 6 to the fourth group.
We can see that every edge is satisfied.
It can be shown that that if we create a fifth group and move any node from the third or fourth group to it, at least one of the edges will not be satisfied.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> n = 3, edges = [[1,2],[2,3],[3,1]]
<strong>Output:</strong> -1
<strong>Explanation:</strong> If we add node 1 to the first group, node 2 to the second group, and node 3 to the third group to satisfy the first two edges, we can see that the third edge will not be satisfied.
It can be shown that no grouping is possible.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 <= n <= 500</code></li>
  <li><code>1 <= edges.length <= 104</code></li>
  <li><code>edges[i].length == 2</code></li>
  <li><code>1 <= ai, bi <= n</code></li>
  <li><code>ai != bi</code></li>
  <li>There is at most one edge between any pair of vertices.</li>
</ul>
