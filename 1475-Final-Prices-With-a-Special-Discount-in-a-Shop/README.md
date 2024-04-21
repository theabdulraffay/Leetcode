<h2><a href="https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop">1475. Final Prices With a Special Discount in a Shop</a></h2>
<hr>
<p>You are given an integer array prices where prices[i] is the price of the ith item in a shop.</p>
<p>There is a special discount for items in the shop. If you buy the ith item, then you will receive a discount equivalent to prices[j] where j is the minimum index such that j > i and prices[j] <= prices[i]. Otherwise, you will not receive any discount at all.</p>
<p>Return an integer array answer where answer[i] is the final price you will pay for the ith item of the shop, considering the special discount.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> prices = [8,4,6,2,3]
<strong>Output:</strong> [4,2,4,2,3]
<strong>Explanation:</strong> 
For item 0 with price[0]=8 you will receive a discount equivalent to prices[1]=4, therefore, the final price you will pay is 8 - 4 = 4.
For item 1 with price[1]=4 you will receive a discount equivalent to prices[3]=2, therefore, the final price you will pay is 4 - 2 = 2.
For item 2 with price[2]=6 you will receive a discount equivalent to prices[3]=2, therefore, the final price you will pay is 6 - 2 = 4.
For items 3 and 4 you will not receive any discount at all.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> prices = [1,2,3,4,5]
<strong>Output:</strong> [1,2,3,4,5]
<strong>Explanation:</strong> In this case, for all items, you will not receive any discount at all.
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> prices = [10,1,1,6]
<strong>Output:</strong> [9,0,1,6]
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>1 <= prices.length <= 500</li>
<li>1 <= prices[i] <= 1000</li>
</ul>
