<h2><a href="https://leetcode.com/problems/clear-digits">3174. Clear Digits</a></h2>
<h3>Easy</h3>
<hr>
<p>You are given a string <code>s</code>.</p>
<p>Your task is to remove all digits by doing this operation repeatedly:</p>
<ul>
  <li>Delete the first digit and the closest non-digit character to its left.</li>
</ul>
<p>Return the resulting string after removing all digits.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> s = "abc"
<strong>Output:</strong> "abc"
<strong>Explanation:</strong>
There is no digit in the string.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> s = "cb34"
<strong>Output:</strong> ""
<strong>Explanation:</strong>
First, we apply the operation on s[2], and s becomes "c4".
Then we apply the operation on s[1], and s becomes "".
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>1 <= <code>s.length</code> <= 100</li>
  <li><code>s</code> consists only of lowercase English letters and digits.</li>
  <li>The input is generated such that it is possible to delete all digits.</li>
</ul>
