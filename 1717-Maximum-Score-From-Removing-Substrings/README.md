<h2><a href="https://leetcode.com/problems/maximum-score-from-removing-substrings">1717. Maximum Score From Removing Substrings</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a string <code>s</code> and two integers <code>x</code> and <code>y</code>. You can perform two types of operations any number of times.</p>

<ul>
<li>Remove substring "ab" and gain <code>x</code> points.<br>
For example, when removing "ab" from "cabxbae" it becomes "cxbae".</li>
<li>Remove substring "ba" and gain <code>y</code> points.<br>
For example, when removing "ba" from "cabxbae" it becomes "cabxe".</li>
</ul>

<p>Return the maximum points you can gain after applying the above operations on <code>s</code>.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> s = "cdbcbbaaabab", x = 4, y = 5
<strong>Output:</strong> 19
<strong>Explanation:</strong>
- Remove the "ba" underlined in "cdbcbbaaabab". Now, s = "cdbcbbaaab" and 5 points are added to the score.
- Remove the "ab" underlined in "cdbcbbaaab". Now, s = "cdbcbbaa" and 4 points are added to the score.
- Remove the "ba" underlined in "cdbcbbaa". Now, s = "cdbcba" and 5 points are added to the score.
- Remove the "ba" underlined in "cdbcba". Now, s = "cdbc" and 5 points are added to the score.
Total score = 5 + 4 + 5 + 5 = 19.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> s = "aabbaaxybbaabb", x = 5, y = 4
<strong>Output:</strong> 20
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ s.length ≤ 10<sup>5</sup></li>
<li>1 ≤ x, y ≤ 10<sup>4</sup></li>
<li>s consists of lowercase English letters.</li>
</ul>
