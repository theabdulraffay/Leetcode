<h2><a href="https://leetcode.com/problems/crawler-log-folder">1598. Crawler Log Folder</a></h2>
<h3>Easy</h3>
<hr>
<p>The Leetcode file system keeps a log each time some user performs a change folder operation.</p>
<p>The operations are described below:</p>
<ul>
    <li><code>"../"</code>: Move to the parent folder of the current folder. (If you are already in the main folder, remain in the same folder).</li>
    <li><code>"./"</code>: Remain in the same folder.</li>
    <li><code>"x/"</code>: Move to the child folder named x (This folder is guaranteed to always exist).</li>
</ul>
<p>You are given a list of strings <code>logs</code> where <code>logs[i]</code> is the operation performed by the user at the <code>i</code>th step.</p>
<p>The file system starts in the main folder, then the operations in <code>logs</code> are performed.</p>
<p>Return the minimum number of operations needed to go back to the main folder after the change folder operations.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> logs = ["d1/","d2/","../","d21/","./"]
<strong>Output:</strong> 2
<strong>Explanation:</strong> Use this change folder operation "../" 2 times and go back to the main folder.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> logs = ["d1/","d2/","./","d3/","../","d31/"]
<strong>Output:</strong> 3
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> logs = ["d1/","../","../","../"]
<strong>Output:</strong> 0
</pre>

<p><strong>Constraints:</strong></p>
<ul>
    <li>1 ≤ <code>logs.length</code> ≤ 10<sup>3</sup></li>
    <li>2 ≤ <code>logs[i].length</code> ≤ 10</li>
    <li><code>logs[i]</code> contains lowercase English letters, digits, '.', and '/'.</li>
    <li><code>logs[i]</code> follows the format described in the statement.</li>
    <li>Folder names consist of lowercase English letters and digits.</li>
</ul>
