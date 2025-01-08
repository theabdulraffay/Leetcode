<h2><a href="https://leetcode.com/problems/gray-code">89. Gray Code</a></h2>
<h3>Medium</h3>
<hr>
<p>An <code>n</code>-bit Gray code sequence is a sequence of <code>2<sup>n</sup></code> integers where:</p>
<ul>
<li>Every integer is in the inclusive range [0, <code>2<sup>n</sup> - 1</code>],</li>
<li>The first integer is <code>0</code>,</li>
<li>An integer appears no more than once in the sequence,</li>
<li>The binary representation of every pair of adjacent integers differs by exactly one bit, and</li>
<li>The binary representation of the first and last integers differs by exactly one bit.</li>
</ul>

<p>Given an integer <code>n</code>, return any valid <code>n</code>-bit Gray code sequence.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> n = 2
<strong>Output:</strong> [0,1,3,2]
<strong>Explanation:</strong> 
The binary representation of [0,1,3,2] is [00,01,11,10].
- 00 and 01 differ by one bit
- 01 and 11 differ by one bit
- 11 and 10 differ by one bit
- 10 and 00 differ by one bit
[0,2,3,1] is also a valid Gray code sequence, whose binary representation is [00,10,11,01].
- 00 and 10 differ by one bit
- 10 and 11 differ by one bit
- 11 and 01 differ by one bit
- 01 and 00 differ by one bit
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> n = 1
<strong>Output:</strong> [0,1]
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li><code>1 <= n <= 16</code></li>
</ul>
