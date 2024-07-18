<h2><a href="https://leetcode.com/problems/find-the-k-beauty-of-a-number">2269. Find the K-Beauty of a Number</a></h2>
<h3>Easy</h3>
<hr>
<p>The k-beauty of an integer <code>num</code> is defined as the number of substrings of <code>num</code> when it is read as a string that meet the following conditions:</p>
<ul>
<li>It has a length of <code>k</code>.</li>
<li>It is a divisor of <code>num</code>.</li>
</ul>
<p>Given integers <code>num</code> and <code>k</code>, return the k-beauty of <code>num</code>.</p>
<p>Note:</p>
<ul>
<li>Leading zeros are allowed.</li>
<li>0 is not a divisor of any value.</li>
<li>A substring is a contiguous sequence of characters in a string.</li>
</ul>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> num = 240, k = 2
<strong>Output:</strong> 2
<strong>Explanation:</strong> The following are the substrings of num of length k:
- "24" from "240": 24 is a divisor of 240.
- "40" from "240": 40 is a divisor of 240.
Therefore, the k-beauty is 2.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> num = 430043, k = 2
<strong>Output:</strong> 2
<strong>Explanation:</strong> The following are the substrings of num of length k:
- "43" from "430043": 43 is a divisor of 430043.
- "30" from "430043": 30 is not a divisor of 430043.
- "00" from "430043": 0 is not a divisor of 430043.
- "04" from "430043": 4 is not a divisor of 430043.
- "43" from "430043": 43 is a divisor of 430043.
Therefore, the k-beauty is 2.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ <code>num</code> ≤ 10<sup>9</sup></li>
<li>1 ≤ <code>k</code> ≤ <code>num.length</code> (taking num as a string)</li>
</ul>
