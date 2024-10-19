<h2><a href="https://leetcode.com/problems/find-kth-bit-in-nth-binary-string">1545. Find Kth Bit in Nth Binary String</a></h2>
<h3>Medium</h3>
<hr>
<p>Given two positive integers <code>n</code> and <code>k</code>, the binary string <code>S<sub>n</sub></code> is formed as follows:</p>

<ul>
  <li><code>S<sub>1</sub> = "0"</code></li>
  <li><code>S<sub>i</sub> = S<sub>i-1</sub> + "1" + reverse(invert(S<sub>i-1</sub>))</code> for <code>i > 1</code></li>
</ul>

<p>Where + denotes the concatenation operation, <code>reverse(x)</code> returns the reversed string <code>x</code>, and <code>invert(x)</code> inverts all the bits in <code>x</code> (0 changes to 1 and 1 changes to 0).</p>

<p>For example, the first four strings in the above sequence are:</p>
<ul>
  <li><code>S<sub>1</sub> = "0"</code></li>
  <li><code>S<sub>2</sub> = "011"</code></li>
  <li><code>S<sub>3</sub> = "0111001"</code></li>
  <li><code>S<sub>4</sub> = "011100110110001"</code></li>
</ul>

<p>Return the <code>k</code>th bit in <code>S<sub>n</sub></code>. It is guaranteed that <code>k</code> is valid for the given <code>n</code>.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> n = 3, k = 1
<strong>Output:</strong> "0"
<strong>Explanation:</strong> S<sub>3</sub> is "0111001". The 1st bit is "0".
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> n = 4, k = 11
<strong>Output:</strong> "1"
<strong>Explanation:</strong> S<sub>4</sub> is "011100110110001". The 11th bit is "1".
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 <= n <= 20</code></li>
  <li><code>1 <= k <= 2<sup>n</sup> - 1</code></li>
</ul>
