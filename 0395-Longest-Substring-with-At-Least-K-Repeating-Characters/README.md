<h2><a href="https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters">395. Longest Substring with At Least K Repeating Characters</a></h2>
<h3>Medium</h3>
<hr>
<p>Given a string <code>s</code> and an integer <code>k</code>, return the length of the longest substring of <code>s</code> such that the frequency of each character in this substring is greater than or equal to <code>k</code>.</p>
<p>If no such substring exists, return <code>0</code>.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> s = "aaabb", k = 3
<strong>Output:</strong> 3
<strong>Explanation:</strong> The longest substring is "aaa", as 'a' is repeated 3 times.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> s = "ababbc", k = 2
<strong>Output:</strong> 5
<strong>Explanation:</strong> The longest substring is "ababb", as 'a' is repeated 2 times and 'b' is repeated 3 times.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li><code>1 <= s.length <= 10<sup>4</sup></code></li>
<li><code>s</code> consists of only lowercase English letters.</li>
<li><code>1 <= k <= 10<sup>5</sup></code></li>
</ul>
