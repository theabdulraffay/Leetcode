<h2><a href="https://leetcode.com/problems/minimum-length-of-string-after-operations">3223. Minimum Length of String After Operations</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a string <code>s</code>.</p>
<p>You can perform the following process on <code>s</code> <strong>any</strong> number of times:</p>
<ul>
  <li>Choose an index <code>i</code> in the string such that there is <strong>at least</strong> one character to the left of index <code>i</code> that is equal to <code>s[i]</code>, and <strong>at least</strong> one character to the right that is also equal to <code>s[i]</code>.</li>
  <li>Delete the <strong>closest</strong> character to the <strong>left</strong> of index <code>i</code> that is equal to <code>s[i]</code>.</li>
  <li>Delete the <strong>closest</strong> character to the <strong>right</strong> of index <code>i</code> that is equal to <code>s[i]</code>.</li>
</ul>
<p>Return the <strong>minimum</strong> length of the final string <code>s</code> that you can achieve.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> s = "abaacbcbb"
<strong>Output:</strong> 5
<strong>Explanation:</strong> We do the following operations:
* Choose index 2, then remove the characters at indices 0 and 3. The resulting string is <code>s = "bacbcbb"</code>.
* Choose index 3, then remove the characters at indices 0 and 5. The resulting string is <code>s = "acbcb"</code>.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> s = "aa"
<strong>Output:</strong> 2
<strong>Explanation:</strong> We cannot perform any operations, so we return the length of the original string.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li>1 ≤ <code>s.length</code> ≤ 2 * 10<sup>5</sup></li>
  <li><code>s</code> consists only of lowercase English letters.</li>
</ul>
