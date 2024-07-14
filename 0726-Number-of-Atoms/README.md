<h2><a href="https://leetcode.com/problems/number-of-atoms">726. Number of Atoms</a></h2>
<h3>Hard</h3>
<hr>
<p>Given a string formula representing a chemical formula, return the count of each atom.</p>
<p>The atomic element always starts with an uppercase character, then zero or more lowercase letters, representing the name.</p>
<p>One or more digits representing that element's count may follow if the count is greater than 1. If the count is 1, no digits will follow.</p>
<p>For example, <code>"H2O"</code> and <code>"H2O2"</code> are possible, but <code>"H1O2"</code> is impossible.<br>
Two formulas are concatenated together to produce another formula.</p>
<p>For example, <code>"H2O2He3Mg4"</code> is also a formula.<br>
A formula placed in parentheses, and a count (optionally added) is also a formula.</p>
<p>For example, <code>"(H2O2)"</code> and <code>"(H2O2)3"</code> are formulas.<br>
Return the count of all elements as a string in the following form: the first name (in sorted order), followed by its count (if that count is more than 1), followed by the second name (in sorted order), followed by its count (if that count is more than 1), and so on.</p>
<p>The test cases are generated so that all the values in the output fit in a 32-bit integer.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> formula = "H2O"
<strong>Output:</strong> "H2O"
<strong>Explanation:</strong> The count of elements are {'H': 2, 'O': 1}.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> formula = "Mg(OH)2"
<strong>Output:</strong> "H2MgO2"
<strong>Explanation:</strong> The count of elements are {'H': 2, 'Mg': 1, 'O': 2}.
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> formula = "K4(ON(SO3)2)2"
<strong>Output:</strong> "K4N2O14S4"
<strong>Explanation:</strong> The count of elements are {'K': 4, 'N': 2, 'O': 14, 'S': 4}.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ <code>formula.length</code> ≤ 1000</li>
<li>formula consists of English letters, digits, '(', and ')'.</li>
<li>formula is always valid.</li>
</ul>
