<h2><a href="https://leetcode.com/problems/check-if-grid-can-be-cut-into-sections">3394. Check if Grid can be Cut into Sections</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given an integer <code>n</code> representing the dimensions of an <code>n x n</code> grid, with the origin at the bottom-left corner of the grid. You are also given a 2D array of coordinates <code>rectangles</code>, where <code>rectangles[i]</code> is in the form <code>[startx, starty, endx, endy]</code>, representing a rectangle on the grid. Each rectangle is defined as follows:</p>
<ul>
  <li><code>(startx, starty)</code>: The bottom-left corner of the rectangle.</li>
  <li><code>(endx, endy)</code>: The top-right corner of the rectangle.</li>
</ul>
<p>Note that the rectangles do not overlap. Your task is to determine if it is possible to make either two horizontal or two vertical cuts on the grid such that:</p>
<ul>
  <li>Each of the three resulting sections formed by the cuts contains at least one rectangle.</li>
  <li>Every rectangle belongs to exactly one section.</li>
</ul>
<p>Return <code>true</code> if such cuts can be made; otherwise, return <code>false</code>.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> n = 5, rectangles = [[1,0,5,2],[0,2,2,4],[3,2,5,3],[0,4,4,5]]
<strong>Output:</strong> true
<strong>Explanation:</strong>
We can make horizontal cuts at y = 2 and y = 4. Hence, output is true.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> n = 4, rectangles = [[0,0,1,1],[2,0,3,4],[0,2,2,3],[3,0,4,3]]
<strong>Output:</strong> true
<strong>Explanation:</strong>
We can make vertical cuts at x = 2 and x = 3. Hence, output is true.
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> n = 4, rectangles = [[0,2,2,4],[1,0,3,2],[2,2,3,4],[3,0,4,2],[3,2,4,4]]
<strong>Output:</strong> false
<strong>Explanation:</strong>
We cannot make two horizontal or two vertical cuts that satisfy the conditions. Hence, output is false.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>3 <= <code>n</code> <= 10<sup>9</sup></li>
  <li>3 <= <code>rectangles.length</code> <= 10<sup>5</sup></li>
  <li>0 <= <code>rectangles[i][0]</code> < <code>rectangles[i][2]</code> <= <code>n</code></li>
  <li>0 <= <code>rectangles[i][1]</code> < <code>rectangles[i][3]</code> <= <code>n</code></li>
  <li>No two rectangles overlap.</li>
</ul>
