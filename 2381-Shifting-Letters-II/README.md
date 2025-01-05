<h2><a href="https://leetcode.com/problems/shifting-letters-ii">2381. Shifting Letters II</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a string <code>s</code> of lowercase English letters and a 2D integer array <code>shifts</code> where <code>shifts[i] = [start<sub>i</sub>, end<sub>i</sub>, direction<sub>i</sub>]</code>. For every <code>i</code>, shift the characters in <code>s</code> from the index <code>start<sub>i</sub></code> to the index <code>end<sub>i</sub></code> (inclusive) forward if <code>direction<sub>i</sub> = 1</code>, or shift the characters backward if <code>direction<sub>i</sub> = 0</code>.</p>

<p>Shifting a character forward means replacing it with the next letter in the alphabet (wrapping around so that <code>'z'</code> becomes <code>'a'</code>). Similarly, shifting a character backward means replacing it with the previous letter in the alphabet (wrapping around so that <code>'a'</code> becomes <code>'z'</code>).</p>

<p>Return the final string after all such shifts to <code>s</code> are applied.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> s = "abc", shifts = [[0,1,0],[1,2,1],[0,2,1]]
<strong>Output:</strong> "ace"
<strong>Explanation:</strong> 
1. Shift the characters from index 0 to index 1 backward. Now s = "zac".
2. Shift the characters from index 1 to index 2 forward. Now s = "zbd".
3. Shift the characters from index 0 to index 2 forward. Now s = "ace".
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> s = "dztz", shifts = [[0,0,0],[1,1,1]]
<strong>Output:</strong> "catz"
<strong>Explanation:</strong> 
1. Shift the characters from index 0 to index 0 backward. Now s = "cztz".
2. Shift the characters from index 1 to index 1 forward. Now s = "catz".
</pre>

<p><strong>Constraints:</strong></p>
<ul>
    <li><code>1 <= s.length, shifts.length <= 5 * 10<sup>4</sup></code></li>
    <li><code>shifts[i].length == 3</code></li>
    <li><code>0 <= start<sub>i</sub> <= end<sub>i</sub> < s.length</code></li>
    <li><code>0 <= direction<sub>i</sub> <= 1</code></li>
    <li><code>s</code> consists of lowercase English letters.</li>
</ul>
