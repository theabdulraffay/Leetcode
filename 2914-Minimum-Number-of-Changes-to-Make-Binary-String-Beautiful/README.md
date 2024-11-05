<h2><a href="https://leetcode.com/problems/minimum-number-of-changes-to-make-binary-string-beautiful">2914. Minimum Number of Changes to Make Binary String Beautiful</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a 0-indexed binary string <code>s</code> having an even length.</p>

<p>A string is considered <em>beautiful</em> if it can be partitioned into one or more substrings such that:</p>
<ul>
  <li>Each substring has an even length.</li>
  <li>Each substring contains only <code>1</code>'s or only <code>0</code>'s.</li>
</ul>
<p>You can change any character in <code>s</code> to <code>0</code> or <code>1</code>.</p>

<p>Return the minimum number of changes required to make the string <code>s</code> beautiful.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> s = "1001"
<strong>Output:</strong> 2
<strong>Explanation:</strong> We change <code>s[1]</code> to <code>1</code> and <code>s[3]</code> to <code>0</code> to get the string <code>"1100"</code>.
The string "1100" is beautiful because it can be partitioned into "11|00".
It can be proven that 2 is the minimum number of changes needed to make the string beautiful.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> s = "10"
<strong>Output:</strong> 1
<strong>Explanation:</strong> We change <code>s[1]</code> to <code>1</code> to get the string <code>"11"</code>.
The string "11" is beautiful because it can be partitioned into "11".
It can be proven that 1 is the minimum number of changes needed to make the string beautiful.
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> s = "0000"
<strong>Output:</strong> 0
<strong>Explanation:</strong> We don't need to make any changes as the string "0000" is already beautiful.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>2 <= s.length <= 10^5</code></li>
  <li><code>s</code> has an even length.</li>
  <li><code>s[i]</code> is either <code>'0'</code> or <code>'1'</code>.</li>
</ul>
