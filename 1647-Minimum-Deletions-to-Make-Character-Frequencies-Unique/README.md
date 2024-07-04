<h2><a href="https://leetcode.com/problems/minimum-deletions-to-make-character-frequencies-unique">1647. Minimum Deletions to Make Character Frequencies Unique</a></h2>
<h3>Medium</h3>
<hr>
<p>A string <code>s</code> is called good if there are no two different characters in <code>s</code> that have the same frequency.</p>

<p>Given a string <code>s</code>, return the minimum number of characters you need to delete to make <code>s</code> good.</p>

<p>The frequency of a character in a string is the number of times it appears in the string. For example, in the string <code>"aab"</code>, the frequency of 'a' is 2, while the frequency of 'b' is 1.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> s = "aab"
<strong>Output:</strong> 0
<strong>Explanation:</strong> s is already good.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> s = "aaabbbcc"
<strong>Output:</strong> 2
<strong>Explanation:</strong> You can delete two 'b's resulting in the good string "aaabcc".
Another way is to delete one 'b' and one 'c' resulting in the good string "aaabbc".
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> s = "ceabaacb"
<strong>Output:</strong> 2
<strong>Explanation:</strong> You can delete both 'c's resulting in the good string "eabaab".
Note that we only care about characters that are still in the string at the end (i.e., frequency of 0 is ignored).
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ <code>s.length</code> ≤ 10<sup>5</sup></li>
<li><code>s</code> contains only lowercase English letters.</li>
</ul>
