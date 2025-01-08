<h2><a href="https://leetcode.com/problems/edit-distance">72. Edit Distance</a></h2>
<h3>Medium</h3>
<hr>
<p>Given two strings <code>word1</code> and <code>word2</code>, return the minimum number of operations required to convert <code>word1</code> to <code>word2</code>.</p>

<p>You have the following three operations permitted on a word:</p>
<ul>
  <li>Insert a character</li>
  <li>Delete a character</li>
  <li>Replace a character</li>
</ul>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> word1 = "horse", word2 = "ros"
<strong>Output:</strong> 3
<strong>Explanation:</strong> 
horse -> rorse (replace 'h' with 'r')
rorse -> rose (remove 'r')
rose -> ros (remove 'e')
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> word1 = "intention", word2 = "execution"
<strong>Output:</strong> 5
<strong>Explanation:</strong> 
intention -> inention (remove 't')
inention -> enention (replace 'i' with 'e')
enention -> exention (replace 'n' with 'x')
exention -> exection (replace 'n' with 'c')
exection -> execution (insert 'u')
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>0 <= word1.length, word2.length <= 500</code></li>
  <li><code>word1</code> and <code>word2</code> consist of lowercase English letters.</li>
</ul>
