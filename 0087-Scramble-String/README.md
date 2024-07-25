<h2><a href="https://leetcode.com/problems/scramble-string">87. Scramble String</a></h2>
<h3>Hard</h3>
<hr>
<p>We can scramble a string <code>s</code> to get a string <code>t</code> using the following algorithm:</p>
<ol>
  <li>If the length of the string is 1, stop.</li>
  <li>If the length of the string is &gt; 1, do the following:
    <ol>
      <li>Split the string into two non-empty substrings at a random index, i.e., if the string is <code>s</code>, divide it to <code>x</code> and <code>y</code> where <code>s = x + y</code>.</li>
      <li>Randomly decide to swap the two substrings or to keep them in the same order. i.e., after this step, <code>s</code> may become <code>s = x + y</code> or <code>s = y + x</code>.</li>
      <li>Apply step 1 recursively on each of the two substrings <code>x</code> and <code>y</code>.</li>
    </ol>
  </li>
</ol>
<p>Given two strings <code>s1</code> and <code>s2</code> of the same length, return true if <code>s2</code> is a scrambled string of <code>s1</code>, otherwise, return false.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> s1 = "great", s2 = "rgeat"
<strong>Output:</strong> true
<strong>Explanation:</strong> One possible scenario applied on s1 is:
"great" --> "gr/eat" // divide at random index.
"gr/eat" --> "gr/eat" // random decision is not to swap the two substrings and keep them in order.
"gr/eat" --> "g/r / e/at" // apply the same algorithm recursively on both substrings. divide at random index each of them.
"g/r / e/at" --> "r/g / e/at" // random decision was to swap the first substring and to keep the second substring in the same order.
"r/g / e/at" --> "r/g / e/ a/t" // again apply the algorithm recursively, divide "at" to "a/t".
"r/g / e/ a/t" --> "r/g / e/ a/t" // random decision is to keep both substrings in the same order.
The algorithm stops now, and the result string is "rgeat" which is s2.
As one possible scenario led s1 to be scrambled to s2, we return true.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> s1 = "abcde", s2 = "caebd"
<strong>Output:</strong> false
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> s1 = "a", s2 = "a"
<strong>Output:</strong> true
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>s1.length == s2.length</code></li>
  <li>1 ≤ <code>s1.length</code> ≤ 30</li>
  <li><code>s1</code> and <code>s2</code> consist of lowercase English letters.</li>
</ul>
