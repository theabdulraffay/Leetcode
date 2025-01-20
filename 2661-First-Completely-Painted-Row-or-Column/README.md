<h2><a href="https://leetcode.com/problems/first-completely-painted-row-or-column">2661. First Completely Painted Row or Column</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a <strong>0-indexed</strong> integer array <code>arr</code>, and an <code>m x n</code> integer <strong>matrix</strong> <code>mat</code>. <code>arr</code> and <code>mat</code> both contain <strong>all</strong> the integers in the range <code>[1, m * n]</code>.</p>
<p>Go through each index <code>i</code> in <code>arr</code> starting from index <code>0</code> and paint the cell in <code>mat</code> containing the integer <code>arr[i]</code>.</p>
<p>Return <em>the smallest index</em> <code>i</code> <em>at which either a row or a column will be completely painted in</em> <code>mat</code>.</p>

<p><strong>Example 1:</strong></p>
<!-- <img src="/api/placeholder/400/320" alt="Example 1 illustration showing the painting process"> -->
<pre>
<strong>Input:</strong> arr = [1,3,4,2], mat = [[1,4],[2,3]]
<strong>Output:</strong> 2
<strong>Explanation:</strong> The moves are shown in order, and both the first row and second column of the matrix become fully painted at arr[2].
</pre>

<p><strong>Example 2:</strong></p>
<!-- <img src="/api/placeholder/400/320" alt="Example 2 illustration showing the painting process"> -->
<pre>
<strong>Input:</strong> arr = [2,8,7,4,1,3,5,6,9], mat = [[3,2,5],[1,4,6],[8,7,9]]
<strong>Output:</strong> 3
<strong>Explanation:</strong> The second column becomes fully painted at arr[3].
</pre>

<p><strong>Constraints:</strong></p>
<ul>
    <li><code>m == mat.length</code></li>
    <li><code>n = mat[i].length</code></li>
    <li><code>arr.length == m * n</code></li>
    <li>1 ≤ <code>m, n</code> ≤ 10<sup>5</sup></li>
    <li>1 ≤ <code>m * n</code> ≤ 10<sup>5</sup></li>
    <li>1 ≤ <code>arr[i], mat[r][c]</code> ≤ <code>m * n</code></li>
    <li>All the integers of <code>arr</code> are <strong>unique</strong>.</li>
    <li>All the integers of <code>mat</code> are <strong>unique</strong>.</li>
</ul>
