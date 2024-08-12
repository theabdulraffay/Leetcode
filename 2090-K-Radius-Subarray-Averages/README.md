<h2><a href="https://leetcode.com/problems/k-radius-subarray-averages">2090. K Radius Subarray Averages</a></h2>
<h3>Solved</h3>
<h3>Medium</h3>
<hr>
<p>You are given a 0-indexed array <code>nums</code> of <code>n</code> integers, and an integer <code>k</code>.</p>
<p>The k-radius average for a subarray of <code>nums</code> centered at some index <code>i</code> with the radius <code>k</code> is the average of all elements in <code>nums</code> between the indices <code>i - k</code> and <code>i + k</code> (inclusive). If there are less than <code>k</code> elements before or after the index <code>i</code>, then the k-radius average is <code>-1</code>.</p>
<p>Build and return an array <code>avgs</code> of length <code>n</code> where <code>avgs[i]</code> is the k-radius average for the subarray centered at index <code>i</code>.</p>
<p>The average of <code>x</code> elements is the sum of the <code>x</code> elements divided by <code>x</code>, using integer division. The integer division truncates toward zero, which means losing its fractional part.</p>
<p>For example, the average of four elements <code>2</code>, <code>3</code>, <code>1</code>, and <code>5</code> is <code>(2 + 3 + 1 + 5) / 4 = 11 / 4 = 2.75</code>, which truncates to <code>2</code>.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [7,4,3,9,1,8,5,2,6], k = 3
<strong>Output:</strong> [-1,-1,-1,5,4,4,-1,-1,-1]
<strong>Explanation:</strong>
- avg[0], avg[1], and avg[2] are -1 because there are less than k elements before each index.
- The sum of the subarray centered at index 3 with radius 3 is: 7 + 4 + 3 + 9 + 1 + 8 + 5 = 37.
  Using integer division, avg[3] = 37 / 7 = 5.
- For the subarray centered at index 4, avg[4] = (4 + 3 + 9 + 1 + 8 + 5 + 2) / 7 = 4.
- For the subarray centered at index 5, avg[5] = (3 + 9 + 1 + 8 + 5 + 2 + 6) / 7 = 4.
- avg[6], avg[7], and avg[8] are -1 because there are less than k elements after each index.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [100000], k = 0
<strong>Output:</strong> [100000]
<strong>Explanation:</strong>
- The sum of the subarray centered at index 0 with radius 0 is: 100000.
  avg[0] = 100000 / 1 = 100000.
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> nums = [8], k = 100000
<strong>Output:</strong> [-1]
<strong>Explanation:</strong> 
- avg[0] is -1 because there are less than k elements before and after index 0.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>n == nums.length</code></li>
  <li><code>1 <= n <= 10<sup>5</sup></code></li>
  <li><code>0 <= nums[i], k <= 10<sup>5</sup></code></li>
</ul>
