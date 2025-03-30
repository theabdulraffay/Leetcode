<h2><a href="https://leetcode.com/problems/partition-labels">763. Partition Labels</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a string <code>s</code>. We want to partition the string into as many parts as possible so that each letter appears in at most one part. For example, the string "ababcc" can be partitioned into ["abab", "cc"], but partitions such as ["aba", "bcc"] or ["ab", "ab", "cc"] are invalid.</p>
<p>Note that the partition is done so that after concatenating all the parts in order, the resultant string should be <code>s</code>.</p>
<p>Return a list of integers representing the size of these parts.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> s = "ababcbacadefegdehijhklij"
<strong>Output:</strong> [9,7,8]
<strong>Explanation:</strong>
The partition is "ababcbaca", "defegde", "hijhklij".
This is a partition so that each letter appears in at most one part.
A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits s into less parts.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> s = "eccbbbbdec"
<strong>Output:</strong> [10]
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>1 <= <code>s.length</code> <= 500</li>
  <li><code>s</code> consists of lowercase English letters.</li>
</ul>
