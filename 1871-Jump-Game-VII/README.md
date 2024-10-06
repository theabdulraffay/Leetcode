<h2><a href="https://leetcode.com/problems/jump-game-vii">1871. Jump Game VII</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a 0-indexed binary string <code>s</code> and two integers <code>minJump</code> and <code>maxJump</code>. In the beginning, you are standing at index <code>0</code>, which is equal to <code>'0'</code>. You can move from index <code>i</code> to index <code>j</code> if the following conditions are fulfilled:</p>

<ul>
  <li><code>i + minJump <= j <= min(i + maxJump, s.length - 1)</code>, and</li>
  <li><code>s[j] == '0'</code>.</li>
</ul>

<p>Return <code>true</code> if you can reach index <code>s.length - 1</code> in <code>s</code>, or <code>false</code> otherwise.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> s = "011010", minJump = 2, maxJump = 3
<strong>Output:</strong> true
<strong>Explanation:</strong>
In the first step, move from index 0 to index 3. 
In the second step, move from index 3 to index 5.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> s = "01101110", minJump = 2, maxJump = 3
<strong>Output:</strong> false
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>2 <= s.length <= 10<sup>5</sup></code></li>
  <li><code>s[i]</code> is either <code>'0'</code> or <code>'1'</code>.</li>
  <li><code>s[0] == '0'</code></li>
  <li><code>1 <= minJump <= maxJump < s.length</code></li>
</ul>
