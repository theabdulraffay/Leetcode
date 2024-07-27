<h2><a href="https://leetcode.com/problems/fruit-into-baskets">904. Fruit Into Baskets</a></h2>
<h3>Medium</h3>
<hr>
<p>You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array <code>fruits</code> where <code>fruits[i]</code> is the type of fruit the <code>i<sup>th</sup></code> tree produces.</p>
<p>You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:</p>
<ul>
<li>You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.</li>
<li>Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.</li>
<li>Once you reach a tree with fruit that cannot fit in your baskets, you must stop.</li>
</ul>
<p>Given the integer array <code>fruits</code>, return the maximum number of fruits you can pick.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> fruits = [1,2,1]
<strong>Output:</strong> 3
<strong>Explanation:</strong> We can pick from all 3 trees.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> fruits = [0,1,2,2]
<strong>Output:</strong> 3
<strong>Explanation:</strong> We can pick from trees [1,2,2].
If we had started at the first tree, we would only pick from trees [0,1].
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> fruits = [1,2,3,2,2]
<strong>Output:</strong> 4
<strong>Explanation:</strong> We can pick from trees [2,3,2,2].
If we had started at the first tree, we would only pick from trees [1,2].
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ <code>fruits.length</code> ≤ 10<sup>5</sup></li>
<li>0 ≤ <code>fruits[i]</code> &lt; <code>fruits.length</code></li>
</ul>
