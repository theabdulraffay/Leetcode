<h2><a href="https://leetcode.com/problems/letter-combinations-of-a-phone-number">17. Letter Combinations of a Phone Number</a></h2>
<h3>Medium</h3>
<hr>
<p>Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.</p>
<p>A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.</p>
<pre>
Digit: 2
Mapping: "abc"

Digit: 3
Mapping: "def"

Digit: 4
Mapping: "ghi"

Digit: 5
Mapping: "jkl"

Digit: 6
Mapping: "mno"

Digit: 7
Mapping: "pqrs"

Digit: 8
Mapping: "tuv"

Digit: 9
Mapping: "wxyz"
</pre>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> digits = "23"
<strong>Output:</strong> ["ad","ae","af","bd","be","bf","cd","ce","cf"]
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> digits = ""
<strong>Output:</strong> []
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> digits = "2"
<strong>Output:</strong> ["a","b","c"]
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>0 ≤ digits.length ≤ 4</li>
<li>digits[i] is a digit in the range ['2', '9'].</li>
</ul>
