<h2><a href="https://leetcode.com/problems/append-characters-to-string-to-make-subsequence">2486. Append Characters to String to Make Subsequence</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given two strings <code>s</code> and <code>t</code> consisting of only lowercase English letters.</p>
<p>Return the minimum number of characters that need to be appended to the end of <code>s</code> so that <code>t</code> becomes a subsequence of <code>s</code>.</p>
<p>A subsequence is a string that can be derived from another string by deleting some or no characters without changing the order of the remaining characters.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> s = "coaching", t = "coding"
<strong>Output:</strong> 4
<strong>Explanation:</strong> Append the characters "ding" to the end of s so that s = "coachingding".
Now, t is a subsequence of s ("coachingding").
It can be shown that appending any 3 characters to the end of s will never make t a subsequence.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> s = "abcde", t = "a"
<strong>Output:</strong> 0
<strong>Explanation:</strong> t is already a subsequence of s ("abcde").
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> s = "z", t = "abcde"
<strong>Output:</strong> 5
<strong>Explanation:</strong> Append the characters "abcde" to the end of s so that s = "zabcde".
Now, t is a subsequence of s ("zabcde").
It can be shown that appending any 4 characters to the end of s will never make t a subsequence.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ <code>s.length</code>, <code>t.length</code> ≤ 10<sup>5</sup></li>
<li><code>s</code> and <code>t</code> consist only of lowercase English letters.</li>
</ul>
