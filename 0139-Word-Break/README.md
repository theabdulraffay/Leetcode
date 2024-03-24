<h2><a href="https://leetcode.com/problems/word-break/description/">139. Word Break</a></h2>
<h3>Medium</h3>
<hr>
<p>Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.</p>
<p>Note that the same word in the dictionary may be reused multiple times in the segmentation.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> s = "leetcode", wordDict = ["leet","code"]
<strong>Output:</strong> true
<strong>Explanation:</strong> Return true because "leetcode" can be segmented as "leet code".
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> s = "applepenapple", wordDict = ["apple","pen"]
<strong>Output:</strong> true
<strong>Explanation:</strong> Return true because "applepenapple" can be segmented as "apple pen apple".
Note that you are allowed to reuse a dictionary word.
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
<strong>Output:</strong> false
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>1 <= s.length <= 300</li>
  <li>1 <= wordDict.length <= 1000</li>
  <li>1 <= wordDict[i].length <= 20</li>
  <li>s and wordDict[i] consist of only lowercase English letters.</li>
  <li>All the strings of wordDict are unique.</li>
</ul>
