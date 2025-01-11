<h2><a href="https://leetcode.com/problems/construct-k-palindrome-strings">1400. Construct K Palindrome Strings</a></h2>
<h3>Medium</h3>
<hr>
<p>Given a string <code>s</code> and an integer <code>k</code>, return <code>true</code> if you can use all the characters in <code>s</code> to construct <code>k</code> palindrome strings or <code>false</code> otherwise.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> s = "annabelle", k = 2
<strong>Output:</strong> true
<strong>Explanation:</strong> You can construct two palindromes using all characters in s.
Some possible constructions "anna" + "elble", "anbna" + "elle", "anellena" + "b"
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> s = "leetcode", k = 3
<strong>Output:</strong> false
<strong>Explanation:</strong> It is impossible to construct 3 palindromes using all the characters of s.
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> s = "true", k = 4
<strong>Output:</strong> true
<strong>Explanation:</strong> The only possible solution is to put each character in a separate string.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li>1 ≤ <code>s.length</code> ≤ 10<sup>5</sup></li>
  <li><code>s</code> consists of lowercase English letters.</li>
  <li>1 ≤ <code>k</code> ≤ 10<sup>5</sup></li>
</ul>
