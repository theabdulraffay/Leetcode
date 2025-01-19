<h2><a href="https://leetcode.com/problems/trapping-rain-water-ii">407. Trapping Rain Water II</a></h2>
<h3>Hard</h3>
<hr>
<p>Given an <code>m x n</code> integer matrix <code>heightMap</code> representing the height of each unit cell in a 2D elevation map, return <em>the volume of water it can trap after raining</em>.</p>

<p><strong>Example 1:</strong></p>
<img src="/api/placeholder/400/320" alt="Example 1 illustration showing a 3x6 grid with heights and water trapped between blocks">
<pre>
<strong>Input:</strong> heightMap = [[1,4,3,1,3,2],[3,2,1,3,2,4],[2,3,3,2,3,1]]
<strong>Output:</strong> 4
<strong>Explanation:</strong> After the rain, water is trapped between the blocks.
We have two small ponds 1 and 3 units trapped.
The total volume of water trapped is 4.
</pre>

<p><strong>Example 2:</strong></p>
<img src="/api/placeholder/400/320" alt="Example 2 illustration showing a 5x5 grid with heights and water trapped in the middle">
<pre>
<strong>Input:</strong> heightMap = [[3,3,3,3,3],[3,2,2,2,3],[3,2,1,2,3],[3,2,2,2,3],[3,3,3,3,3]]
<strong>Output:</strong> 10
</pre>

<p><strong>Constraints:</strong></p>
<ul>
    <li><code>m == heightMap.length</code></li>
    <li><code>n == heightMap[i].length</code></li>
    <li>1 ≤ <code>m, n</code> ≤ 200</li>
    <li>0 ≤ <code>heightMap[i][j]</code> ≤ 2 * 10<sup>4</sup></li>
</ul>
