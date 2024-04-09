<h2><a href="https://leetcode.com/problems/time-needed-to-buy-tickets">2073. Time Needed to Buy Tickets</a></h2>
<h3>Medium</h3>
<hr>
<p>There are <em>n</em> people in a line queuing to buy tickets, where the 0th person is at the front of the line and the (<em>n</em> - 1)th person is at the back of the line.</p>
<p>You are given a 0-indexed integer array <em>tickets</em> of length <em>n</em> where the number of tickets that the <em>i</em>th person would like to buy is <em>tickets[i]</em>.</p>
<p>Each person takes exactly 1 second to buy a ticket. A person can only buy 1 ticket at a time and has to go back to the end of the line (which happens instantaneously) in order to buy more tickets. If a person does not have any tickets left to buy, the person will leave the line.</p>
<p>Return the time taken for the person at position <em>k</em> (0-indexed) to finish buying tickets.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> tickets = [2,3,2], k = 2
<strong>Output:</strong> 6
<strong>Explanation:</strong> 
- In the first pass, everyone in the line buys a ticket and the line becomes [1, 2, 1].
- In the second pass, everyone in the line buys a ticket and the line becomes [0, 1, 0].
The person at position 2 has successfully bought 2 tickets and it took 3 + 3 = 6 seconds.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> tickets = [5,1,1,1], k = 0
<strong>Output:</strong> 8
<strong>Explanation:</strong>
- In the first pass, everyone in the line buys a ticket and the line becomes [4, 0, 0, 0].
- In the next 4 passes, only the person in position 0 is buying tickets.
The person at position 0 has successfully bought 5 tickets and it took 4 + 1 + 1 + 1 + 1 = 8 seconds.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li><em>n == tickets.length</em></li>
<li>1 ≤ <em>n</em> ≤ 100</li>
<li>1 ≤ <em>tickets[i]</em> ≤ 100</li>
<li>0 ≤ <em>k</em> < <em>n</em></li>
</ul>
