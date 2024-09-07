<h2><a href="https://leetcode.com/problems/replace-the-substring-for-balanced-string">1234. Replace the Substring for Balanced String</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a string <code>s</code> of length <code>n</code> containing only four kinds of characters: 'Q', 'W', 'E', and 'R'.</p>
<p>A string is said to be balanced if each of its characters appears <code>n / 4</code> times where <code>n</code> is the length of the string.</p>
<p>Return the minimum length of the substring that can be replaced with any other string of the same length to make <code>s</code> balanced. If <code>s</code> is already balanced, return <code>0</code>.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> s = "QWER"
<strong>Output:</strong> 0
<strong>Explanation:</strong> s is already balanced.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> s = "QQWE"
<strong>Output:</strong> 1
<strong>Explanation:</strong> We need to replace a 'Q' to 'R', so that "RQWE" (or "QRWE") is balanced.
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> s = "QQQW"
<strong>Output:</strong> 2
<strong>Explanation:</strong> We can replace the first "QQ" with "ER". 
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li><code>n == s.length</code></li>
<li><code>4 <= n <= 10<sup>5</sup></code></li>
<li><code>n</code> is a multiple of <code>4</code>.</li>
<li><code>s</code> contains only 'Q', 'W', 'E', and 'R'.</li>
</ul>
