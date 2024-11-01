<h2><a href="https://leetcode.com/problems/delete-characters-to-make-fancy-string">1957. Delete Characters to Make Fancy String</a></h2>
<h3>Easy</h3>
<hr>
<p>A fancy string is a string where no three consecutive characters are equal.</p>

<p>Given a string <code>s</code>, delete the minimum possible number of characters from <code>s</code> to make it fancy.</p>

<p>Return the final string after the deletion. It can be shown that the answer will always be unique.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> s = "leeetcode"
<strong>Output:</strong> "leetcode"
<strong>Explanation:</strong>
Remove an 'e' from the first group of 'e's to create "leetcode".
No three consecutive characters are equal, so return "leetcode".
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> s = "aaabaaaa"
<strong>Output:</strong> "aabaa"
<strong>Explanation:</strong>
Remove an 'a' from the first group of 'a's to create "aabaaaa".
Remove two 'a's from the second group of 'a's to create "aabaa".
No three consecutive characters are equal, so return "aabaa".
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> s = "aab"
<strong>Output:</strong> "aab"
<strong>Explanation:</strong> No three consecutive characters are equal, so return "aab".
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li><code>1 <= s.length <= 10<sup>5</sup></code></li>
<li><code>s</code> consists only of lowercase English letters.</li>
</ul>
