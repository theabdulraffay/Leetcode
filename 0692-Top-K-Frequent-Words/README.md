<h2><a href="https://leetcode.com/problems/top-k-frequent-words">692. Top K Frequent Words</a></h2>
<h3>Medium</h3>
<hr>
<p>Given an array of strings <code>words</code> and an integer <code>k</code>, return the <code>k</code> most frequent strings.</p>
<p>Return the answer sorted by the frequency from highest to lowest. Sort the words with the same frequency by their lexicographical order.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> words = ["i","love","leetcode","i","love","coding"], k = 2
<strong>Output:</strong> ["i","love"]
<strong>Explanation:</strong> "i" and "love" are the two most frequent words.
Note that "i" comes before "love" due to a lower alphabetical order.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> words = ["the","day","is","sunny","the","the","the","sunny","is","is"], k = 4
<strong>Output:</strong> ["the","is","sunny","day"]
<strong>Explanation:</strong> "the", "is", "sunny" and "day" are the four most frequent words, with the number of occurrences being 4, 3, 2, and 1 respectively.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ <code>words.length</code> ≤ 500</li>
<li>1 ≤ <code>words[i].length</code> ≤ 10</li>
<li><code>words[i]</code> consists of lowercase English letters.</li>
<li><code>k</code> is in the range [1, The number of unique <code>words[i]</code>].</li>
</ul>

<p><strong>Follow-up:</strong> Could you solve it in O(n log(k)) time and O(n) extra space?</p>
