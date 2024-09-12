<h2><a href="https://leetcode.com/problems/alternating-groups-ii">3208. Alternating Groups II</a></h2>
<h3>Medium</h3>
<hr>
<p>There is a circle of red and blue tiles. You are given an array of integers <code>colors</code> and an integer <code>k</code>. The color of tile <code>i</code> is represented by <code>colors[i]</code>:</p>
<ul>
    <li><code>colors[i] == 0</code> means that tile <code>i</code> is red.</li>
    <li><code>colors[i] == 1</code> means that tile <code>i</code> is blue.</li>
</ul>
<p>An alternating group is every <code>k</code> contiguous tiles in the circle with alternating colors (each tile in the group except the first and last one has a different color from its left and right tiles).</p>
<p>Return the number of alternating groups.</p>

<p>Note that since <code>colors</code> represents a circle, the first and the last tiles are considered to be next to each other.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> colors = [0,1,0,1,0], k = 3
<strong>Output:</strong> 3
<strong>Explanation:</strong>
The alternating groups are: [0,1,0], [1,0,1], [0,1,0].
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> colors = [0,1,0,0,1,0,1], k = 6
<strong>Output:</strong> 2
<strong>Explanation:</strong>
The alternating groups are: [0,1,0,0,1,0] and [1,0,0,1,0,1].
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> colors = [1,1,0,1], k = 4
<strong>Output:</strong> 0
<strong>Explanation:</strong>
There are no alternating groups in this case.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
    <li><code>3 <= colors.length <= 10<sup>5</sup></code></li>
    <li><code>0 <= colors[i] <= 1</code></li>
    <li><code>3 <= k <= colors.length</code></li>
</ul>
