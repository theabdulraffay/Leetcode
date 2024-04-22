<h2><a href="https://leetcode.com/problems/count-the-number-of-special-characters-ii">3121. Count the Number of Special Characters II</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a string word. A letter c is called special if it appears both in lowercase and uppercase in word, and every lowercase occurrence of c appears before the first uppercase occurrence of c.</p>
<p>Return the number of special letters in word.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> word = "aaAbcBC"
<strong>Output:</strong> 3
<strong>Explanation:</strong>
The special characters are 'a', 'b', and 'c'.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> word = "abc"
<strong>Output:</strong> 0
<strong>Explanation:</strong>
There are no special characters in word.
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> word = "AbBCab"
<strong>Output:</strong> 0
<strong>Explanation:</strong>
There are no special characters in word.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>1 <= word.length <= 2 * 10^5</li>
<li>word consists of only lowercase and uppercase English letters.</li>
</ul>
