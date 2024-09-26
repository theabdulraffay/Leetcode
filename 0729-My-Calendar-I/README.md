<h2><a href="https://leetcode.com/problems/my-calendar-i">729. My Calendar I</a></h2>
<h3>Medium</h3>
<hr>

<p>You are implementing a program to use as your calendar. We can add a new event if adding the event will not cause a double booking.</p>

<p>A double booking happens when two events have some non-empty intersection (i.e., some moment is common to both events).</p>

<p>The event can be represented as a pair of integers <code>start</code> and <code>end</code> that represents a booking on the half-open interval [start, end), the range of real numbers <code>x</code> such that <code>start &lt;= x &lt; end</code>.</p>

<p>Implement the <code>MyCalendar</code> class:</p>

<ul>
  <li><code>MyCalendar()</code> Initializes the calendar object.</li>
  <li><code>boolean book(int start, int end)</code> Returns true if the event can be added to the calendar successfully without causing a double booking. Otherwise, return false and do not add the event to the calendar.</li>
</ul>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> 
["MyCalendar", "book", "book", "book"]
[[], [10, 20], [15, 25], [20, 30]]

<strong>Output:</strong> 
[null, true, false, true]

<strong>Explanation:</strong> 
MyCalendar myCalendar = new MyCalendar();
myCalendar.book(10, 20); // return True
myCalendar.book(15, 25); // return False, as time 15 is already booked by another event.
myCalendar.book(20, 30); // return True, as the first event ends at 20, so it can be booked.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>0 &lt;= start &lt; end &lt;= 10^9</code></li>
  <li>At most <code>1000</code> calls will be made to <code>book</code>.</li>
</ul>
