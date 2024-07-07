<h2><a href="https://leetcode.com/problems/isomorphic-strings">205. Isomorphic Strings</a></h2>
<h3>Easy</h3>
<hr>
<p>Given two strings <code>s</code> and <code>t</code>, determine if they are isomorphic.</p>
<p>Two strings <code>s</code> and <code>t</code> are isomorphic if the characters in <code>s</code> can be replaced to get <code>t</code>.</p>
<p>All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> s = "egg", t = "add"
<strong>Output:</strong> true
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> s = "foo", t = "bar"
<strong>Output:</strong> false
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> s = "paper", t = "title"
<strong>Output:</strong> true
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ <code>s.length</code> ≤ 5 * 10<sup>4</sup></li>
<li><code>t.length == s.length</code></li>
<li><code>s</code> and <code>t</code> consist of any valid ASCII character.</li>
</ul>
