<h2><a href="https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/">921. Minimum Add to Make Parentheses Valid</a></h2>
<h3>Medium</h3>
<hr>
<p>A parentheses string is valid if and only if:</p>
<ol>
  <li>It is the empty string,</li>
  <li>It can be written as AB (A concatenated with B), where A and B are valid strings, or</li>
  <li>It can be written as (A), where A is a valid string.</li>
</ol>
<p>You are given a parentheses string s. In one move, you can insert a parenthesis at any position of the string.</p>
<p>For example, if s = "()))", you can insert an opening parenthesis to be "(()))" or a closing parenthesis to be "())))".</p>
<p>Return the minimum number of moves required to make s valid.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> s = "())"
<strong>Output:</strong> 1
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> s = "((("
<strong>Output:</strong> 3
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>1 <= s.length <= 1000</li>
  <li>s[i] is either '(' or ')'.</li>
</ul>
