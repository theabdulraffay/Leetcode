<h2><a href="https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-ii">3016. Minimum Number of Pushes to Type Word II</a></h2>
<h3>Solved</h3>
<h3>Medium</h3>
<hr>
<p>You are given a string <code>word</code> containing lowercase English letters.</p>
<p>Telephone keypads have keys mapped with distinct collections of lowercase English letters, which can be used to form words by pushing them. For example, the key 2 is mapped with ["a", "b", "c"], we need to push the key one time to type "a", two times to type "b", and three times to type "c".</p>
<p>It is allowed to remap the keys numbered 2 to 9 to distinct collections of letters. The keys can be remapped to any amount of letters, but each letter must be mapped to exactly one key. You need to find the minimum number of times the keys will be pushed to type the string <code>word</code>.</p>
<p>Return the minimum number of pushes needed to type <code>word</code> after remapping the keys.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> word = "abcde"
<strong>Output:</strong> 5
<strong>Explanation:</strong> The remapped keypad provides the minimum cost.
"a" -> one push on key 2
"b" -> one push on key 3
"c" -> one push on key 4
"d" -> one push on key 5
"e" -> one push on key 6
Total cost is 1 + 1 + 1 + 1 + 1 = 5.
It can be shown that no other mapping can provide a lower cost.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> word = "xyzxyzxyzxyz"
<strong>Output:</strong> 12
<strong>Explanation:</strong> The remapped keypad provides the minimum cost.
"x" -> one push on key 2
"y" -> one push on key 3
"z" -> one push on key 4
Total cost is 1 * 4 + 1 * 4 + 1 * 4 = 12.
It can be shown that no other mapping can provide a lower cost.
Note that the key 9 is not mapped to any letter: it is not necessary to map letters to every key, but to map all the letters.
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> word = "aabbccddeeffgghhiiiiii"
<strong>Output:</strong> 24
<strong>Explanation:</strong> The remapped keypad provides the minimum cost.
"a" -> one push on key 2
"b" -> one push on key 3
"c" -> one push on key 4
"d" -> one push on key 5
"e" -> one push on key 6
"f" -> one push on key 7
"g" -> one push on key 8
"h" -> two pushes on key 9
"i" -> one push on key 9
Total cost is 1 * 2 + 1 * 2 + 1 * 2 + 1 * 2 + 1 * 2 + 1 * 2 + 1 * 2 + 2 * 2 + 6 * 1 = 24.
It can be shown that no other mapping can provide a lower cost.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li>1 ≤ <code>word.length</code> ≤ 10<sup>5</sup></li>
  <li><code>word</code> consists of lowercase English letters.</li>
</ul>
