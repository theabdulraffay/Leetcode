<h2><a href="https://leetcode.com/problems/reverse-string-ii">541. Reverse String II</a></h2>
<h3>Easy</h3>
<hr>
<p>Given a string <code>s</code> and an integer <code>k</code>, reverse the first <code>k</code> characters for every <code>2k</code> characters counting from the start of the string.</p>

<ul>
<li>If there are fewer than <code>k</code> characters left, reverse all of them.</li>
<li>If there are less than <code>2k</code> but greater than or equal to <code>k</code> characters, then reverse the first <code>k</code> characters and leave the rest unchanged.</li>
</ul>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> s = "abcdefg", k = 2
<strong>Output:</strong> "bacdfeg"
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> s = "abcd", k = 2
<strong>Output:</strong> "bacd"
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li><code>1 <= s.length <= 10<sup>4</sup></code></li>
<li><code>s</code> consists of only lowercase English letters.</li>
<li><code>1 <= k <= 10<sup>4</sup></code></li>
</ul>
