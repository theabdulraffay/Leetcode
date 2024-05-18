<h2><a href="https://leetcode.com/problems/find-the-difference-of-two-arrays">2215. Find the Difference of Two Arrays</a></h2>
<h3>Easy</h3>
<hr>
<p>Given two 0-indexed integer arrays <code>nums1</code> and <code>nums2</code>, return a list <code>answer</code> of size 2 where:</p>
<ul>
<li><code>answer[0]</code> is a list of all distinct integers in <code>nums1</code> which are not present in <code>nums2</code>.</li>
<li><code>answer[1]</code> is a list of all distinct integers in <code>nums2</code> which are not present in <code>nums1</code>.</li>
</ul>
<p>Note that the integers in the lists may be returned in any order.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums1 = [1,2,3], nums2 = [2,4,6]
<strong>Output:</strong> [[1,3],[4,6]]
<strong>Explanation:</strong>
For <code>nums1</code>, <code>nums1[1] = 2</code> is present at index 0 of <code>nums2</code>, whereas <code>nums1[0] = 1</code> and <code>nums1[2] = 3</code> are not present in <code>nums2</code>. Therefore, <code>answer[0] = [1,3]</code>.
For <code>nums2</code>, <code>nums2[0] = 2</code> is present at index 1 of <code>nums1</code>, whereas <code>nums2[1] = 4</code> and <code>nums2[2] = 6</code> are not present in <code>nums1</code>. Therefore, <code>answer[1] = [4,6]</code>.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums1 = [1,2,3,3], nums2 = [1,1,2,2]
<strong>Output:</strong> [[3],[]]
<strong>Explanation:</strong>
For <code>nums1</code>, <code>nums1[2]</code> and <code>nums1[3]</code> are not present in <code>nums2</code>. Since <code>nums1[2] == nums1[3]</code>, their value is only included once and <code>answer[0] = [3]</code>.
Every integer in <code>nums2</code> is present in <code>nums1</code>. Therefore, <code>answer[1] = []</code>.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ <code>nums1.length</code>, <code>nums2.length</code> ≤ 1000</li>
<li>-1000 ≤ <code>nums1[i]</code>, <code>nums2[i]</code> ≤ 1000</li>
</ul>
