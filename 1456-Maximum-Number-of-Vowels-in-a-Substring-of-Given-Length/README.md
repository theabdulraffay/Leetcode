<h2><a href="https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length">1456. Maximum Number of Vowels in a Substring of Given Length</a></h2>
<h3>Medium</h3>
<hr>
<p>Given a string <code>s</code> and an integer <code>k</code>, return the maximum number of vowel letters in any substring of <code>s</code> with length <code>k</code>.</p>

<p>Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> s = "abciiidef", k = 3
<strong>Output:</strong> 3
<strong>Explanation:</strong> The substring "iii" contains 3 vowel letters.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> s = "aeiou", k = 2
<strong>Output:</strong> 2
<strong>Explanation:</strong> Any substring of length 2 contains 2 vowels.
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> s = "leetcode", k = 3
<strong>Output:</strong> 2
<strong>Explanation:</strong> "lee", "eet" and "ode" contain 2 vowels.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ <code>s.length</code> ≤ 10<sup>5</sup></li>
<li><code>s</code> consists of lowercase English letters.</li>
<li>1 ≤ <code>k</code> ≤ <code>s.length</code></li>
</ul>
