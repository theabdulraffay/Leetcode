<h2><a href="https://leetcode.com/problems/remove-k-digits">402. Remove K Digits</a></h2>
<h3>Medium</h3>
<hr>
<p>Given string <em>num</em> representing a non-negative integer num, and an integer <em>k</em>, return the smallest possible integer after removing <em>k</em> digits from <em>num</em>.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> num = "1432219", k = 3
<strong>Output:</strong> "1219"
<strong>Explanation:</strong> Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> num = "10200", k = 1
<strong>Output:</strong> "200"
<strong>Explanation:</strong> Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> num = "10", k = 2
<strong>Output:</strong> "0"
<strong>Explanation:</strong> Remove all the digits from the number and it is left with nothing which is 0.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ <em>k</em> ≤ <em>num.length</em> ≤ 10<sup>5</sup></li>
<li><em>num</em> consists of only digits.</li>
<li><em>num</em> does not have any leading zeros except for the zero itself.</li>
</ul>
