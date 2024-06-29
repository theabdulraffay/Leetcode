<h2><a href="https://leetcode.com/problems/h-index">274. H-Index</a></h2>
<h3>Medium</h3>
<hr>
<p>Given an array of integers <code>citations</code> where <code>citations[i]</code> is the number of citations a researcher received for their ith paper, return the researcher's h-index.</p>
<p>According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of <code>h</code> such that the given researcher has published at least <code>h</code> papers that have each been cited at least <code>h</code> times.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> citations = [3,0,6,1,5]
<strong>Output:</strong> 3
<strong>Explanation:</strong> [3,0,6,1,5] means the researcher has 5 papers in total and each of them had received 3, 0, 6, 1, 5 citations respectively.
Since the researcher has 3 papers with at least 3 citations each and the remaining two with no more than 3 citations each, their h-index is 3.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> citations = [1,3,1]
<strong>Output:</strong> 1
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li><code>n == citations.length</code></li>
<li><code>1 <= n <= 5000</code></li>
<li><code>0 <= citations[i] <= 1000</code></li>
</ul>
