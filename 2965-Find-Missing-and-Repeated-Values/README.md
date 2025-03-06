<h2><a href="https://leetcode.com/problems/find-missing-and-repeated-values">2965. Find Missing and Repeated Values</a></h2>
<h3>Easy</h3>
<hr>
<p>You are given a 0-indexed 2D integer matrix <code>grid</code> of size <code>n * n</code> with values in the range <code>[1, n^2]</code>. Each integer appears exactly once except <code>a</code> which appears twice and <code>b</code> which is missing. The task is to find the repeating and missing numbers <code>a</code> and <code>b</code>.</p>
<p>Return a 0-indexed integer array <code>ans</code> of size 2 where <code>ans[0]</code> equals to <code>a</code> and <code>ans[1]</code> equals to <code>b</code>.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> grid = [[1,3],[2,2]]
<strong>Output:</strong> [2,4]
<strong>Explanation:</strong> Number 2 is repeated and number 4 is missing so the answer is [2,4].
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> grid = [[9,1,7],[8,9,2],[3,4,6]]
<strong>Output:</strong> [9,5]
<strong>Explanation:</strong> Number 9 is repeated and number 5 is missing so the answer is [9,5].
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>2 <= <code>n</code> == <code>grid.length</code> == <code>grid[i].length</code> <= 50</li>
  <li>1 <= <code>grid[i][j]</code> <= <code>n * n</code></li>
  <li>For all <code>x</code> that <code>1 <= x <= n * n</code> there is exactly one <code>x</code> that is not equal to any of the grid members.</li>
  <li>For all <code>x</code> that <code>1 <= x <= n * n</code> there is exactly one <code>x</code> that is equal to exactly two of the grid members.</li>
  <li>For all <code>x</code> that <code>1 <= x <= n * n</code> except two of them there is exactly one pair of <code>i, j</code> that <code>0 <= i, j <= n - 1</code> and <code>grid[i][j] == x</code>.</li>
</ul>
