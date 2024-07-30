<h2><a href="https://leetcode.com/problems/minimum-deletions-to-make-string-balanced">1653. Minimum Deletions to Make String Balanced</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a string <code>s</code> consisting only of characters 'a' and 'b'.</p>
<p>You can delete any number of characters in <code>s</code> to make <code>s</code> balanced. A string is balanced if there is no pair of indices <code>(i, j)</code> such that <code>i < j</code> and <code>s[i] = 'b'</code> and <code>s[j] = 'a'</code>.</p>
<p>Return the minimum number of deletions needed to make <code>s</code> balanced.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> s = "aababbab"
<strong>Output:</strong> 2
<strong>Explanation:</strong> You can either:
Delete the characters at 0-indexed positions 2 and 6 ("aababbab" -> "aaabbb"), or
Delete the characters at 0-indexed positions 3 and 6 ("aababbab" -> "aabbbb").
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> s = "bbaaaaabb"
<strong>Output:</strong> 2
<strong>Explanation:</strong> The only solution is to delete the first two characters.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ <code>s.length</code> ≤ 10<sup>5</sup></li>
<li><code>s[i]</code> is 'a' or 'b'.</li>
</ul>
