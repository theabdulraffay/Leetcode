<h2><a href="https://leetcode.com/problems/sort-the-jumbled-numbers">2191. Sort the Jumbled Numbers</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a 0-indexed integer array <code>mapping</code> which represents the mapping rule of a shuffled decimal system. <code>mapping[i] = j</code> means digit <code>i</code> should be mapped to digit <code>j</code> in this system.</p>
<p>The mapped value of an integer is the new integer obtained by replacing each occurrence of digit <code>i</code> in the integer with <code>mapping[i]</code> for all <code>0 <= i <= 9</code>.</p>
<p>You are also given another integer array <code>nums</code>. Return the array <code>nums</code> sorted in non-decreasing order based on the mapped values of its elements.</p>
<p><strong>Notes:</strong></p>
<ul>
<li>Elements with the same mapped values should appear in the same relative order as in the input.</li>
<li>The elements of <code>nums</code> should only be sorted based on their mapped values and not be replaced by them.</li>
</ul>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> mapping = [8,9,4,0,2,1,3,5,7,6], nums = [991,338,38]
<strong>Output:</strong> [338,38,991]
<strong>Explanation:</strong> 
Map the number 991 as follows:
1. mapping[9] = 6, so all occurrences of the digit 9 will become 6.
2. mapping[1] = 9, so all occurrences of the digit 1 will become 9.
Therefore, the mapped value of 991 is 669.
338 maps to 007, or 7 after removing the leading zeros.
38 maps to 07, which is also 7 after removing leading zeros.
Since 338 and 38 share the same mapped value, they should remain in the same relative order, so 338 comes before 38.
Thus, the sorted array is [338,38,991].
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> mapping = [0,1,2,3,4,5,6,7,8,9], nums = [789,456,123]
<strong>Output:</strong> [123,456,789]
<strong>Explanation:</strong> 789 maps to 789, 456 maps to 456, and 123 maps to 123. Thus, the sorted array is [123,456,789].
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li><code>mapping.length == 10</code></li>
<li><code>0 <= mapping[i] <= 9</code></li>
<li>All the values of <code>mapping[i]</code> are unique.</li>
<li><code>1 <= nums.length <= 3 * 10<sup>4</sup></code></li>
<li><code>0 <= nums[i] < 10<sup>9</sup></code></li>
</ul>
