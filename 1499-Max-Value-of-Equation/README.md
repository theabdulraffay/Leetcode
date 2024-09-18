<h2><a href="https://leetcode.com/problems/max-value-of-equation">1499. Max Value of Equation</a></h2>
<h3>Hard</h3>
<hr>
<p>You are given an array <code>points</code> containing the coordinates of points on a 2D plane, sorted by the x-values, where <code>points[i] = [x_i, y_i]</code> such that <code>x_i < x_j</code> for all <code>1 <= i < j <= points.length</code>. You are also given an integer <code>k</code>.</p>
<p>Return the maximum value of the equation <code>y_i + y_j + |x_i - x_j|</code> where <code>|x_i - x_j| <= k</code> and <code>1 <= i < j <= points.length</code>.</p>
<p>It is guaranteed that there exists at least one pair of points that satisfy the constraint <code>|x_i - x_j| <= k</code>.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> points = [[1,3],[2,0],[5,10],[6,-10]], k = 1
<strong>Output:</strong> 4
<strong>Explanation:</strong> 
The first two points satisfy the condition |x_i - x_j| <= 1 and if we calculate the equation we get 3 + 0 + |1 - 2| = 4. 
The third and fourth points also satisfy the condition and give a value of 10 + (-10) + |5 - 6| = 1.
No other pairs satisfy the condition, so we return the max of 4 and 1.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> points = [[0,0],[3,0],[9,2]], k = 3
<strong>Output:</strong> 3
<strong>Explanation:</strong> 
Only the first two points have an absolute difference of 3 or less in the x-values, and give the value of 0 + 0 + |0 - 3| = 3.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
    <li><code>2 <= points.length <= 10<sup>5</sup></code></li>
    <li><code>points[i].length == 2</code></li>
    <li><code>-10<sup>8</sup> <= x_i, y_i <= 10<sup>8</sup></code></li>
    <li><code>0 <= k <= 2 * 10<sup>8</sup></code></li>
    <li><code>x_i < x_j</code> for all <code>1 <= i < j <= points.length</code></li>
    <li><code>x_i</code> forms a strictly increasing sequence.</li>
</ul>
