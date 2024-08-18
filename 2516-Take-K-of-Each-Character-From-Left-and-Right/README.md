<h2><a href="https://leetcode.com/problems/take-k-of-each-character-from-left-and-right">2516. Take K of Each Character From Left and Right</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a string <code>s</code> consisting of the characters <code>'a'</code>, <code>'b'</code>, and <code>'c'</code> and a non-negative integer <code>k</code>. Each minute, you may take either the leftmost character of <code>s</code>, or the rightmost character of <code>s</code>.</p>
<p>Return the minimum number of minutes needed for you to take at least <code>k</code> of each character, or return <code>-1</code> if it is not possible to take <code>k</code> of each character.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> s = "aabaaaacaabc", k = 2
<strong>Output:</strong> 8
<strong>Explanation:</strong> 
Take three characters from the left of s. You now have two 'a' characters, and one 'b' character.
Take five characters from the right of s. You now have four 'a' characters, two 'b' characters, and two 'c' characters.
A total of 3 + 5 = 8 minutes is needed.
It can be proven that 8 is the minimum number of minutes needed.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> s = "a", k = 1
<strong>Output:</strong> -1
<strong>Explanation:</strong> It is not possible to take one 'b' or 'c' so return -1.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>1 ≤ <code>s.length</code> ≤ 10<sup>5</sup></li>
  <li><code>s</code> consists of only the letters <code>'a'</code>, <code>'b'</code>, and <code>'c'</code>.</li>
  <li>0 ≤ <code>k</code> ≤ <code>s.length</code></li>
</ul>
