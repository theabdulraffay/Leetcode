<h2><a href="https://leetcode.com/problems/minimum-window-substring">76. Minimum Window Substring</a></h2>
<h3>Solved</h3>
<h3>Hard</h3>
<hr>
<p>Given two strings <code>s</code> and <code>t</code> of lengths <code>m</code> and <code>n</code> respectively, return the minimum window substring of <code>s</code> such that every character in <code>t</code> (including duplicates) is included in the window. If there is no such substring, return the empty string <code>""</code>.</p>

<p>The test cases will be generated such that the answer is unique.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> s = "ADOBECODEBANC", t = "ABC"
<strong>Output:</strong> "BANC"
<strong>Explanation:</strong> The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> s = "a", t = "a"
<strong>Output:</strong> "a"
<strong>Explanation:</strong> The entire string s is the minimum window.
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> s = "a", t = "aa"
<strong>Output:</strong> ""
<strong>Explanation:</strong> Both 'a's from t must be included in the window. Since the largest window of s only has one 'a', return empty string.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>m == s.length</code></li>
  <li><code>n == t.length</code></li>
  <li>1 &le; <code>m</code>, <code>n</code> &le; 10<sup>5</sup></li>
  <li><code>s</code> and <code>t</code> consist of uppercase and lowercase English letters.</li>
</ul>

<p><strong>Follow up:</strong> Could you find an algorithm that runs in <code>O(m + n)</code> time?</p>
