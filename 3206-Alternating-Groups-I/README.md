<h2><a href="https://leetcode.com/problems/alternating-groups-i">3206. Alternating Groups I</a></h2>
<h3>Easy</h3>
<hr>
<p>There is a circle of red and blue tiles. You are given an array of integers <code>colors</code>. The color of tile <code>i</code> is represented by <code>colors[i]</code>:</p>
<ul>
<li><code>colors[i] == 0</code> means that tile <code>i</code> is red.</li>
<li><code>colors[i] == 1</code> means that tile <code>i</code> is blue.</li>
</ul>
<p>Every 3 contiguous tiles in the circle with alternating colors (the middle tile has a different color from its left and right tiles) is called an alternating group.</p>
<p>Return the number of alternating groups.</p>
<p>Note that since <code>colors</code> represents a circle, the first and the last tiles are considered to be next to each other.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> colors = [1,1,1]
<strong>Output:</strong> 0
<strong>Explanation:</strong>
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> colors = [0,1,0,0,1]
<strong>Output:</strong> 3
<strong>Explanation:</strong>
Alternating groups:
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>3 ≤ <code>colors.length</code> ≤ 100</li>
<li>0 ≤ <code>colors[i]</code> ≤ 1</li>
</ul>
