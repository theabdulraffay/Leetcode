<h2><a href="https://leetcode.com/problems/insert-delete-getrandom-o1">380. Insert Delete GetRandom O(1)</a></h2>
<h3>Medium</h3>
<hr>
<p>Implement the <code>RandomizedSet</code> class:</p>

<ul>
<li><code>RandomizedSet()</code> Initializes the <code>RandomizedSet</code> object.</li>
<li><code>bool insert(int val)</code> Inserts an item <code>val</code> into the set if not present. Returns true if the item was not present, false otherwise.</li>
<li><code>bool remove(int val)</code> Removes an item <code>val</code> from the set if present. Returns true if the item was present, false otherwise.</li>
<li><code>int getRandom()</code> Returns a random element from the current set of elements (it's guaranteed that at least one element exists when this method is called). Each element must have the same probability of being returned.</li>
</ul>

<p>You must implement the functions of the class such that each function works in average O(1) time complexity.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> 
["RandomizedSet", "insert", "remove", "insert", "getRandom", "remove", "insert", "getRandom"]
[[], [1], [2], [2], [], [1], [2], []]
<strong>Output:</strong> 
[null, true, false, true, 2, true, false, 2]

<strong>Explanation:</strong>
RandomizedSet randomizedSet = new RandomizedSet();
randomizedSet.insert(1); // Inserts 1 to the set. Returns true as 1 was inserted successfully.
randomizedSet.remove(2); // Returns false as 2 does not exist in the set.
randomizedSet.insert(2); // Inserts 2 to the set, returns true. Set now contains [1,2].
randomizedSet.getRandom(); // getRandom() should return either 1 or 2 randomly.
randomizedSet.remove(1); // Removes 1 from the set, returns true. Set now contains [2].
randomizedSet.insert(2); // 2 was already in the set, so return false.
randomizedSet.getRandom(); // Since 2 is the only number in the set, getRandom() will always return 2.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>-2<sup>31</sup> ≤ val ≤ 2<sup>31</sup> - 1</li>
<li>At most 2 * 10<sup>5</sup> calls will be made to insert, remove, and getRandom.</li>
<li>There will be at least one element in the data structure when <code>getRandom</code> is called.</li>
</ul>
