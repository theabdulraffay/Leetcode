<h2><a href="https://leetcode.com/problems/counting-words-with-a-given-prefix">2185. Counting Words With a Given Prefix</a></h2>
<h3>Easy</h3>
<hr>
<p>You are given an array of strings <code>words</code> and a string <code>pref</code>.</p>
<p>Return the number of strings in <code>words</code> that contain <code>pref</code> as a prefix.</p>
<p>A prefix of a string <code>s</code> is any leading contiguous substring of <code>s</code>.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> words = ["pay","attention","practice","attend"], pref = "at"
<strong>Output:</strong> 2
<strong>Explanation:</strong> The 2 strings that contain "at" as a prefix are: "attention" and "attend".
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> words = ["leetcode","win","loops","success"], pref = "code"
<strong>Output:</strong> 0
<strong>Explanation:</strong> There are no strings that contain "code" as a prefix.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li><code>1 &lt;= words.length &lt;= 100</code></li>
<li><code>1 &lt;= words[i].length, pref.length &lt;= 100</code></li>
<li><code>words[i]</code> and <code>pref</code> consist of lowercase English letters.</li>
</ul>
