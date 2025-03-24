<h2><a href="https://leetcode.com/problems/count-days-without-meetings">3169. Count Days Without Meetings</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a positive integer <code>days</code> representing the total number of days an employee is available for work (starting from day 1). You are also given a 2D array <code>meetings</code> of size <code>n</code> where <code>meetings[i] = [start_i, end_i]</code> represents the starting and ending days of meeting <code>i</code> (inclusive).</p>
<p>Return the count of days when the employee is available for work but no meetings are scheduled.</p>
<p><strong>Note:</strong> The meetings may overlap.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> days = 10, meetings = [[5,7],[1,3],[9,10]]
<strong>Output:</strong> 2
<strong>Explanation:</strong>
There is no meeting scheduled on the 4th and 8th days.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> days = 5, meetings = [[2,4],[1,3]]
<strong>Output:</strong> 1
<strong>Explanation:</strong>
There is no meeting scheduled on the 5th day.
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> days = 6, meetings = [[1,6]]
<strong>Output:</strong> 0
<strong>Explanation:</strong>
Meetings are scheduled for all working days.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 <= days <= 10<sup>9</sup></code></li>
  <li><code>1 <= meetings.length <= 10<sup>5</sup></code></li>
  <li><code>meetings[i].length == 2</code></li>
  <li><code>1 <= meetings[i][0] <= meetings[i][1] <= days</code></li>
</ul>
