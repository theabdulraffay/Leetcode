<h2><a href="https://leetcode.com/problems/unique-length-3-palindromic-subsequences">1930. Unique Length-3 Palindromic Subsequences</a></h2>
<h3>Medium</h3>
<hr>
<p>Given a string <code>s</code>, return the number of unique palindromes of length three that are a subsequence of <code>s</code>.</p>

<p>Note that even if there are multiple ways to obtain the same subsequence, it is still only counted once.</p>

<p>A <strong>palindrome</strong> is a string that reads the same forwards and backwards.</p>
<p>A <strong>subsequence</strong> of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.</p>

<p>For example, <code>"ace"</code> is a subsequence of <code>"abcde"</code>.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> s = "aabca"
<strong>Output:</strong> 3
<strong>Explanation:</strong> The 3 palindromic subsequences of length 3 are:
- "aba" (subsequence of "aabca")
- "aaa" (subsequence of "aabca")
- "aca" (subsequence of "aabca")
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> s = "adc"
<strong>Output:</strong> 0
<strong>Explanation:</strong> There are no palindromic subsequences of length 3 in "adc".
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> s = "bbcbaba"
<strong>Output:</strong> 4
<strong>Explanation:</strong> The 4 palindromic subsequences of length 3 are:
- "bbb" (subsequence of "bbcbaba")
- "bcb" (subsequence of "bbcbaba")
- "bab" (subsequence of "bbcbaba")
- "aba" (subsequence of "bbcbaba")
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li><code>3 <= s.length <= 10<sup>5</sup></code></li>
<li><code>s</code> consists of only lowercase English letters.</li>
</ul>
