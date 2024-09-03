<h2><a href="https://leetcode.com/problems/sum-of-digits-of-string-after-convert">1945. Sum of Digits of String After Convert</a></h2>
<h3>Easy</h3>
<hr>
<p>You are given a string <code>s</code> consisting of lowercase English letters, and an integer <code>k</code>.</p>
<p>First, convert <code>s</code> into an integer by replacing each letter with its position in the alphabet (i.e., replace 'a' with 1, 'b' with 2, ..., 'z' with 26). Then, transform the integer by replacing it with the sum of its digits. Repeat the transform operation <code>k</code> times in total.</p>
<p>For example, if <code>s = "zbax"</code> and <code>k = 2</code>, then the resulting integer would be 8 by the following operations:</p>
<ul>
<li>Convert: <code>"zbax" ➝ "(26)(2)(1)(24)" ➝ "262124" ➝ 262124</code></li>
<li>Transform #1: <code>262124 ➝ 2 + 6 + 2 + 1 + 2 + 4 ➝ 17</code></li>
<li>Transform #2: <code>17 ➝ 1 + 7 ➝ 8</code></li>
</ul>
<p>Return the resulting integer after performing the operations described above.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> s = "iiii", k = 1
<strong>Output:</strong> 36
<strong>Explanation:</strong> The operations are as follows:
- Convert: "iiii" ➝ "(9)(9)(9)(9)" ➝ "9999" ➝ 9999
- Transform #1: 9999 ➝ 9 + 9 + 9 + 9 ➝ 36
Thus the resulting integer is 36.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> s = "leetcode", k = 2
<strong>Output:</strong> 6
<strong>Explanation:</strong> The operations are as follows:
- Convert: "leetcode" ➝ "(12)(5)(5)(20)(3)(15)(4)(5)" ➝ "12552031545" ➝ 12552031545
- Transform #1: 12552031545 ➝ 1 + 2 + 5 + 5 + 2 + 0 + 3 + 1 + 5 + 4 + 5 ➝ 33
- Transform #2: 33 ➝ 3 + 3 ➝ 6
Thus the resulting integer is 6.
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> s = "zbax", k = 2
<strong>Output:</strong> 8
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li><code>1 <= s.length <= 100</code></li>
<li><code>1 <= k <= 10</code></li>
<li><code>s</code> consists of lowercase English letters.</li>
</ul>
