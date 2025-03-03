<h2><a href="https://leetcode.com/problems/partition-array-according-to-given-pivot">2161. Partition Array According to Given Pivot</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a 0-indexed integer array <code>nums</code> and an integer <code>pivot</code>. Rearrange <code>nums</code> such that the following conditions are satisfied:</p>
<ul>
  <li>Every element less than <code>pivot</code> appears before every element greater than <code>pivot</code>.</li>
  <li>Every element equal to <code>pivot</code> appears in between the elements less than and greater than <code>pivot</code>.</li>
  <li>The relative order of the elements less than <code>pivot</code> and the elements greater than <code>pivot</code> is maintained.</li>
</ul>
<p>More formally, consider every <code>pi</code>, <code>pj</code> where <code>pi</code> is the new position of the <code>i</code>-th element and <code>pj</code> is the new position of the <code>j</code>-th element. If <code>i < j</code> and both elements are smaller (or larger) than <code>pivot</code>, then <code>pi < pj</code>.</p>
<p>Return <code>nums</code> after the rearrangement.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [9,12,5,10,14,3,10], pivot = 10
<strong>Output:</strong> [9,5,3,10,10,12,14]
<strong>Explanation:</strong>
The elements 9, 5, and 3 are less than the pivot so they are on the left side of the array.
The elements 12 and 14 are greater than the pivot so they are on the right side of the array.
The relative ordering of the elements less than and greater than pivot is also maintained. [9, 5, 3] and [12, 14] are the respective orderings.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [-3,4,3,2], pivot = 2
<strong>Output:</strong> [-3,2,4,3]
<strong>Explanation:</strong>
The element -3 is less than the pivot so it is on the left side of the array.
The elements 4 and 3 are greater than the pivot so they are on the right side of the array.
The relative ordering of the elements less than and greater than pivot is also maintained. [-3] and [4, 3] are the respective orderings.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>1 <= <code>nums.length</code> <= 10<sup>5</sup></li>
  <li>-10<sup>6</sup> <= <code>nums[i]</code> <= 10<sup>6</sup></li>
  <li><code>pivot</code> equals to an element of <code>nums</code>.</li>
</ul>
