<h2><a href="https://leetcode.com/problems/the-kth-factor-of-n">1492. The kth Factor of n</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given two positive integers <code>n</code> and <code>k</code>. A factor of an integer <code>n</code> is defined as an integer <code>i</code> where <code>n % i == 0</code>.</p>

<p>Consider a list of all factors of <code>n</code> sorted in ascending order, return the <code>k<sup>th</sup></code> factor in this list or return <code>-1</code> if <code>n</code> has less than <code>k</code> factors.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> n = 12, k = 3
<strong>Output:</strong> 3
<strong>Explanation:</strong> Factors list is [1, 2, 3, 4, 6, 12], the 3rd factor is 3.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> n = 7, k = 2
<strong>Output:</strong> 7
<strong>Explanation:</strong> Factors list is [1, 7], the 2nd factor is 7.
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> n = 4, k = 4
<strong>Output:</strong> -1
<strong>Explanation:</strong> Factors list is [1, 2, 4], there are only 3 factors. We should return -1.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>1 <= k <= n <= 1000</li>
</ul>

<p><strong>Follow up:</strong></p>
<p>Could you solve this problem in less than O(n) complexity?</p>
