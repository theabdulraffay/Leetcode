<h2><a href="https://leetcode.com/problems/count-good-numbers">1922. Count Good Numbers</a></h2>
<h3>Medium</h3>
<hr>
<p>A digit string is good if the digits (0-indexed) at even indices are even and the digits at odd indices are prime (2, 3, 5, or 7).</p>
<p>For example, "2582" is good because the digits (2 and 8) at even positions are even and the digits (5 and 2) at odd positions are prime. However, "3245" is not good because 3 is at an even index but is not even.</p>
<p>Given an integer <em>n</em>, return the total number of good digit strings of length <em>n</em>. Since the answer may be large, return it modulo 10<sup>9</sup> + 7.</p>
<p>A digit string is a string consisting of digits 0 through 9 that may contain leading zeros.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> n = 1
<strong>Output:</strong> 5
<strong>Explanation:</strong> The good numbers of length 1 are "0", "2", "4", "6", "8".
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> n = 4
<strong>Output:</strong> 400
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> n = 50
<strong>Output:</strong> 564908303
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>1 &lt;= n &lt;= 10<sup>15</sup></li>
</ul>
