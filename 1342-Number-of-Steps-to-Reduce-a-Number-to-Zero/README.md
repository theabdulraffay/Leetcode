<h2><a href="https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/">1342. Number of Steps to Reduce a Number to Zero</a></h2>
<h3>Easy</h3>
<hr>
<p>Given an integer num, return the number of steps to reduce it to zero.</p>
<p>In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> num = 14
<strong>Output:</strong> 6
<strong>Explanation:</strong> 
Step 1) 14 is even; divide by 2 and obtain 7. 
Step 2) 7 is odd; subtract 1 and obtain 6.
Step 3) 6 is even; divide by 2 and obtain 3. 
Step 4) 3 is odd; subtract 1 and obtain 2. 
Step 5) 2 is even; divide by 2 and obtain 1. 
Step 6) 1 is odd; subtract 1 and obtain 0.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> num = 8
<strong>Output:</strong> 4
<strong>Explanation:</strong> 
Step 1) 8 is even; divide by 2 and obtain 4. 
Step 2) 4 is even; divide by 2 and obtain 2. 
Step 3) 2 is even; divide by 2 and obtain 1. 
Step 4) 1 is odd; subtract 1 and obtain 0.
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> num = 123
<strong>Output:</strong> 12
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>0 <= num <= 106</li>
</ul>
