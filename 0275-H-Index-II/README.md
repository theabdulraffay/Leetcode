<h2><a href="https://leetcode.com/problems/h-index-ii">275. H-Index II</a></h2>
<h3>Solved</h3>
<hr>
<p>Medium</p>
<p>Topics: </p>
<p>Companies: </p>
<p>Hint: </p>
<p>Given an array of integers <code>citations</code> where <code>citations[i]</code> is the number of citations a researcher received for their <code>i</code>th paper and <code>citations</code> is sorted in ascending order, return the researcher's h-index.</p>

<p>According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of <code>h</code> such that the given researcher has published at least <code>h</code> papers that have each been cited at least <code>h</code> times.</p>

<p>You must write an algorithm that runs in logarithmic time.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> citations = [0,1,3,5,6]
<strong>Output:</strong> 3
<strong>Explanation:</strong> [0,1,3,5,6] means the researcher has 5 papers in total and each of them had received 0, 1, 3, 5, 6 citations respectively.
Since the researcher has 3 papers with at least 3 citations each and the remaining two with no more than 3 citations each, their h-index is 3.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> citations = [1,2,100]
<strong>Output:</strong> 2
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>n == citations.length</code></li>
  <li><code>1 <= n <= 10^5</code></li>
  <li><code>0 <= citations[i] <= 1000</code></li>
  <li><code>citations</code> is sorted in ascending order.</li>
</ul>
