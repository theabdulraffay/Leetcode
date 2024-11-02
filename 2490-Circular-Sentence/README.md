<h2><a href="https://leetcode.com/problems/circular-sentence">2490. Circular Sentence</a></h2>
<h3>Easy</h3>
<hr>
<p>A sentence is a list of words that are separated by a single space with no leading or trailing spaces.</p>

<p>For example, <code>"Hello World"</code>, <code>"HELLO"</code>, <code>"hello world hello world"</code> are all sentences.</p>
<p>Words consist of only uppercase and lowercase English letters. Uppercase and lowercase English letters are considered different.</p>

<p>A sentence is <strong>circular</strong> if:</p>
<ul>
  <li>The last character of a word is equal to the first character of the next word.</li>
  <li>The last character of the last word is equal to the first character of the first word.</li>
</ul>

<p>For example, <code>"leetcode exercises sound delightful"</code>, <code>"eetcode"</code>, and <code>"leetcode eats soul"</code> are all circular sentences. However, <code>"Leetcode is cool"</code>, <code>"happy Leetcode"</code>, <code>"Leetcode"</code>, and <code>"I like Leetcode"</code> are not circular sentences.</p>

<p>Given a string <code>sentence</code>, return <code>true</code> if it is circular. Otherwise, return <code>false</code>.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> sentence = "leetcode exercises sound delightful"
<strong>Output:</strong> true
<strong>Explanation:</strong> The words in sentence are ["leetcode", "exercises", "sound", "delightful"].
- leetcode's last character is equal to exercises's first character.
- exercises's last character is equal to sound's first character.
- sound's last character is equal to delightful's first character.
- delightful's last character is equal to leetcode's first character.
The sentence is circular.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> sentence = "eetcode"
<strong>Output:</strong> true
<strong>Explanation:</strong> The words in sentence are ["eetcode"].
- eetcode's last character is equal to eetcode's first character.
The sentence is circular.
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> sentence = "Leetcode is cool"
<strong>Output:</strong> false
<strong>Explanation:</strong> The words in sentence are ["Leetcode", "is", "cool"].
- Leetcode's last character is not equal to is's first character.
The sentence is not circular.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 <= sentence.length <= 500</code></li>
  <li><code>sentence</code> consists of only lowercase and uppercase English letters and spaces.</li>
  <li>The words in <code>sentence</code> are separated by a single space.</li>
  <li>There are no leading or trailing spaces.</li>
</ul>
