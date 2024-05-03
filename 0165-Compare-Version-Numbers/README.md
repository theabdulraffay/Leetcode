<h2><a href="https://leetcode.com/problems/compare-version-numbers">165. Compare Version Numbers</a></h2>
<h3>Medium</h3>
<hr>
<p>Given two version numbers, version1 and version2, compare them.</p>
<p>Version numbers consist of one or more revisions joined by a dot '.'. Each revision consists of digits and may contain leading zeros. Every revision contains at least one character. Revisions are 0-indexed from left to right, with the leftmost revision being revision 0, the next revision being revision 1, and so on. For example 2.5.33 and 0.1 are valid version numbers.</p>
<p>To compare version numbers, compare their revisions in left-to-right order. Revisions are compared using their integer value ignoring any leading zeros. This means that revisions 1 and 001 are considered equal. If a version number does not specify a revision at an index, then treat the revision as 0. For example, version 1.0 is less than version 1.1 because their revision 0s are the same, but their revision 1s are 0 and 1 respectively, and 0 < 1.</p>
<p>Return the following:</p>
<ul>
<li>If version1 < version2, return -1.</li>
<li>If version1 > version2, return 1.</li>
<li>Otherwise, return 0.</li>
</ul>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> version1 = "1.01", version2 = "1.001"
<strong>Output:</strong> 0
<strong>Explanation:</strong> Ignoring leading zeroes, both "01" and "001" represent the same integer "1".
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> version1 = "1.0", version2 = "1.0.0"
<strong>Output:</strong> 0
<strong>Explanation:</strong> version1 does not specify revision 2, which means it is treated as "0".
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> version1 = "0.1", version2 = "1.1"
<strong>Output:</strong> -1
<strong>Explanation:</strong> version1's revision 0 is "0", while version2's revision 0 is "1". 0 < 1, so version1 < version2.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>1 <= version1.length, version2.length <= 500</li>
<li>version1 and version2 only contain digits and '.'.</li>
<li>version1 and version2 are valid version numbers.</li>
<li>All the given revisions in version1 and version2 can be stored in a 32-bit integer.</li>
</ul>
