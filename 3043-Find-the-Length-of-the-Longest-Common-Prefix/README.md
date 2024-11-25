<h2><a href="https://leetcode.com/problems/find-the-length-of-the-longest-common-prefix">3043. Find the Length of the Longest Common Prefix</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given two arrays with positive integers <code>arr1</code> and <code>arr2</code>.</p>
<p>A prefix of a positive integer is an integer formed by one or more of its digits, starting from its leftmost digit. For example, <code>123</code> is a prefix of the integer <code>12345</code>, while <code>234</code> is not.</p>
<p>A common prefix of two integers <code>a</code> and <code>b</code> is an integer <code>c</code>, such that <code>c</code> is a prefix of both <code>a</code> and <code>b</code>. For example, <code>5655359</code> and <code>56554</code> have common prefixes <code>565</code> and <code>5655</code>, while <code>1223</code> and <code>43456</code> do not have a common prefix.</p>

<p>You need to find the length of the longest common prefix between all pairs of integers (<code>x, y</code>) such that <code>x</code> belongs to <code>arr1</code> and <code>y</code> belongs to <code>arr2</code>.</p>

<p>Return the length of the longest common prefix among all pairs. If no common prefix exists among them, return <code>0</code>.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> arr1 = [1,10,100], arr2 = [1000]
<strong>Output:</strong> 3
<strong>Explanation:</strong> There are 3 pairs (<code>arr1[i]</code>, <code>arr2[j]</code>):
- The longest common prefix of (1, 1000) is 1.
- The longest common prefix of (10, 1000) is 10.
- The longest common prefix of (100, 1000) is 100.
The longest common prefix is 100 with a length of 3.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> arr1 = [1,2,3], arr2 = [4,4,4]
<strong>Output:</strong> 0
<strong>Explanation:</strong> There exists no common prefix for any pair (<code>arr1[i]</code>, <code>arr2[j]</code>), hence we return 0.
Note that common prefixes between elements of the same array do not count.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 <= arr1.length, arr2.length <= 5 * 10<sup>4</sup></code></li>
  <li><code>1 <= arr1[i], arr2[i] <= 10<sup>8</sup></code></li>
</ul>
