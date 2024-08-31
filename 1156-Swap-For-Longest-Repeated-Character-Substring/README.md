<h2><a href="https://leetcode.com/problems/swap-for-longest-repeated-character-substring">1156. Swap For Longest Repeated Character Substring</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a string <code>text</code>. You can swap two of the characters in the text.</p>
<p>Return the length of the longest substring with repeated characters.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> text = "ababa"
<strong>Output:</strong> 3
<strong>Explanation:</strong> We can swap the first 'b' with the last 'a', or the last 'b' with the first 'a'. Then, the longest repeated character substring is "aaa" with length 3.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> text = "aaabaaa"
<strong>Output:</strong> 6
<strong>Explanation:</strong> Swap 'b' with the last 'a' (or the first 'a'), and we get longest repeated character substring "aaaaaa" with length 6.
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> text = "aaaaa"
<strong>Output:</strong> 5
<strong>Explanation:</strong> No need to swap, longest repeated character substring is "aaaaa" with length is 5.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ <code>text.length</code> ≤ 2 * 10<sup>4</sup></li>
<li><code>text</code> consists of lowercase English characters only.</li>
</ul>
