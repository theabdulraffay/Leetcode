<h2><a href="https://leetcode.com/problems/substring-with-concatenation-of-all-words">30. Substring with Concatenation of All Words</a></h2>
<h3>Solved</h3>
<hr>
<p>You are given a string <code>s</code> and an array of strings <code>words</code>. All the strings of <code>words</code> are of the same length.</p>
<p>A concatenated string is a string that exactly contains all the strings of any permutation of <code>words</code> concatenated.</p>
<p>For example, if <code>words = ["ab","cd","ef"]</code>, then <code>"abcdef"</code>, <code>"abefcd"</code>, <code>"cdabef"</code>, <code>"cdefab"</code>, <code>"efabcd"</code>, and <code>"efcdab"</code> are all concatenated strings. <code>"acdbef"</code> is not a concatenated string because it is not the concatenation of any permutation of <code>words</code>.</p>
<p>Return an array of the starting indices of all the concatenated substrings in <code>s</code>. You can return the answer in any order.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> s = "barfoothefoobarman", words = ["foo","bar"]
<strong>Output:</strong> [0,9]
<strong>Explanation:</strong>
The substring starting at 0 is "barfoo". It is the concatenation of ["bar","foo"] which is a permutation of words.
The substring starting at 9 is "foobar". It is the concatenation of ["foo","bar"] which is a permutation of words.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> s = "wordgoodgoodgoodbestword", words = ["word","good","best","word"]
<strong>Output:</strong> []
<strong>Explanation:</strong>
There is no concatenated substring.
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> s = "barfoofoobarthefoobarman", words = ["bar","foo","the"]
<strong>Output:</strong> [6,9,12]
<strong>Explanation:</strong>
The substring starting at 6 is "foobarthe". It is the concatenation of ["foo","bar","the"].
The substring starting at 9 is "barthefoo". It is the concatenation of ["bar","the","foo"].
The substring starting at 12 is "thefoobar". It is the concatenation of ["the","foo","bar"].
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>1 ≤ <code>s.length</code> ≤ 10<sup>4</sup></li>
  <li>1 ≤ <code>words.length</code> ≤ 5000</li>
  <li>1 ≤ <code>words[i].length</code> ≤ 30</li>
  <li><code>s</code> and <code>words[i]</code> consist of lowercase English letters.</li>
</ul>
