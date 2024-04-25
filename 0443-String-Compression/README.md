<h2><a href="https://leetcode.com/problems/string-compression">443. String Compression</a></h2>
<h3>Medium</h3>
<hr>
<p>Given an array of characters chars, compress it using the following algorithm:</p>
<ol>
<li>Begin with an empty string s. For each group of consecutive repeating characters in chars:</li>
<ul>
<li>If the group's length is 1, append the character to s.</li>
<li>Otherwise, append the character followed by the group's length.</li>
</ul>
<li>The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.</li>
<li>After you are done modifying the input array, return the new length of the array.</li>
</ol>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> chars = ["a","a","b","b","c","c","c"]
<strong>Output:</strong> Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
<strong>Explanation:</strong> The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> chars = ["a"]
<strong>Output:</strong> Return 1, and the first character of the input array should be: ["a"]
<strong>Explanation:</strong> The only group is "a", which remains uncompressed since it's a single character.
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
<strong>Output:</strong> Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
<strong>Explanation:</strong> The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>1 <= chars.length <= 2000</li>
<li>chars[i] is a lowercase English letter, uppercase English letter, digit, or symbol.</li>
</ul>
