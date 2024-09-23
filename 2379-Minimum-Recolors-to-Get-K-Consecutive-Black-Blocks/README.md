<h2><a href="https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks">2379. Minimum Recolors to Get K Consecutive Black Blocks</a></h2>
<h3>Easy</h3>
<hr>
<p>You are given a 0-indexed string <code>blocks</code> of length <code>n</code>, where <code>blocks[i]</code> is either 'W' or 'B', representing the color of the ith block. The characters 'W' and 'B' denote the colors white and black, respectively.</p>

<p>You are also given an integer <code>k</code>, which is the desired number of consecutive black blocks.</p>

<p>In one operation, you can recolor a white block such that it becomes a black block.</p>

<p>Return the minimum number of operations needed such that there is at least one occurrence of <code>k</code> consecutive black blocks.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> blocks = "WBBWWBBWBW", k = 7
<strong>Output:</strong> 3
<strong>Explanation:</strong>
One way to achieve 7 consecutive black blocks is to recolor the 0th, 3rd, and 4th blocks
so that blocks = "BBBBBBBWBW". 
It can be shown that there is no way to achieve 7 consecutive black blocks in less than 3 operations.
Therefore, we return 3.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> blocks = "WBWBBBW", k = 2
<strong>Output:</strong> 0
<strong>Explanation:</strong>
No changes need to be made, since 2 consecutive black blocks already exist.
Therefore, we return 0.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li><code>n == blocks.length</code></li>
<li><code>1 <= n <= 100</code></li>
<li><code>blocks[i]</code> is either 'W' or 'B'.</li>
<li><code>1 <= k <= n</code></li>
</ul>
