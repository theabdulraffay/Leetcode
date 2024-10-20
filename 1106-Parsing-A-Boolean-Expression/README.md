<h2><a href="https://leetcode.com/problems/parsing-a-boolean-expression">1106. Parsing A Boolean Expression</a></h2>
<h3>Hard</h3>
<hr>
<p>A boolean expression is an expression that evaluates to either <code>true</code> or <code>false</code>. It can be in one of the following shapes:</p>

<ul>
  <li><code>'t'</code> that evaluates to <code>true</code>.</li>
  <li><code>'f'</code> that evaluates to <code>false</code>.</li>
  <li><code>'!(subExpr)'</code> that evaluates to the logical NOT of the inner expression <code>subExpr</code>.</li>
  <li><code>'&(subExpr1, subExpr2, ..., subExprn)'</code> that evaluates to the logical AND of the inner expressions <code>subExpr1, subExpr2, ..., subExprn</code> where <code>n >= 1</code>.</li>
  <li><code>'|(subExpr1, subExpr2, ..., subExprn)'</code> that evaluates to the logical OR of the inner expressions <code>subExpr1, subExpr2, ..., subExprn</code> where <code>n >= 1</code>.</li>
</ul>

<p>Given a string <code>expression</code> that represents a boolean expression, return the evaluation of that expression.</p>

<p>It is guaranteed that the given expression is valid and follows the given rules.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> expression = "&(|(f))"
<strong>Output:</strong> false
<strong>Explanation:</strong> 
First, evaluate |(f) --> f. The expression is now "&(f)".
Then, evaluate &(f) --> f. The expression is now "f".
Finally, return false.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> expression = "|(f,f,f,t)"
<strong>Output:</strong> true
<strong>Explanation:</strong> The evaluation of (false OR false OR false OR true) is true.
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> expression = "!(&(f,t))"
<strong>Output:</strong> true
<strong>Explanation:</strong> 
First, evaluate &(f,t) --> (false AND true) --> false --> f. The expression is now "!(f)".
Then, evaluate !(f) --> NOT false --> true. We return true.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 <= expression.length <= 2 * 10<sup>4</sup></code></li>
  <li><code>expression[i]</code> is one of the following characters: <code>'('</code>, <code>')'</code>, <code>'&'</code>, <code>'|'</code>, <code>'!'</code>, <code>'t'</code>, <code>'f'</code>, and <code>','</code>.</li>
</ul>
