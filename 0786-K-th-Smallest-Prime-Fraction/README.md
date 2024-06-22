<h2><a href="https://leetcode.com/problems/k-th-smallest-prime-fraction">786. K-th Smallest Prime Fraction</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a sorted integer array <code>arr</code> containing 1 and prime numbers, where all the integers of <code>arr</code> are unique. You are also given an integer <code>k</code>.</p>
<p>For every <code>i</code> and <code>j</code> where <code>0 <= i < j < arr.length</code>, we consider the fraction <code>arr[i] / arr[j]</code>.</p>
<p>Return the <code>k</code>th smallest fraction considered. Return your answer as an array of integers of size 2, where <code>answer[0] == arr[i]</code> and <code>answer[1] == arr[j]</code>.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> arr = [1,2,3,5], k = 3
<strong>Output:</strong> [2,5]
<strong>Explanation:</strong> The fractions to be considered in sorted order are:
1/5, 1/3, 2/5, 1/2, 3/5, and 2/3.
The third fraction is 2/5.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> arr = [1,7], k = 1
<strong>Output:</strong> [1,7]
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>2 ≤ <code>arr.length</code> ≤ 1000</li>
<li>1 ≤ <code>arr[i]</code> ≤ 3 * 10<sup>4</sup></li>
<li><code>arr[0] == 1</code></li>
<li><code>arr[i]</code> is a prime number for <code>i > 0</code></li>
<li>All the numbers of <code>arr</code> are unique and sorted in strictly increasing order.</li>
<li>1 ≤ <code>k</code> ≤ <code>arr.length * (arr.length - 1) / 2</code></li>
</ul>

<p><strong>Follow up:</strong> Can you solve the problem with better than O(n<sup>2</sup>) complexity?</p>
