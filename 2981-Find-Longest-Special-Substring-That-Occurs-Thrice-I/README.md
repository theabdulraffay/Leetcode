<h2><a href="https://leetcode.com/problems/find-longest-special-substring-that-occurs-thrice-i">2981. Find Longest Special Substring That Occurs Thrice I</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a string <code>s</code> that consists of lowercase English letters.</p>
<p>A string is called <strong>special</strong> if it is made up of only a single character. For example, the string <code>"abc"</code> is not special, whereas the strings <code>"ddd"</code>, <code>"zz"</code>, and <code>"f"</code> are special.</p>
<p>Return the length of the longest special substring of <code>s</code> which occurs at least thrice, or <code>-1</code> if no special substring occurs at least thrice.</p>
<p>A substring is a contiguous non-empty sequence of characters within a string.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> s = "aaaa"
<strong>Output:</strong> 2
<strong>Explanation:</strong> The longest special substring which occurs thrice is <code>"aa"</code>: substrings <code>"aaaa"</code>, <code>"aaaa"</code>, and <code>"aaaa"</code>.
It can be shown that the maximum length achievable is 2.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> s = "abcdef"
<strong>Output:</strong> -1
<strong>Explanation:</strong> There exists no special substring which occurs at least thrice. Hence return <code>-1</code>.
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> s = "abcaba"
<strong>Output:</strong> 1
<strong>Explanation:</strong> The longest special substring which occurs thrice is <code>"a"</code>: substrings <code>"abcaba"</code>, <code>"abcaba"</code>, and <code>"abcaba"</code>.
It can be shown that the maximum length achievable is 1.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li>3 ≤ <code>s.length</code> ≤ 50</li>
  <li><code>s</code> consists of only lowercase English letters.</li>
</ul>
