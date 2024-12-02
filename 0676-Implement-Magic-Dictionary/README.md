<h2><a href="https://leetcode.com/problems/implement-magic-dictionary">676. Implement Magic Dictionary</a></h2>
<h3>Medium</h3>
<hr>
<p>Design a data structure that is initialized with a list of different words. Provided a string, you should determine if you can change exactly one character in this string to match any word in the data structure.</p>

<p>Implement the <code>MagicDictionary</code> class:</p>
<ul>
  <li><code>MagicDictionary()</code> Initializes the object.</li>
  <li><code>void buildDict(String[] dictionary)</code> Sets the data structure with an array of distinct strings <code>dictionary</code>.</li>
  <li><code>bool search(String searchWord)</code> Returns <code>true</code> if you can change exactly one character in <code>searchWord</code> to match any string in the data structure, otherwise returns <code>false</code>.</li>
</ul>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> 
["MagicDictionary", "buildDict", "search", "search", "search", "search"]
[[], [["hello", "leetcode"]], ["hello"], ["hhllo"], ["hell"], ["leetcoded"]]
<strong>Output:</strong> 
[null, null, false, true, false, false]

<strong>Explanation:</strong> 
MagicDictionary magicDictionary = new MagicDictionary();
magicDictionary.buildDict(["hello", "leetcode"]);
magicDictionary.search("hello"); // return False
magicDictionary.search("hhllo"); // We can change the second 'h' to 'e' to match "hello" so we return True
magicDictionary.search("hell"); // return False
magicDictionary.search("leetcoded"); // return False
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 <= dictionary.length <= 100</code></li>
  <li><code>1 <= dictionary[i].length <= 100</code></li>
  <li><code>dictionary[i]</code> consists of only lower-case English letters.</li>
  <li>All the strings in <code>dictionary</code> are distinct.</li>
  <li><code>1 <= searchWord.length <= 100</code></li>
  <li><code>searchWord</code> consists of only lower-case English letters.</li>
  <li><code>buildDict</code> will be called only once before <code>search</code>.</li>
  <li>At most 100 calls will be made to <code>search</code>.</li>
</ul>
