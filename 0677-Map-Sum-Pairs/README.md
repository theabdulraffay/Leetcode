<h2><a href="https://leetcode.com/problems/map-sum-pairs/">677. Map Sum Pairs</a></h2>
<h3>Medium</h3>
<hr>
<p>Design a map that allows you to do the following:</p>
<ul>
<li>Maps a string key to a given value.</li>
<li>Returns the sum of the values that have a key with a prefix equal to a given string.</li>
</ul>
<p>Implement the MapSum class:</p>
<ul>
<li><code>MapSum()</code> Initializes the MapSum object.</li>
<li><code>void insert(String key, int val)</code> Inserts the key-val pair into the map. If the key already existed, the original key-value pair will be overridden to the new one.</li>
<li><code>int sum(string prefix)</code> Returns the sum of all the pairs' value whose key starts with the prefix.</li>
</ul>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input</strong>
["MapSum", "insert", "sum", "insert", "sum"]
[[], ["apple", 3], ["ap"], ["app", 2], ["ap"]]
<strong>Output</strong>
[null, null, 3, null, 5]
<strong>Explanation</strong>
MapSum mapSum = new MapSum();
mapSum.insert("apple", 3);  
mapSum.sum("ap");           // return 3 (apple = 3)
mapSum.insert("app", 2);    
mapSum.sum("ap");           // return 5 (apple + app = 3 + 2 = 5)
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ key.length, prefix.length ≤ 50</li>
<li>key and prefix consist of only lowercase English letters.</li>
<li>1 ≤ val ≤ 1000</li>
<li>At most 50 calls will be made to insert and sum.</li>
</ul>
