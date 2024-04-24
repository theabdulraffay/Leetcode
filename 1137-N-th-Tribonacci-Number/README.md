<h2><a href="https://leetcode.com/problems/n-th-tribonacci-number">1137. N-th Tribonacci Number</a></h2>
<h3>Easy</h3>
<hr>
<p>The Tribonacci sequence Tn is defined as follows:</p>
<blockquote>
T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
</blockquote>
<p>Given n, return the value of Tn.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> n = 4
<strong>Output:</strong> 4
<strong>Explanation:</strong>
T<sub>3</sub> = 0 + 1 + 1 = 2
T<sub>4</sub> = 1 + 1 + 2 = 4
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> n = 25
<strong>Output:</strong> 1389537
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>0 <= n <= 37</li>
<li>The answer is guaranteed to fit within a 32-bit integer, ie. answer <= 2^31 - 1.</li>
</ul>
