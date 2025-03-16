<h2><a href="https://leetcode.com/problems/minimum-time-to-repair-cars">2594. Minimum Time to Repair Cars</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given an integer array <code>ranks</code> representing the ranks of some mechanics. <code>ranks[i]</code> is the rank of the <code>i</code>-th mechanic. A mechanic with a rank <code>r</code> can repair <code>n</code> cars in <code>r * n^2</code> minutes.</p>
<p>You are also given an integer <code>cars</code> representing the total number of cars waiting in the garage to be repaired.</p>
<p>Return the minimum time taken to repair all the cars.</p>
<p>Note: All the mechanics can repair the cars simultaneously.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> ranks = [4,2,3,1], cars = 10
<strong>Output:</strong> 16
<strong>Explanation:</strong>
- The first mechanic will repair two cars. The time required is 4 * 2 * 2 = 16 minutes.
- The second mechanic will repair two cars. The time required is 2 * 2 * 2 = 8 minutes.
- The third mechanic will repair two cars. The time required is 3 * 2 * 2 = 12 minutes.
- The fourth mechanic will repair four cars. The time required is 1 * 4 * 4 = 16 minutes.
It can be proved that the cars cannot be repaired in less than 16 minutes.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> ranks = [5,1,8], cars = 6
<strong>Output:</strong> 16
<strong>Explanation:</strong>
- The first mechanic will repair one car. The time required is 5 * 1 * 1 = 5 minutes.
- The second mechanic will repair four cars. The time required is 1 * 4 * 4 = 16 minutes.
- The third mechanic will repair one car. The time required is 8 * 1 * 1 = 8 minutes.
It can be proved that the cars cannot be repaired in less than 16 minutes.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li>1 <= <code>ranks.length</code> <= 10<sup>5</sup></li>
  <li>1 <= <code>ranks[i]</code> <= 100</li>
  <li>1 <= <code>cars</code> <= 10<sup>6</sup></li>
</ul>
