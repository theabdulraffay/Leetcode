<h2><a href="https://leetcode.com/problems/uncommon-words-from-two-sentences">884. Uncommon Words from Two Sentences</a></h2>
<h3>Easy</h3>
<hr>
<p>A sentence is a string of single-space separated words where each word consists only of lowercase letters.</p>
<p>A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.</p>
<p>Given two sentences <code>s1</code> and <code>s2</code>, return a list of all the uncommon words. You may return the answer in any order.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> s1 = "this apple is sweet", s2 = "this apple is sour"
<strong>Output:</strong> ["sweet","sour"]
<strong>Explanation:</strong>
The word "sweet" appears only in s1, while the word "sour" appears only in s2.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> s1 = "apple apple", s2 = "banana"
<strong>Output:</strong> ["banana"]
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li><code>1 <= s1.length, s2.length <= 200</code></li>
<li><code>s1</code> and <code>s2</code> consist of lowercase English letters and spaces.</li>
<li><code>s1</code> and <code>s2</code> do not have leading or trailing spaces.</li>
<li>All the words in <code>s1</code> and <code>s2</code> are separated by a single space.</li>
</ul>
