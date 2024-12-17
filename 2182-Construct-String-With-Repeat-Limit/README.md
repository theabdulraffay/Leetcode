<h2><a href="https://leetcode.com/problems/construct-string-with-repeat-limit">2182. Construct String With Repeat Limit</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a string <code>s</code> and an integer <code>repeatLimit</code>. Construct a new string <code>repeatLimitedString</code> using the characters of <code>s</code> such that no letter appears more than <code>repeatLimit</code> times in a row. You do not have to use all characters from <code>s</code>.</p>

<p>Return the lexicographically largest <code>repeatLimitedString</code> possible.</p>

<p>A string <code>a</code> is lexicographically larger than a string <code>b</code> if in the first position where <code>a</code> and <code>b</code> differ, string <code>a</code> has a letter that appears later in the alphabet than the corresponding letter in <code>b</code>. If the first <code>min(a.length, b.length)</code> characters do not differ, then the longer string is the lexicographically larger one.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> s = "cczazcc", repeatLimit = 3
<strong>Output:</strong> "zzcccac"
<strong>Explanation:</strong> 
We use all of the characters from s to construct the repeatLimitedString "zzcccac".
- The letter 'a' appears at most 1 time in a row.
- The letter 'c' appears at most 3 times in a row.
- The letter 'z' appears at most 2 times in a row.
Hence, no letter appears more than repeatLimit times in a row and the string is valid.
The string is the lexicographically largest repeatLimitedString possible, so we return "zzcccac".
Note that the string "zzcccca" is lexicographically larger, but 'c' appears more than 3 times in a row, so it is invalid.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> s = "aababab", repeatLimit = 2
<strong>Output:</strong> "bbabaa"
<strong>Explanation:</strong> 
We use only some of the characters from s to construct the repeatLimitedString "bbabaa". 
- The letter 'a' appears at most 2 times in a row.
- The letter 'b' appears at most 2 times in a row.
Hence, no letter appears more than repeatLimit times in a row and the string is valid.
The string is the lexicographically largest repeatLimitedString possible, so we return "bbabaa".
Note that the string "bbabaaa" is lexicographically larger, but 'a' appears more than 2 times in a row, so it is invalid.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li><code>1 <= repeatLimit <= s.length <= 10<sup>5</sup></code></li>
<li><code>s</code> consists of lowercase English letters.</li>
</ul>
