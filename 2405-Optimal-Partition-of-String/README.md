<h2><a href="https://leetcode.com/problems/optimal-partition-of-string">2405. Optimal Partition of String</a></h2>
<h3>Medium</h3>
<hr>
<p>Given a string <code>s</code>, partition the string into one or more substrings such that the characters in each substring are unique. That is, no letter appears in a single substring more than once.</p>
<p>Return the minimum number of substrings in such a partition.</p>
<p>Note that each character should belong to exactly one substring in a partition.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> s = "abacaba"
<strong>Output:</strong> 4
<strong>Explanation:</strong>
Two possible partitions are ("a","ba","cab","a") and ("ab","a","ca","ba").
It can be shown that 4 is the minimum number of substrings needed.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> s = "ssssss"
<strong>Output:</strong> 6
<strong>Explanation:</strong>
The only valid partition is ("s","s","s","s","s","s").
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ <code>s.length</code> ≤ 10<sup>5</sup></li>
<li><code>s</code> consists of only English lowercase letters.</li>
</ul>
