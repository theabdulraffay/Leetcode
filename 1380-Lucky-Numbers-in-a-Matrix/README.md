<h2><a href="https://leetcode.com/problems/lucky-numbers-in-a-matrix">1380. Lucky Numbers in a Matrix</a></h2>
<h3>Easy</h3>
<hr>
<p>Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.</p>
<p>A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> matrix = [[3,7,8],[9,11,13],[15,16,17]]
<strong>Output:</strong> [15]
<strong>Explanation:</strong> 15 is the only lucky number since it is the minimum in its row and the maximum in its column.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
<strong>Output:</strong> [12]
<strong>Explanation:</strong> 12 is the only lucky number since it is the minimum in its row and the maximum in its column.
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> matrix = [[7,8],[1,2]]
<strong>Output:</strong> [7]
<strong>Explanation:</strong> 7 is the only lucky number since it is the minimum in its row and the maximum in its column.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>m == mat.length</li>
<li>n == mat[i].length</li>
<li>1 ≤ n, m ≤ 50</li>
<li>1 ≤ matrix[i][j] ≤ 10<sup>5</sup></li>
<li>All elements in the matrix are distinct.</li>
</ul>
