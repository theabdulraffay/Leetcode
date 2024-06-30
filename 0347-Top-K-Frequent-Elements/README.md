<h2><a href="https://leetcode.com/problems/top-k-frequent-elements">347. Top K Frequent Elements</a></h2>
<h3>Medium</h3>
<hr>
<p>Given an integer array <code>nums</code> and an integer <code>k</code>, return the <code>k</code> most frequent elements. You may return the answer in any order.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,1,1,2,2,3], k = 2
<strong>Output:</strong> [1,2]
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [1], k = 1
<strong>Output:</strong> [1]
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ <code>nums.length</code> ≤ 10<sup>5</sup></li>
<li>-10<sup>4</sup> ≤ <code>nums[i]</code> ≤ 10<sup>4</sup></li>
<li><code>k</code> is in the range [1, the number of unique elements in the array].</li>
<li>It is guaranteed that the answer is unique.</li>
</ul>

<p><strong>Follow up:</strong> Your algorithm's time complexity must be better than O(n log n), where n is the array's size.</p>
