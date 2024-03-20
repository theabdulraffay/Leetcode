<h2><a href="https://leetcode.com/problems/merge-intervals/description/">56. Merge Intervals</a></h2>
<h3>Medium</h3>
<hr>
<p>Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> intervals = [[1,3],[2,6],[8,10],[15,18]]
<strong>Output:</strong> [[1,6],[8,10],[15,18]]
<strong>Explanation:</strong> Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> intervals = [[1,4],[4,5]]
<strong>Output:</strong> [[1,5]]
<strong>Explanation:</strong> Intervals [1,4] and [4,5] are considered overlapping.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>1 <= intervals.length <= 104</li>
  <li>intervals[i].length == 2</li>
  <li>0 <= starti <= endi <= 104</li>
</ul>
