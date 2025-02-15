<h2><a href="https://leetcode.com/problems/find-the-punishment-number-of-an-integer">2698. Find the Punishment Number of an Integer</a></h2>
<h3>Medium</h3>
<hr>
<p>Given a positive integer <code>n</code>, return the punishment number of <code>n</code>.</p>
<p>The punishment number of <code>n</code> is defined as the sum of the squares of all integers <code>i</code> such that:</p>
<ul>
  <li>1 <= <code>i</code> <= <code>n</code></li>
  <li>The decimal representation of <code>i * i</code> can be partitioned into contiguous substrings such that the sum of the integer values of these substrings equals <code>i</code>.</li>
</ul>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> n = 10
<strong>Output:</strong> 182
<strong>Explanation:</strong> There are exactly 3 integers i in the range [1, 10] that satisfy the conditions in the statement:
- 1 since 1 * 1 = 1
- 9 since 9 * 9 = 81 and 81 can be partitioned into 8 and 1 with a sum equal to 8 + 1 == 9.
- 10 since 10 * 10 = 100 and 100 can be partitioned into 10 and 0 with a sum equal to 10 + 0 == 10.
Hence, the punishment number of 10 is 1 + 81 + 100 = 182
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> n = 37
<strong>Output:</strong> 1478
<strong>Explanation:</strong> There are exactly 4 integers i in the range [1, 37] that satisfy the conditions in the statement:
- 1 since 1 * 1 = 1.
- 9 since 9 * 9 = 81 and 81 can be partitioned into 8 + 1.
- 10 since 10 * 10 = 100 and 100 can be partitioned into 10 + 0.
- 36 since 36 * 36 = 1296 and 1296 can be partitioned into 1 + 29 + 6.
Hence, the punishment number of 37 is 1 + 81 + 100 + 1296 = 1478
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>1 <= <code>n</code> <= 1000</li>
</ul>
