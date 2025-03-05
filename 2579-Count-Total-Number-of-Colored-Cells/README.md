<h2><a href="https://leetcode.com/problems/count-total-number-of-colored-cells">2579. Count Total Number of Colored Cells</a></h2>
<h3>Medium</h3>
<hr>
<p>There exists an infinitely large two-dimensional grid of uncolored unit cells. You are given a positive integer <code>n</code>, indicating that you must do the following routine for <code>n</code> minutes:</p>
<ul>
  <li>At the first minute, color any arbitrary unit cell blue.</li>
  <li>Every minute thereafter, color blue every uncolored cell that touches a blue cell.</li>
</ul>
<p>Return the number of colored cells at the end of <code>n</code> minutes.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> n = 1
<strong>Output:</strong> 1
<strong>Explanation:</strong> After 1 minute, there is only 1 blue cell, so we return 1.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> n = 2
<strong>Output:</strong> 5
<strong>Explanation:</strong> After 2 minutes, there are 4 colored cells on the boundary and 1 in the center, so we return 5.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>1 <= <code>n</code> <= 10<sup>5</sup></li>
</ul>
