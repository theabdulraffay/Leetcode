<h2><a href="https://leetcode.com/problems/throne-inheritance">1600. Throne Inheritance</a></h2>
<h3>Medium</h3>
<hr>
<p>A kingdom consists of a king, his children, his grandchildren, and so on. Every once in a while, someone in the family dies or a child is born.</p>
<p>The kingdom has a well-defined order of inheritance that consists of the king as the first member. Let's define the recursive function <code>Successor(x, curOrder)</code>, which given a person <code>x</code> and the inheritance order so far, returns who should be the next person after <code>x</code> in the order of inheritance.</p>

<pre>
Successor(x, curOrder):
    if x has no children or all of x's children are in curOrder:
        if x is the king return null
        else return Successor(x's parent, curOrder)
    else return x's oldest child who's not in curOrder
</pre>

<p>For example, assume we have a kingdom that consists of the king, his children Alice and Bob (Alice is older than Bob), and finally Alice's son Jack.</p>
<ul>
<li>In the beginning, <code>curOrder</code> will be <code>["king"]</code>.</li>
<li>Calling <code>Successor(king, curOrder)</code> will return Alice, so we append to <code>curOrder</code> to get <code>["king", "Alice"]</code>.</li>
<li>Calling <code>Successor(Alice, curOrder)</code> will return Jack, so we append to <code>curOrder</code> to get <code>["king", "Alice", "Jack"]</code>.</li>
<li>Calling <code>Successor(Jack, curOrder)</code> will return Bob, so we append to <code>curOrder</code> to get <code>["king", "Alice", "Jack", "Bob"]</code>.</li>
<li>Calling <code>Successor(Bob, curOrder)</code> will return null. Thus the order of inheritance will be <code>["king", "Alice", "Jack", "Bob"]</code>.</li>
</ul>
<p>Using the above function, we can always obtain a unique order of inheritance.</p>

<p>Implement the <code>ThroneInheritance</code> class:</p>
<ul>
<li><code>ThroneInheritance(string kingName)</code> Initializes an object of the <code>ThroneInheritance</code> class. The name of the king is given as part of the constructor.</li>
<li><code>void birth(string parentName, string childName)</code> Indicates that <code>parentName</code> gave birth to <code>childName</code>.</li>
<li><code>void death(string name)</code> Indicates the death of <code>name</code>. The death of the person doesn't affect the <code>Successor</code> function nor the current inheritance order. You can treat it as just marking the person as dead.</li>
<li><code>string[] getInheritanceOrder()</code> Returns a list representing the current order of inheritance excluding dead people.</li>
</ul>

<p><strong>Example 1:</strong></p>

<pre>
<strong>Input:</strong> 
["ThroneInheritance", "birth", "birth", "birth", "birth", "birth", "birth", "getInheritanceOrder", "death", "getInheritanceOrder"]
[["king"], ["king", "andy"], ["king", "bob"], ["king", "catherine"], ["andy", "matthew"], ["bob", "alex"], ["bob", "asha"], [null], ["bob"], [null]]
<strong>Output:</strong> 
[null, null, null, null, null, null, null, ["king", "andy", "matthew", "bob", "alex", "asha", "catherine"], null, ["king", "andy", "matthew", "alex", "asha", "catherine"]]
</pre>

<p><strong>Explanation:</strong></p>
<pre>
ThroneInheritance t = new ThroneInheritance("king"); // order: king
t.birth("king", "andy"); // order: king > andy
t.birth("king", "bob"); // order: king > andy > bob
t.birth("king", "catherine"); // order: king > andy > bob > catherine
t.birth("andy", "matthew"); // order: king > andy > matthew > bob > catherine
t.birth("bob", "alex"); // order: king > andy > matthew > bob > alex > catherine
t.birth("bob", "asha"); // order: king > andy > matthew > bob > alex > asha > catherine
t.getInheritanceOrder(); // return ["king", "andy", "matthew", "bob", "alex", "asha", "catherine"]
t.death("bob"); // order: king > andy > matthew > bob > alex > asha > catherine
t.getInheritanceOrder(); // return ["king", "andy", "matthew", "alex", "asha", "catherine"]
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>1 <= kingName.length, parentName.length, childName.length, name.length <= 15</li>
<li>kingName, parentName, childName, and name consist of lowercase English letters only.</li>
<li>All arguments <code>childName</code> and <code>kingName</code> are distinct.</li>
<li>All <code>name</code> arguments of <code>death</code> will be passed to either the constructor or as <code>childName</code> to <code>birth</code> first.</li>
<li>For each call to <code>birth(parentName, childName)</code>, it is guaranteed that <code>parentName</code> is alive.</li>
<li>At most <code>10^5</code> calls will be made to <code>birth</code> and <code>death</code>.</li>
<li>At most 10 calls will be made to <code>getInheritanceOrder</code>.</li>
</ul>
