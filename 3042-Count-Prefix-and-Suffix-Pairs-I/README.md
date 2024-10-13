<h2><a href="https://leetcode.com/problems/count-prefix-and-suffix-pairs-i">3042. Count Prefix and Suffix Pairs I</a></h2>
<h3>Easy</h3>
<hr>
<p>You are given a 0-indexed string array <code>words</code>.</p>

<p>Let's define a boolean function <code>isPrefixAndSuffix</code> that takes two strings, <code>str1</code> and <code>str2</code>:</p>

<ul>
<li><code>isPrefixAndSuffix(str1, str2)</code> returns <code>true</code> if <code>str1</code> is both a prefix and a suffix of <code>str2</code>, and <code>false</code> otherwise.</li>
</ul>

<p>For example, <code>isPrefixAndSuffix("aba", "ababa")</code> is <code>true</code> because "aba" is a prefix of "ababa" and also a suffix, but <code>isPrefixAndSuffix("abc", "abcd")</code> is <code>false</code>.</p>

<p>Return an integer denoting the number of index pairs <code>(i, j)</code> such that <code>i &lt; j</code>, and <code>isPrefixAndSuffix(words[i], words[j])</code> is true.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> words = ["a","aba","ababa","aa"]
<strong>Output:</strong> 4
<strong>Explanation:</strong> In this example, the counted index pairs are:
i = 0 and j = 1 because isPrefixAndSuffix("a", "aba") is true.
i = 0 and j = 2 because isPrefixAndSuffix("a", "ababa") is true.
i = 0 and j = 3 because isPrefixAndSuffix("a", "aa") is true.
i = 1 and j = 2 because isPrefixAndSuffix("aba", "ababa") is true.
Therefore, the answer is 4.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> words = ["pa","papa","ma","mama"]
<strong>Output:</strong> 2
<strong>Explanation:</strong> In this example, the counted index pairs are:
i = 0 and j = 1 because isPrefixAndSuffix("pa", "papa") is true.
i = 2 and j = 3 because isPrefixAndSuffix("ma", "mama") is true.
Therefore, the answer is 2.
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> words = ["abab","ab"]
<strong>Output:</strong> 0
<strong>Explanation:</strong> In this example, the only valid index pair is i = 0 and j = 1, and isPrefixAndSuffix("abab", "ab") is false.
Therefore, the answer is 0.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li><code>1 &lt;= words.length &lt;= 50</code></li>
<li><code>1 &lt;= words[i].length &lt;= 10</code></li>
<li><code>words[i]</code> consists only of lowercase English letters.</li>
</ul>
