<h2><a href="https://leetcode.com/problems/find-the-count-of-good-integers">3272. Find the Count of Good Integers</a></h2>
<h3>Hard</h3>
<hr>
<p>You are given two positive integers <code>n</code> and <code>k</code>.</p>
<p>An integer <code>x</code> is called <code>k</code>-palindromic if:</p>
<ul>
  <li><code>x</code> is a palindrome.</li>
  <li><code>x</code> is divisible by <code>k</code>.</li>
</ul>
<p>An integer is called good if its digits can be rearranged to form a <code>k</code>-palindromic integer. For example, for <code>k = 2</code>, 2020 can be rearranged to form the <code>k</code>-palindromic integer 2002, whereas 1010 cannot be rearranged to form a <code>k</code>-palindromic integer.</p>
<p>Return the count of good integers containing <code>n</code> digits.</p>
<p>Note that any integer must not have leading zeros, neither before nor after rearrangement. For example, 1010 cannot be rearranged to form 101.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> n = 3, k = 5
<strong>Output:</strong> 27
<strong>Explanation:</strong>
Some of the good integers are:
- 551 because it can be rearranged to form 515.
- 525 because it is already k-palindromic.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> n = 1, k = 4
<strong>Output:</strong> 2
<strong>Explanation:</strong>
The two good integers are 4 and 8.
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> n = 5, k = 6
<strong>Output:</strong> 2468
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>1 <= <code>n</code> <= 10</li>
  <li>1 <= <code>k</code> <= 9</li>
</ul>
