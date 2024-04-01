<h2><a href="https://leetcode.com/problems/find-the-winner-of-the-circular-game">1823. Find the Winner of the Circular Game</a></h2>
<h3>Medium</h3>
<hr>
<p>There are <em>n</em> friends that are playing a game. The friends are sitting in a circle and are numbered from 1 to <em>n</em> in clockwise order. More formally, moving clockwise from the <em>i</em>th friend brings you to the (<em>i</em>+1)th friend for 1 ≤ <em>i</em> &lt; <em>n</em>, and moving clockwise from the <em>n</em>th friend brings you to the 1st friend.</p>
<p>The rules of the game are as follows:</p>
<ol>
<li>Start at the 1st friend.</li>
<li>Count the next <em>k</em> friends in the clockwise direction including the friend you started at. The counting wraps around the circle and may count some friends more than once.</li>
<li>The last friend you counted leaves the circle and loses the game.</li>
<li>If there is still more than one friend in the circle, go back to step 2 starting from the friend immediately clockwise of the friend who just lost and repeat.</li>
<li>Else, the last friend in the circle wins the game.</li>
</ol>
<p>Given the number of friends, <em>n</em>, and an integer <em>k</em>, return the winner of the game.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> n = 5, k = 2
<strong>Output:</strong> 3
<strong>Explanation:</strong> Here are the steps of the game:
1) Start at friend 1.
2) Count 2 friends clockwise, which are friends 1 and 2.
3) Friend 2 leaves the circle. Next start is friend 3.
4) Count 2 friends clockwise, which are friends 3 and 4.
5) Friend 4 leaves the circle. Next start is friend 5.
6) Count 2 friends clockwise, which are friends 5 and 1.
7) Friend 1 leaves the circle. Next start is friend 3.
8) Count 2 friends clockwise, which are friends 3 and 5.
9) Friend 5 leaves the circle. Only friend 3 is left, so they are the winner.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> n = 6, k = 5
<strong>Output:</strong> 1
<strong>Explanation:</strong> The friends leave in this order: 5, 4, 6, 2, 3. The winner is friend 1.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ <em>k</em> ≤ <em>n</em> ≤ 500</li>
</ul>
<p><strong>Follow up:</strong></p>
<p>Could you solve this problem in linear time with constant space?</p>
