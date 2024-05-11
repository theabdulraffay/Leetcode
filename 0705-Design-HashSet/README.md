<h2><a href="https://leetcode.com/problems/design-hashset">705. Design HashSet</a></h2>
<h3>Easy</h3>
<hr>
<p>Design a HashSet without using any built-in hash table libraries.</p>
<p>Implement MyHashSet class:</p>
<ul>
<li><code>void add(key)</code> Inserts the value <code>key</code> into the HashSet.</li>
<li><code>bool contains(key)</code> Returns whether the value <code>key</code> exists in the HashSet or not.</li>
<li><code>void remove(key)</code> Removes the value <code>key</code> in the HashSet. If <code>key</code> does not exist in the HashSet, do nothing.</li>
</ul>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input</strong>
["MyHashSet", "add", "add", "contains", "contains", "add", "contains", "remove", "contains"]
[[], [1], [2], [1], [3], [2], [2], [2], [2]]
<strong>Output</strong>
[null, null, null, true, false, null, true, null, false]
<strong>Explanation</strong>
MyHashSet myHashSet = new MyHashSet();
myHashSet.add(1);      // set = [1]
myHashSet.add(2);      // set = [1, 2]
myHashSet.contains(1); // return True
myHashSet.contains(3); // return False, (not found)
myHashSet.add(2);      // set = [1, 2]
myHashSet.contains(2); // return True
myHashSet.remove(2);   // set = [1]
myHashSet.contains(2); // return False, (already removed)
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>0 ≤ <code>key</code> ≤ 10^6</li>
<li>At most 10^4 calls will be made to <code>add</code>, <code>remove</code>, and <code>contains</code>.</li>
</ul>
