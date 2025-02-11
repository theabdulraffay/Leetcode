<h2><a href="https://leetcode.com/problems/remove-all-occurrences-of-a-substring">1910. Remove All Occurrences of a Substring</a></h2>
<h3>Medium</h3>
<hr>
<p>Given two strings <code>s</code> and <code>part</code>, perform the following operation on <code>s</code> until all occurrences of the substring <code>part</code> are removed:</p>
<ul>
  <li>Find the leftmost occurrence of the substring <code>part</code> and remove it from <code>s</code>.</li>
</ul>
<p>Return <code>s</code> after removing all occurrences of <code>part</code>.</p>
<p>A substring is a contiguous sequence of characters in a string.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> s = "daabcbaabcbc", part = "abc"
<strong>Output:</strong> "dab"
<strong>Explanation:</strong> The following operations are done:
- s = "daabcbaabcbc", remove "abc" starting at index 2, so s = "dabaabcbc".
- s = "dabaabcbc", remove "abc" starting at index 4, so s = "dababc".
- s = "dababc", remove "abc" starting at index 3, so s = "dab".
Now s has no occurrences of "abc".
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> s = "axxxxyyyyb", part = "xy"
<strong>Output:</strong> "ab"
<strong>Explanation:</strong> The following operations are done:
- s = "axxxxyyyyb", remove "xy" starting at index 4 so s = "axxxyyyb".
- s = "axxxyyyb", remove "xy" starting at index 3 so s = "axxyyb".
- s = "axxyyb", remove "xy" starting at index 2 so s = "axyb".
- s = "axyb", remove "xy" starting at index 1 so s = "ab".
Now s has no occurrences of "xy".
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>1 <= <code>s.length</code> <= 1000</li>
  <li>1 <= <code>part.length</code> <= 1000</li>
  <li><code>s</code> and <code>part</code> consist of lowercase English letters.</li>
</ul>
