<h2><a href="https://leetcode.com/problems/group-anagrams">49. Group Anagrams</a></h2>
<h3>Medium</h3>
<hr>
<p>Given an array of strings <code>strs</code>, group the anagrams together. You can return the answer in any order.</p>

<p>An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> strs = ["eat","tea","tan","ate","nat","bat"]
<strong>Output:</strong> [["bat"],["nat","tan"],["ate","eat","tea"]]
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> strs = [""]
<strong>Output:</strong> [[""]]
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> strs = ["a"]
<strong>Output:</strong> [["a"]]
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li>1 ≤ <code>strs.length</code> ≤ 10<sup>4</sup></li>
  <li>0 ≤ <code>strs[i].length</code> ≤ 100</li>
  <li><code>strs[i]</code> consists of lowercase English letters.</li>
</ul>
