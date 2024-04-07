<h2><a href="https://leetcode.com/problems/valid-parenthesis-string">678. Valid Parenthesis String</a></h2>
<h3>Medium</h3>
<hr>
<p>Given a string <em>s</em> containing only three types of characters: '(', ')' and '*', return true if <em>s</em> is valid.</p>
<p>The following rules define a valid string:</p>
<ul>
<li>Any left parenthesis '(' must have a corresponding right parenthesis ')'.</li>
<li>Any right parenthesis ')' must have a corresponding left parenthesis '('.</li>
<li>Left parenthesis '(' must go before the corresponding right parenthesis ')'.</li>
<li>'*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".</li>
</ul>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> s = "()"
<strong>Output:</strong> true
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> s = "(*)"
<strong>Output:</strong> true
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> s = "(*))"
<strong>Output:</strong> true
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ <em>s.length</em> ≤ 100</li>
<li><em>s[i]</em> is '(', ')' or '*'</li>
</ul>
