<h2><a href="https://leetcode.com/problems/count-the-number-of-powerful-integers">2999. Count the Number of Powerful Integers</a></h2>
<h3>Hard</h3>
<hr>
<p>You are given three integers <code>start</code>, <code>finish</code>, and <code>limit</code>. You are also given a 0-indexed string <code>s</code> representing a positive integer.</p>
<p>A positive integer <code>x</code> is called powerful if it ends with <code>s</code> (in other words, <code>s</code> is a suffix of <code>x</code>) and each digit in <code>x</code> is at most <code>limit</code>.</p>
<p>Return the total number of powerful integers in the range <code>[start..finish]</code>.</p>
<p>A string <code>x</code> is a suffix of a string <code>y</code> if and only if <code>x</code> is a substring of <code>y</code> that starts from some index (including 0) in <code>y</code> and extends to the index <code>y.length - 1</code>. For example, 25 is a suffix of 5125 whereas 512 is not.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> start = 1, finish = 6000, limit = 4, s = "124"
<strong>Output:</strong> 5
<strong>Explanation:</strong> The powerful integers in the range [1..6000] are 124, 1124, 2124, 3124, and 4124. All these integers have each digit <= 4, and "124" as a suffix. Note that 5124 is not a powerful integer because the first digit is 5 which is greater than 4.
It can be shown that there are only 5 powerful integers in this range.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> start = 15, finish = 215, limit = 6, s = "10"
<strong>Output:</strong> 2
<strong>Explanation:</strong> The powerful integers in the range [15..215] are 110 and 210. All these integers have each digit <= 6, and "10" as a suffix.
It can be shown that there are only 2 powerful integers in this range.
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> start = 1000, finish = 2000, limit = 4, s = "3000"
<strong>Output:</strong> 0
<strong>Explanation:</strong> All integers in the range [1000..2000] are smaller than 3000, hence "3000" cannot be a suffix of any integer in this range.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>1 <= <code>start</code> <= <code>finish</code> <= 10<sup>15</sup></li>
  <li>1 <= <code>limit</code> <= 9</li>
  <li>1 <= <code>s.length</code> <= floor(log10(finish)) + 1</li>
  <li><code>s</code> only consists of numeric digits which are at most <code>limit</code>.</li>
  <li><code>s</code> does not have leading zeros.</li>
</ul>
