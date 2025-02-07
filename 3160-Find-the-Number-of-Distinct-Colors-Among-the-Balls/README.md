<h2><a href="https://leetcode.com/problems/find-the-number-of-distinct-colors-among-the-balls">3160. Find the Number of Distinct Colors Among the Balls</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given an integer <code>limit</code> and a 2D array <code>queries</code> of size <code>n x 2</code>.</p>
<p>There are <code>limit + 1</code> balls with distinct labels in the range <code>[0, limit]</code>. Initially, all balls are uncolored. For every query in <code>queries</code> that is of the form <code>[x, y]</code>, you mark ball <code>x</code> with the color <code>y</code>. After each query, you need to find the number of distinct colors among the balls.</p>
<p>Return an array <code>result</code> of length <code>n</code>, where <code>result[i]</code> denotes the number of distinct colors after the <code>i-th</code> query.</p>
<p><strong>Note:</strong> When answering a query, lack of a color will not be considered as a color.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> limit = 4, queries = [[1,4],[2,5],[1,3],[3,4]]
<strong>Output:</strong> [1,2,2,3]
<strong>Explanation:</strong>
- After query 0, ball 1 has color 4.
- After query 1, ball 1 has color 4, and ball 2 has color 5.
- After query 2, ball 1 has color 3, and ball 2 has color 5.
- After query 3, ball 1 has color 3, ball 2 has color 5, and ball 3 has color 4.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> limit = 4, queries = [[0,1],[1,2],[2,2],[3,4],[4,5]]
<strong>Output:</strong> [1,2,2,3,4]
<strong>Explanation:</strong>
- After query 0, ball 0 has color 1.
- After query 1, ball 0 has color 1, and ball 1 has color 2.
- After query 2, ball 0 has color 1, and balls 1 and 2 have color 2.
- After query 3, ball 0 has color 1, balls 1 and 2 have color 2, and ball 3 has color 4.
- After query 4, ball 0 has color 1, balls 1 and 2 have color 2, ball 3 has color 4, and ball 4 has color 5.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>1 <= <code>limit</code> <= 10<sup>9</sup></li>
  <li>1 <= <code>n == queries.length</code> <= 10<sup>5</sup></li>
  <li><code>queries[i].length == 2</code></li>
  <li>0 <= <code>queries[i][0]</code> <= <code>limit</code></li>
  <li>1 <= <code>queries[i][1]</code> <= 10<sup>9</sup></li>
</ul>
