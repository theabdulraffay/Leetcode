<h2><a href="https://leetcode.com/problems/construct-the-lexicographically-largest-valid-sequence">1718. Construct the Lexicographically Largest Valid Sequence</a></h2>
<h3>Medium</h3>
<hr>
<p>Given an integer <code>n</code>, find a sequence that satisfies all of the following:</p>
<ul>
  <li>The integer 1 occurs once in the sequence.</li>
  <li>Each integer between 2 and <code>n</code> occurs twice in the sequence.</li>
  <li>For every integer <code>i</code> between 2 and <code>n</code>, the distance between the two occurrences of <code>i</code> is exactly <code>i</code>.</li>
</ul>
<p>The distance between two numbers on the sequence, <code>a[i]</code> and <code>a[j]</code>, is the absolute difference of their indices, <code>|j - i|</code>.</p>
<p>Return the lexicographically largest sequence. It is guaranteed that under the given constraints, there is always a solution.</p>
<p>A sequence <code>a</code> is lexicographically larger than a sequence <code>b</code> (of the same length) if in the first position where <code>a</code> and <code>b</code> differ, sequence <code>a</code> has a number greater than the corresponding number in <code>b</code>. For example, <code>[0,1,9,0]</code> is lexicographically larger than <code>[0,1,5,6]</code> because the first position they differ is at the third number, and 9 is greater than 5.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> n = 3
<strong>Output:</strong> [3,1,2,3,2]
<strong>Explanation:</strong> [2,3,2,1,3] is also a valid sequence, but [3,1,2,3,2] is the lexicographically largest valid sequence.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> n = 5
<strong>Output:</strong> [5,3,1,4,3,5,2,4,2]
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>1 <= <code>n</code> <= 20</li>
</ul>
