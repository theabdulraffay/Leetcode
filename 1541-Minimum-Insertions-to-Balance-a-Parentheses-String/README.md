<h2><a href="https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/description/">1541. Minimum Insertions to Balance a Parentheses String</a></h2>
<h3>Medium</h3>
<hr>
<p>Given a parentheses string s containing only the characters '(' and ')'. A parentheses string is balanced if:</p>
<ul>
  <li>Any left parenthesis '(' must have a corresponding two consecutive right parenthesis '))'.</li>
  <li>Left parenthesis '(' must go before the corresponding two consecutive right parenthesis '))'.</li>
</ul>
<p>In other words, we treat '(' as an opening parenthesis and '))' as a closing parenthesis.</p>
<p>For example, "())", "())(())))" and "(())())))" are balanced, ")()", "()))" and "(()))" are not balanced.</p>
<p>You can insert the characters '(' and ')' at any position of the string to balance it if needed.</p>
<p>Return the minimum number of insertions needed to make s balanced.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> s = "(()))"
<strong>Output:</strong> 1
<strong>Explanation:</strong> The second '(' has two matching '))', but the first '(' has only ')' matching. We need to add one more ')' at the end of the string to be "(())))" which is balanced.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> s = "())"
<strong>Output:</strong> 0
<strong>Explanation:</strong> The string is already balanced.
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> s = "))())("
<strong>Output:</strong> 3
<strong>Explanation:</strong> Add '(' to match the first '))', Add '))' to match the last '('.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>1 <= s.length <= 105</li>
  <li>s consists of '(' and ')' only.</li>
</ul>
