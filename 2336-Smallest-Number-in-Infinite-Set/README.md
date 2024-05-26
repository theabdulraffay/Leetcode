<h2><a href="https://leetcode.com/problems/smallest-number-in-infinite-set">2336. Smallest Number in Infinite Set</a></h2>
<h3>Medium</h3>
<hr>
<p>You have a set which contains all positive integers [1, 2, 3, 4, 5, ...].</p>
<p>Implement the <code>SmallestInfiniteSet</code> class:</p>
<ul>
<li><code>SmallestInfiniteSet()</code> Initializes the <code>SmallestInfiniteSet</code> object to contain all positive integers.</li>
<li><code>int popSmallest()</code> Removes and returns the smallest integer contained in the infinite set.</li>
<li><code>void addBack(int num)</code> Adds a positive integer <code>num</code> back into the infinite set, if it is not already in the infinite set.</li>
</ul>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> 
["SmallestInfiniteSet", "addBack", "popSmallest", "popSmallest", "popSmallest", "addBack", "popSmallest", "popSmallest", "popSmallest"]
[[], [2], [], [], [], [1], [], [], []]
<strong>Output:</strong> 
[null, null, 1, 2, 3, null, 1, 4, 5]

<strong>Explanation:</strong>
SmallestInfiniteSet smallestInfiniteSet = new SmallestInfiniteSet();
smallestInfiniteSet.addBack(2);    // 2 is already in the set, so no change is made.
smallestInfiniteSet.popSmallest(); // return 1, since 1 is the smallest number, and remove it from the set.
smallestInfiniteSet.popSmallest(); // return 2, and remove it from the set.
smallestInfiniteSet.popSmallest(); // return 3, and remove it from the set.
smallestInfiniteSet.addBack(1);    // 1 is added back to the set.
smallestInfiniteSet.popSmallest(); // return 1, since 1 was added back to the set and is the smallest number, and remove it from the set.
smallestInfiniteSet.popSmallest(); // return 4, and remove it from the set.
smallestInfiniteSet.popSmallest(); // return 5, and remove it from the set.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ <code>num</code> ≤ 1000</li>
<li>At most 1000 calls will be made in total to <code>popSmallest</code> and <code>addBack</code>.</li>
</ul>
