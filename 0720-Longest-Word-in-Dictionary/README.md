<h2><a href="https://leetcode.com/problems/longest-word-in-dictionary">720. Longest Word in Dictionary</a></h2>
<h3>Medium</h3>
<hr>
<p>Given an array of strings <code>words</code> representing an English Dictionary, return the longest word in <code>words</code> that can be built one character at a time by other words in <code>words</code>.</p>

<p>If there is more than one possible answer, return the longest word with the smallest lexicographical order. If there is no answer, return the empty string.</p>

<p>Note that the word should be built from left to right with each additional character being added to the end of a previous word.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> words = ["w","wo","wor","worl","world"]
<strong>Output:</strong> "world"
<strong>Explanation:</strong> The word "world" can be built one character at a time by "w", "wo", "wor", and "worl".
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> words = ["a","banana","app","appl","ap","apply","apple"]
<strong>Output:</strong> "apple"
<strong>Explanation:</strong> Both "apply" and "apple" can be built from other words in the dictionary. However, "apple" is lexicographically smaller than "apply".
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 <= words.length <= 1000</code></li>
  <li><code>1 <= words[i].length <= 30</code></li>
  <li><code>words[i]</code> consists of lowercase English letters.</li>
</ul>
