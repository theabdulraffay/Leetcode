<h2><a href="https://leetcode.com/problems/least-number-of-unique-integers-after-k-removals">1481. Least Number of Unique Integers after K Removals</a></h2>
<hr>
<p>Given an array of integers arr and an integer k. Find the least number of unique integers after removing exactly k elements.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> arr = [5,5,4], k = 1
<strong>Output:</strong> 1
<strong>Explanation:</strong> Remove the single 4, only 5 is left.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> arr = [4,3,1,1,3,3,2], k = 3
<strong>Output:</strong> 2
<strong>Explanation:</strong> Remove 4, 2 and either one of the two 1s or three 3s. 1 and 3 will be left.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>1 <= arr.length <= 10^5</li>
<li>1 <= arr[i] <= 10^9</li>
<li>0 <= k <= arr.length</li>
</ul>
