<h2><a href="https://leetcode.com/problems/maximum-length-of-a-concatenated-string-with-unique-characters">1239. Maximum Length of a Concatenated String with Unique Characters</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given an array of strings <code>arr</code>. A string <code>s</code> is formed by the concatenation of a subsequence of <code>arr</code> that has unique characters.</p>
<p>Return the maximum possible length of <code>s</code>.</p>
<p>A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> arr = ["un","iq","ue"]
<strong>Output:</strong> 4
<strong>Explanation:</strong> All the valid concatenations are:
- ""
- "un"
- "iq"
- "ue"
- "uniq" ("un" + "iq")
- "ique" ("iq" + "ue")
Maximum length is 4.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> arr = ["cha","r","act","ers"]
<strong>Output:</strong> 6
<strong>Explanation:</strong> Possible longest valid concatenations are "chaers" ("cha" + "ers") and "acters" ("act" + "ers").
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> arr = ["abcdefghijklmnopqrstuvwxyz"]
<strong>Output:</strong> 26
<strong>Explanation:</strong> The only string in <code>arr</code> has all 26 characters.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 <= arr.length <= 16</code></li>
  <li><code>1 <= arr[i].length <= 26</code></li>
  <li><code>arr[i]</code> contains only lowercase English letters.</li>
</ul>
