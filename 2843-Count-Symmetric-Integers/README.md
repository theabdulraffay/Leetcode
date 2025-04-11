<h2><a href="https://leetcode.com/problems/count-symmetric-integers">2843. Count Symmetric Integers</a></h2>
<h3>Easy</h3>
<hr>
<p>You are given two positive integers <code>low</code> and <code>high</code>.</p>
<p>An integer <code>x</code> consisting of <code>2 * n</code> digits is symmetric if the sum of the first <code>n</code> digits of <code>x</code> is equal to the sum of the last <code>n</code> digits of <code>x</code>. Numbers with an odd number of digits are never symmetric.</p>
<p>Return the number of symmetric integers in the range <code>[low, high]</code>.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> low = 1, high = 100
<strong>Output:</strong> 9
<strong>Explanation:</strong> There are 9 symmetric integers between 1 and 100: 11, 22, 33, 44, 55, 66, 77, 88, and 99.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> low = 1200, high = 1230
<strong>Output:</strong> 4
<strong>Explanation:</strong> There are 4 symmetric integers between 1200 and 1230: 1203, 1212, 1221, and 1230.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>1 <= <code>low</code> <= <code>high</code> <= 10<sup>4</sup></li>
</ul>
