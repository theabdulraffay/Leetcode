<h2><a href="https://leetcode.com/problems/sort-the-people">2418. Sort the People</a></h2>
<h3>Easy</h3>
<hr>
<p>You are given an array of strings <code>names</code>, and an array <code>heights</code> that consists of distinct positive integers. Both arrays are of length <code>n</code>.</p>
<p>For each index <code>i</code>, <code>names[i]</code> and <code>heights[i]</code> denote the name and height of the <code>i<sup>th</sup></code> person.</p>
<p>Return <code>names</code> sorted in descending order by the people's heights.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> names = ["Mary","John","Emma"], heights = [180,165,170]
<strong>Output:</strong> ["Mary","Emma","John"]
<strong>Explanation:</strong> Mary is the tallest, followed by Emma and John.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> names = ["Alice","Bob","Bob"], heights = [155,185,150]
<strong>Output:</strong> ["Bob","Alice","Bob"]
<strong>Explanation:</strong> The first Bob is the tallest, followed by Alice and the second Bob.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li><code>n == names.length == heights.length</code></li>
<li>1 ≤ <code>n</code> ≤ 10<sup>3</sup></li>
<li>1 ≤ <code>names[i].length</code> ≤ 20</li>
<li>1 ≤ <code>heights[i]</code> ≤ 10<sup>5</sup></li>
<li><code>names[i]</code> consists of lower and upper case English letters.</li>
<li>All the values of <code>heights</code> are distinct.</li>
</ul>
