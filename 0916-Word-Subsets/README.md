
<h2><a href="https://leetcode.com/problems/word-subsets">916. Word Subsets</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given two string arrays <code>words1</code> and <code>words2</code>.</p>

<p>A string <code>b</code> is a subset of string <code>a</code> if every letter in <code>b</code> occurs in <code>a</code> including multiplicity.</p>

<p>For example, <code>"wrr"</code> is a subset of <code>"warrior"</code> but is not a subset of <code>"world"</code>.</p>

<p>A string <code>a</code> from <code>words1</code> is universal if for every string <code>b</code> in <code>words2</code>, <code>b</code> is a subset of <code>a</code>.</p>

<p>Return an array of all the universal strings in <code>words1</code>. You may return the answer in any order.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> words1 = ["amazon","apple","facebook","google","leetcode"], words2 = ["e","o"]
<strong>Output:</strong> ["facebook","google","leetcode"]
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> words1 = ["amazon","apple","facebook","google","leetcode"], words2 = ["l","e"]
<strong>Output:</strong> ["apple","google","leetcode"]
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li>1 ≤ <code>words1.length</code>, <code>words2.length</code> ≤ 10<sup>4</sup></li>
  <li>1 ≤ <code>words1[i].length</code>, <code>words2[i].length</code> ≤ 10</li>
  <li><code>words1[i]</code> and <code>words2[i]</code> consist only of lowercase English letters.</li>
  <li>All the strings of <code>words1</code> are unique.</li>
</ul>
