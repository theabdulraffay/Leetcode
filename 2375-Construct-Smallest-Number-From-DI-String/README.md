<h2><a href="https://leetcode.com/problems/construct-smallest-number-from-di-string">2375. Construct Smallest Number From DI String</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a 0-indexed string <code>pattern</code> of length <code>n</code> consisting of the characters 'I' meaning increasing and 'D' meaning decreasing.</p>
<p>A 0-indexed string <code>num</code> of length <code>n + 1</code> is created using the following conditions:</p>
<ul>
  <li><code>num</code> consists of the digits '1' to '9', where each digit is used at most once.</li>
  <li>If <code>pattern[i] == 'I'</code>, then <code>num[i] < num[i + 1]</code>.</li>
  <li>If <code>pattern[i] == 'D'</code>, then <code>num[i] > num[i + 1]</code>.</li>
</ul>
<p>Return the lexicographically smallest possible string <code>num</code> that meets the conditions.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> pattern = "IIIDIDDD"
<strong>Output:</strong> "123549876"
<strong>Explanation:</strong>
At indices 0, 1, 2, and 4 we must have that num[i] < num[i+1].
At indices 3, 5, 6, and 7 we must have that num[i] > num[i+1].
Some possible values of num are "245639871", "135749862", and "123849765".
It can be proven that "123549876" is the smallest possible num that meets the conditions.
Note that "123414321" is not possible because the digit '1' is used more than once.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> pattern = "DDD"
<strong>Output:</strong> "4321"
<strong>Explanation:</strong>
Some possible values of num are "9876", "7321", and "8742".
It can be proven that "4321" is the smallest possible num that meets the conditions.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>1 <= <code>pattern.length</code> <= 8</li>
  <li><code>pattern</code> consists of only the letters 'I' and 'D'.</li>
</ul>
