<h2><a href="https://leetcode.com/problems/count-of-substrings-containing-every-vowel-and-k-consonants-ii">3306. Count of Substrings Containing Every Vowel and K Consonants II</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a string <code>word</code> and a non-negative integer <code>k</code>.</p>
<p>Return the total number of substrings of <code>word</code> that contain every vowel ('a', 'e', 'i', 'o', and 'u') at least once and exactly <code>k</code> consonants.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> word = "aeioqq", k = 1
<strong>Output:</strong> 0
<strong>Explanation:</strong>
There is no substring with every vowel.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> word = "aeiou", k = 0
<strong>Output:</strong> 1
<strong>Explanation:</strong>
The only substring with every vowel and zero consonants is word[0..4], which is "aeiou".
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> word = "ieaouqqieaouqq", k = 1
<strong>Output:</strong> 3
<strong>Explanation:</strong>
The substrings with every vowel and one consonant are:
- word[0..5], which is "ieaouq".
- word[6..11], which is "qieaou".
- word[7..12], which is "ieaouq".
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>5 <= <code>word.length</code> <= 2 * 10<sup>5</sup></li>
  <li><code>word</code> consists only of lowercase English letters.</li>
  <li>0 <= <code>k</code> <= <code>word.length</code> - 5</li>
</ul>
