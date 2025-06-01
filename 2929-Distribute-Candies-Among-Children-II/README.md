<h2><a href="https://leetcode.com/problems/distribute-candies-among-children-ii/description/">2929. Distribute Candies Among Children II</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given two positive integers <code>n</code> and <code>limit</code>.</p>
<p>Return the total number of ways to distribute <code>n</code> candies among 3 children such that no child gets more than <code>limit</code> candies.</p>

<p><strong>Example 1:</strong></p>
| Input | n = 5, limit = 2 |
|-------|------------------|
| Output | 3 |
| Explanation | There are 3 ways to distribute 5 candies such that no child gets more than 2 candies: (1, 2, 2), (2, 1, 2), and (2, 2, 1). |

<p><strong>Example 2:</strong></p>
| Input | n = 3, limit = 3 |
|-------|------------------|
| Output | 10 |
| Explanation | There are 10 ways to distribute 3 candies such that no child gets more than 3 candies: (0, 0, 3), (0, 1, 2), (0, 2, 1), (0, 3, 0), (1, 0, 2), (1, 1, 1), (1, 2, 0), (2, 0, 1), (2, 1, 0), and (3, 0, 0). |

<p><strong>Constraints:</strong></p>
<ul>
  <li>1 ≤ <code>n</code> ≤ 10<sup>6</sup></li>
  <li>1 ≤ <code>limit</code> ≤ 10<sup>6</sup></li>
</ul>
