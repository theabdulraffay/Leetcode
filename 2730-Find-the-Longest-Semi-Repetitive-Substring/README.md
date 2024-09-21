<h2><a href="https://leetcode.com/problems/find-the-longest-semi-repetitive-substring">2730. Find the Longest Semi-Repetitive Substring</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a digit string <code>s</code> that consists of digits from 0 to 9.</p>

<p>A string is called semi-repetitive if there is at most one adjacent pair of the same digit. For example, <code>"0010"</code>, <code>"002020"</code>, <code>"0123"</code>, <code>"2002"</code>, and <code>"54944"</code> are semi-repetitive, while the following are not: <code>"00101022"</code> (adjacent same digit pairs are 00 and 22), and <code>"1101234883"</code> (adjacent same digit pairs are 11 and 88).</p>

<p>Return the length of the longest semi-repetitive substring of <code>s</code>.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> s = "52233"
<strong>Output:</strong> 4
<strong>Explanation:</strong> 
The longest semi-repetitive substring is "5223". Picking the whole string "52233" has two adjacent same digit pairs 22 and 33, but at most one is allowed.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> s = "5494"
<strong>Output:</strong> 4
<strong>Explanation:</strong> 
s is a semi-repetitive string.
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> s = "1111111"
<strong>Output:</strong> 2
<strong>Explanation:</strong> 
The longest semi-repetitive substring is "11". Picking the substring "111" has two adjacent same digit pairs, but at most one is allowed.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
    <li><code>1 <= s.length <= 50</code></li>
    <li><code>'0' <= s[i] <= '9'</code></li>
</ul>
