<h2><a href="https://leetcode.com/problems/grumpy-bookstore-owner">1052. Grumpy Bookstore Owner</a></h2>
<h3>Medium</h3>
<hr>
<p>There is a bookstore owner that has a store open for <code>n</code> minutes. You are given an integer array <code>customers</code> of length <code>n</code> where <code>customers[i]</code> is the number of customers that enter the store at the start of the <code>i<sup>th</sup></code> minute and all those customers leave after the end of that minute.</p>

<p>During certain minutes, the bookstore owner is grumpy. You are given a binary array <code>grumpy</code> where <code>grumpy[i]</code> is 1 if the bookstore owner is grumpy during the <code>i<sup>th</sup></code> minute, and is 0 otherwise.</p>

<p>When the bookstore owner is grumpy, the customers entering during that minute are not satisfied. Otherwise, they are satisfied.</p>

<p>The bookstore owner knows a secret technique to remain not grumpy for <code>minutes</code> consecutive minutes, but this technique can only be used once.</p>

<p>Return the maximum number of customers that can be satisfied throughout the day.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> customers = [1,0,1,2,1,1,7,5], grumpy = [0,1,0,1,0,1,0,1], minutes = 3
<strong>Output:</strong> 16
<strong>Explanation:</strong> 
The bookstore owner keeps themselves not grumpy for the last 3 minutes.
The maximum number of customers that can be satisfied = 1 + 1 + 1 + 1 + 7 + 5 = 16.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> customers = [1], grumpy = [0], minutes = 1
<strong>Output:</strong> 1
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>n == customers.length == grumpy.length</code></li>
  <li><code>1 <= minutes <= n <= 2 * 10<sup>4</sup></code></li>
  <li><code>0 <= customers[i] <= 1000</code></li>
  <li><code>grumpy[i]</code> is either <code>0</code> or <code>1</code>.</li>
</ul>
