<h2><a href="https://leetcode.com/problems/make-the-string-great">1544. Make The String Great</a></h2>
<h3>Easy</h3>
<hr>
<p>Given a string <em>s</em> of lower and upper case English letters.</p>
<p>A good string is a string which doesn't have two adjacent characters <em>s[i]</em> and <em>s[i + 1]</em> where:</p>
<ul>
<li>0 ≤ <em>i</em> ≤ <em>s.length - 2</em></li>
<li><em>s[i]</em> is a lower-case letter and <em>s[i + 1]</em> is the same letter but in upper-case or vice-versa.</li>
</ul>
<p>To make the string good, you can choose two adjacent characters that make the string bad and remove them. You can keep doing this until the string becomes good.</p>
<p>Return the string after making it good. The answer is guaranteed to be unique under the given constraints.</p>
<p>Notice that an empty string is also good.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> s = "leEeetcode"
<strong>Output:</strong> "leetcode"
<strong>Explanation:</strong> In the first step, either you choose i = 1 or i = 2, both will result "leEeetcode" to be reduced to "leetcode".
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> s = "abBAcC"
<strong>Output:</strong> ""
<strong>Explanation:</strong> We have many possible scenarios, and all lead to the same answer. For example:
"abBAcC" → "aAcC" → "cC" → ""
"abBAcC" → "abBA" → "aA" → ""
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> s = "s"
<strong>Output:</strong> "s"
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ <em>s.length</em> ≤ 100</li>
<li><em>s</em> contains only lower and upper case English letters.</li>
</ul>
