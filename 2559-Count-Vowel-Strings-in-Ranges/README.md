<h2><a href="https://leetcode.com/problems/count-vowel-strings-in-ranges">2559. Count Vowel Strings in Ranges</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a 0-indexed array of strings <code>words</code> and a 2D array of integers <code>queries</code>.</p>
<p>Each query <code>queries[i] = [li, ri]</code> asks us to find the number of strings present in the range <code>li</code> to <code>ri</code> (both inclusive) of <code>words</code> that start and end with a vowel.</p>
<p>Return an array <code>ans</code> of size <code>queries.length</code>, where <code>ans[i]</code> is the answer to the <code>i<sup>th</sup></code> query.</p>
<p>Note that the vowel letters are <code>'a'</code>, <code>'e'</code>, <code>'i'</code>, <code>'o'</code>, and <code>'u'</code>.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> words = ["aba","bcb","ece","aa","e"], queries = [[0,2],[1,4],[1,1]]
<strong>Output:</strong> [2,3,0]
<strong>Explanation:</strong> 
The strings starting and ending with a vowel are "aba", "ece", "aa", and "e".
- The answer to the query [0,2] is 2 (strings "aba" and "ece").
- The answer to the query [1,4] is 3 (strings "ece", "aa", "e").
- The answer to the query [1,1] is 0.
We return [2,3,0].
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> words = ["a","e","i"], queries = [[0,2],[0,1],[2,2]]
<strong>Output:</strong> [3,2,1]
<strong>Explanation:</strong> Every string satisfies the conditions, so we return [3,2,1].
</pre>

<p><strong>Constraints:</strong></p>
<ul>
    <li><code>1 <= words.length <= 10<sup>5</sup></code></li>
    <li><code>1 <= words[i].length <= 40</code></li>
    <li><code>words[i]</code> consists only of lowercase English letters.</li>
    <li><code>sum(words[i].length) <= 3 * 10<sup>5</sup></code></li>
    <li><code>1 <= queries.length <= 10<sup>5</sup></code></li>
    <li><code>0 <= li <= ri < words.length</code></li>
</ul>
