<h2><a href="https://leetcode.com/problems/count-and-say">38. Count and Say</a></h2>
<h3>Easy</h3>
<hr>
<p>The count-and-say sequence is a sequence of digit strings defined by the recursive formula:</p>
<pre>
countAndSay(1) = "1"
countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1), which is then converted into a different digit string.
</pre>
<p>To determine how you "say" a digit string, split it into the minimal number of substrings such that each substring contains exactly one unique digit. Then for each substring, say the number of digits, then say the digit. Finally, concatenate every said digit.</p>
<p>For example, the saying and conversion for digit string "3322251":</p>
<pre>
Given a positive integer n, return the nth term of the count-and-say sequence.
</pre>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> n = 1
<strong>Output:</strong> "1"
<strong>Explanation:</strong> This is the base case.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> n = 4
<strong>Output:</strong> "1211"
<strong>Explanation:</strong>
countAndSay(1) = "1"
countAndSay(2) = say "1" = one 1 = "11"
countAndSay(3) = say "11" = two 1's = "21"
countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>1 <= n <= 30</li>
</ul>
