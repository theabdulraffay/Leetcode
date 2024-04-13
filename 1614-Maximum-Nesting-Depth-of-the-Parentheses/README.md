<h2><a href="https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses">1614. Maximum Nesting Depth of the Parentheses</a></h2>
<h3>Easy</h3>
<hr>
<p>A string is a valid parentheses string (denoted VPS) if it meets one of the following:</p>
<ol>
<li>It is an empty string "", or a single character not equal to "(" or ")",</li>
<li>It can be written as AB (A concatenated with B), where A and B are VPS's, or</li>
<li>It can be written as (A), where A is a VPS.</li>
</ol>
<p>We can similarly define the nesting depth depth(S) of any VPS S as follows:</p>
<ul>
<li>depth("") = 0</li>
<li>depth(C) = 0, where C is a string with a single character not equal to "(" or ")".</li>
<li>depth(A + B) = max(depth(A), depth(B)), where A and B are VPS's.</li>
<li>depth("(" + A + ")") = 1 + depth(A), where A is a VPS.</li>
</ul>
<p>For example, "", "()()", and "()(()())" are VPS's (with nesting depths 0, 1, and 2), and ")(" and "(()" are not VPS's.</p>
<p>Given a VPS represented as string <em>s</em>, return the nesting depth of <em>s</em>.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> s = "(1+(2*3)+((8)/4))+1"
<strong>Output:</strong> 3
<strong>Explanation:</strong> Digit 8 is inside of 3 nested parentheses in the string.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> s = "(1)+((2))+(((3)))"
<strong>Output:</strong> 3
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ <em>s.length</em> ≤ 100</li>
<li><em>s</em> consists of digits 0-9 and characters '+', '-', '*', '/', '(', and ')'.</li>
<li>It is guaranteed that parentheses expression <em>s</em> is a VPS.</li>
</ul>
