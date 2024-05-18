<h2><a href="https://leetcode.com/problems/determine-if-two-strings-are-close">1657. Determine if Two Strings Are Close</a></h2>
<h3>Medium</h3>
<hr>
<p>Two strings are considered close if you can attain one from the other using the following operations:</p>
<ul>
<li><strong>Operation 1:</strong> Swap any two existing characters.<br>
For example, <code>abcde</code> -> <code>aecdb</code></li>
<li><strong>Operation 2:</strong> Transform every occurrence of one existing character into another existing character, and do the same with the other character.<br>
For example, <code>aacabb</code> -> <code>bbcbaa</code> (all a's turn into b's, and all b's turn into a's)</li>
</ul>
<p>You can use the operations on either string as many times as necessary.</p>
<p>Given two strings, <code>word1</code> and <code>word2</code>, return <code>true</code> if <code>word1</code> and <code>word2</code> are close, and <code>false</code> otherwise.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> word1 = "abc", word2 = "bca"
<strong>Output:</strong> true
<strong>Explanation:</strong> You can attain word2 from word1 in 2 operations.
Apply Operation 1: "abc" -> "acb"
Apply Operation 1: "acb" -> "bca"
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> word1 = "a", word2 = "aa"
<strong>Output:</strong> false
<strong>Explanation:</strong> It is impossible to attain word2 from word1, or vice versa, in any number of operations.
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> word1 = "cabbba", word2 = "abbccc"
<strong>Output:</strong> true
<strong>Explanation:</strong> You can attain word2 from word1 in 3 operations.
Apply Operation 1: "cabbba" -> "caabbb"
Apply Operation 2: "caabbb" -> "baaccc"
Apply Operation 2: "baaccc" -> "abbccc"
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ <code>word1.length</code>, <code>word2.length</code> ≤ 10<sup>5</sup></li>
<li><code>word1</code> and <code>word2</code> contain only lowercase English letters.</li>
</ul>
