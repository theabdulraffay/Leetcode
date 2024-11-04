<h2><a href="https://leetcode.com/problems/string-compression-iii">3163. String Compression III</a></h2>
<h3>Medium</h3>
<hr>
<p>Given a string <code>word</code>, compress it using the following algorithm:</p>

<p>Begin with an empty string <code>comp</code>. While <code>word</code> is not empty, use the following operation:</p>
<ul>
    <li>Remove a maximum length prefix of <code>word</code> made of a single character <code>c</code> repeating at most 9 times.</li>
    <li>Append the length of the prefix followed by <code>c</code> to <code>comp</code>.</li>
</ul>
<p>Return the string <code>comp</code>.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> word = "abcde"
<strong>Output:</strong> "1a1b1c1d1e"

<strong>Explanation:</strong> 
Initially, <code>comp = ""</code>. Apply the operation 5 times, choosing "a", "b", "c", "d", and "e" as the prefix in each operation.
For each prefix, append "1" followed by the character to <code>comp</code>.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> word = "aaaaaaaaaaaaaabb"
<strong>Output:</strong> "9a5a2b"

<strong>Explanation:</strong>
Initially, <code>comp = ""</code>. Apply the operation 3 times, choosing "aaaaaaaaa", "aaaaa", and "bb" as the prefix in each operation.
- For prefix "aaaaaaaaa", append "9" followed by "a" to <code>comp</code>.
- For prefix "aaaaa", append "5" followed by "a" to <code>comp</code>.
- For prefix "bb", append "2" followed by "b" to <code>comp</code>.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
    <li><code>1 <= word.length <= 2 * 10<sup>5</sup></code></li>
    <li><code>word</code> consists only of lowercase English letters.</li>
</ul>
