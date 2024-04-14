<h2><a href="https://leetcode.com/problems/daily-temperatures">739. Daily Temperatures</a></h2>
<h3>Medium</h3>
<hr>
<p>Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> temperatures = [73,74,75,71,69,72,76,73]
<strong>Output:</strong> [1,1,4,2,1,1,0,0]
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> temperatures = [30,40,50,60]
<strong>Output:</strong> [1,1,1,0]
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> temperatures = [30,60,90]
<strong>Output:</strong> [1,1,0]
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ temperatures.length ≤ 10^5</li>
<li>30 ≤ temperatures[i] ≤ 100</li>
</ul>
