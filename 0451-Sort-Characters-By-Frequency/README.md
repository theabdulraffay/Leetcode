<h2><a href="https://leetcode.com/problems/sort-characters-by-frequency">451. Sort Characters By Frequency</a></h2>
<h3>Medium</h3>
<hr>
<p>Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.</p>
<p>Return the sorted string. If there are multiple answers, return any of them.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> s = "tree"
<strong>Output:</strong> "eert"
<strong>Explanation:</strong> 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> s = "cccaaa"
<strong>Output:</strong> "aaaccc"
<strong>Explanation:</strong> Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
Note that "cacaca" is incorrect, as the same characters must be together.
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> s = "Aabb"
<strong>Output:</strong> "bbAa"
<strong>Explanation:</strong> "bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>1 <= s.length <= 5 * 10^5</li>
<li>s consists of uppercase and lowercase English letters and digits.</li>
</ul>
