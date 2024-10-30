<h2><a href="https://leetcode.com/problems/simplify-path">71. Simplify Path</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given an absolute path for a Unix-style file system, which always begins with a slash <code>'/'</code>. Your task is to transform this absolute path into its simplified canonical path.</p>

<p>The rules of a Unix-style file system are as follows:</p>
<ul>
  <li>A single period <code>'.'</code> represents the current directory.</li>
  <li>A double period <code>'..'</code> represents the previous/parent directory.</li>
  <li>Multiple consecutive slashes (e.g., <code>'//'</code> and <code>'///'</code>) are treated as a single slash <code>'/'</code>.</li>
  <li>Any sequence of periods that does not match the rules above should be treated as a valid directory or file name. For example, <code>'...'</code> and <code>'....'</code> are valid directory or file names.</li>
</ul>

<p>The simplified canonical path should follow these rules:</p>
<ul>
  <li>The path must start with a single slash <code>'/'</code>.</li>
  <li>Directories within the path must be separated by exactly one slash <code>'/'</code>.</li>
  <li>The path must not end with a slash <code>'/'</code>, unless it is the root directory.</li>
  <li>The path must not have any single or double periods ('.' and '..') used to denote current or parent directories.</li>
</ul>
<p>Return the simplified canonical path.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> path = "/home/"
<strong>Output:</strong> "/home"
<strong>Explanation:</strong> The trailing slash should be removed.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> path = "/home//foo/"
<strong>Output:</strong> "/home/foo"
<strong>Explanation:</strong> Multiple consecutive slashes are replaced by a single one.
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> path = "/home/user/Documents/../Pictures"
<strong>Output:</strong> "/home/user/Pictures"
<strong>Explanation:</strong> A double period ".." refers to the directory up a level (the parent directory).
</pre>

<p><strong>Example 4:</strong></p>
<pre>
<strong>Input:</strong> path = "/../"
<strong>Output:</strong> "/"
<strong>Explanation:</strong> Going one level up from the root directory is not possible.
</pre>

<p><strong>Example 5:</strong></p>
<pre>
<strong>Input:</strong> path = "/.../a/../b/c/../d/./"
<strong>Output:</strong> "/.../b/d"
<strong>Explanation:</strong> "..." is a valid name for a directory in this problem.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 <= path.length <= 3000</code></li>
  <li><code>path</code> consists of English letters, digits, period <code>'.'</code>, slash <code>'/'</code> or underscore <code>'_'</code>.</li>
  <li><code>path</code> is a valid absolute Unix path.</li>
</ul>
