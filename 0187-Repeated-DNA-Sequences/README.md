<h2><a href="https://leetcode.com/problems/repeated-dna-sequences">187. Repeated DNA Sequences</a></h2>
<h3>Medium</h3>
<hr>
<p>The DNA sequence is composed of a series of nucleotides abbreviated as 'A', 'C', 'G', and 'T'.</p>

<p>For example, <code>"ACGAATTCCG"</code> is a DNA sequence. When studying DNA, it is useful to identify repeated sequences within the DNA.</p>

<p>Given a string <code>s</code> that represents a DNA sequence, return all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule. You may return the answer in any order.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
<strong>Output:</strong> ["AAAAACCCCC","CCCCCAAAAA"]
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> s = "AAAAAAAAAAAAA"
<strong>Output:</strong> ["AAAAAAAAAA"]
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ <code>s.length</code> ≤ 10<sup>5</sup></li>
<li><code>s[i]</code> is either 'A', 'C', 'G', or 'T'.</li>
</ul>
