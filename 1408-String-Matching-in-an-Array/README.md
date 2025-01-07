<h2><a href="https://leetcode.com/problems/string-matching-in-an-array">1408. String Matching in an Array</a></h2>
<h3>Easy</h3>
<hr>
<p>Given an array of strings <code>words</code>, return all strings in <code>words</code> that are a substring of another word. You can return the answer in any order.</p>

<p>A substring is a contiguous sequence of characters within a string.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> words = ["mass","as","hero","superhero"]
<strong>Output:</strong> ["as","hero"]
<strong>Explanation:</strong> "as" is a substring of "mass" and "hero" is a substring of "superhero".
["hero","as"] is also a valid answer.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> words = ["leetcode","et","code"]
<strong>Output:</strong> ["et","code"]
<strong>Explanation:</strong> "et" and "code" are substrings of "leetcode".
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> words = ["blue","green","bu"]
<strong>Output:</strong> []
<strong>Explanation:</strong> No string in <code>words</code> is a substring of another string.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li><code>1 <= words.length <= 100</code></li>
<li><code>1 <= words[i].length <= 30</code></li>
<li><code>words[i]</code> contains only lowercase English letters.</li>
<li>All the strings of <code>words</code> are unique.</li>
</ul>
