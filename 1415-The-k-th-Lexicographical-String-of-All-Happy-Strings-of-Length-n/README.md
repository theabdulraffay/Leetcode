<h2><a href="https://leetcode.com/problems/the-k-th-lexicographical-string-of-all-happy-strings-of-length-n">1415. The k-th Lexicographical String of All Happy Strings of Length n</a></h2>
<h3>Medium</h3>
<hr>
<p>A happy string is a string that:</p>
<ul>
  <li>consists only of letters of the set ['a', 'b', 'c'].</li>
  <li><code>s[i] != s[i + 1]</code> for all values of <code>i</code> from 1 to <code>s.length - 1</code> (string is 1-indexed).</li>
</ul>
<p>For example, strings "abc", "ac", "b", and "abcbabcbcb" are all happy strings and strings "aa", "baa", and "ababbc" are not happy strings.</p>
<p>Given two integers <code>n</code> and <code>k</code>, consider a list of all happy strings of length <code>n</code> sorted in lexicographical order.</p>
<p>Return the <code>k</code>-th string of this list or return an empty string if there are less than <code>k</code> happy strings of length <code>n</code>.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> n = 1, k = 3
<strong>Output:</strong> "c"
<strong>Explanation:</strong> The list ["a", "b", "c"] contains all happy strings of length 1. The third string is "c".
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> n = 1, k = 4
<strong>Output:</strong> ""
<strong>Explanation:</strong> There are only 3 happy strings of length 1.
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> n = 3, k = 9
<strong>Output:</strong> "cab"
<strong>Explanation:</strong> There are 12 different happy strings of length 3 ["aba", "abc", "aca", "acb", "bab", "bac", "bca", "bcb", "cab", "cac", "cba", "cbc"]. You will find the 9th string = "cab".
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>1 <= <code>n</code> <= 10</li>
  <li>1 <= <code>k</code> <= 100</li>
</ul>
