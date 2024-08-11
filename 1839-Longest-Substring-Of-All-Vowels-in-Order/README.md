<h2><a href="https://leetcode.com/problems/longest-substring-of-all-vowels-in-order">1839. Longest Substring Of All Vowels in Order</a></h2>
<h3>Solved</h3>
<h3>Medium</h3>
<hr>
<p>A string is considered beautiful if it satisfies the following conditions:</p>
<ul>
  <li>Each of the 5 English vowels ('a', 'e', 'i', 'o', 'u') must appear at least once in it.</li>
  <li>The letters must be sorted in alphabetical order (i.e. all 'a's before 'e's, all 'e's before 'i's, etc.).</li>
</ul>
<p>For example, strings "aeiou" and "aaaaaaeiiiioou" are considered beautiful, but "uaeio", "aeoiu", and "aaaeeeooo" are not beautiful.</p>

<p>Given a string <code>word</code> consisting of English vowels, return the length of the longest beautiful substring of <code>word</code>. If no such substring exists, return 0.</p>

<p>A substring is a contiguous sequence of characters in a string.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> word = "aeiaaioaaaaeiiiiouuuooaauuaeiu"
<strong>Output:</strong> 13
<strong>Explanation:</strong> The longest beautiful substring in word is "aaaaeiiiiouuu" of length 13.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> word = "aeeeiiiioooauuuaeiou"
<strong>Output:</strong> 5
<strong>Explanation:</strong> The longest beautiful substring in word is "aeiou" of length 5.
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> word = "a"
<strong>Output:</strong> 0
<strong>Explanation:</strong> There is no beautiful substring, so return 0.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li>1 <= <code>word.length</code> <= 5 * 10<sup>5</sup></li>
  <li><code>word</code> consists of characters 'a', 'e', 'i', 'o', and 'u'.</li>
</ul>
