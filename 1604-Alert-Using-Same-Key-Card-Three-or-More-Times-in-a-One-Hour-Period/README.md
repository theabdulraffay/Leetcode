<h2><a href="https://leetcode.com/problems/alert-using-same-key-card-three-or-more-times-in-a-one-hour-period">1604. Alert Using Same Key-Card Three or More Times in a One Hour Period</a></h2>
<h3>Medium</h3>
<hr>
<p>LeetCode company workers use key-cards to unlock office doors. Each time a worker uses their key-card, the security system saves the worker's name and the time when it was used. The system emits an alert if any worker uses the key-card three or more times in a one-hour period.</p>

<p>You are given a list of strings <code>keyName</code> and <code>keyTime</code> where <code>[keyName[i], keyTime[i]]</code> corresponds to a person's name and the time when their key-card was used in a single day.</p>

<p>Access times are given in the 24-hour time format "HH:MM", such as "23:51" and "09:49".</p>

<p>Return a list of unique worker names who received an alert for frequent keycard use. Sort the names in ascending order alphabetically.</p>

<p>Notice that "10:00" - "11:00" is considered to be within a one-hour period, while "22:51" - "23:52" is not considered to be within a one-hour period.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> keyName = ["daniel","daniel","daniel","luis","luis","luis","luis"], keyTime = ["10:00","10:40","11:00","09:00","11:00","13:00","15:00"]
<strong>Output:</strong> ["daniel"]
<strong>Explanation:</strong> "daniel" used the keycard 3 times in a one-hour period ("10:00","10:40", "11:00").
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> keyName = ["alice","alice","alice","bob","bob","bob","bob"], keyTime = ["12:01","12:00","18:00","21:00","21:20","21:30","23:00"]
<strong>Output:</strong> ["bob"]
<strong>Explanation:</strong> "bob" used the keycard 3 times in a one-hour period ("21:00","21:20", "21:30").
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ <code>keyName.length, keyTime.length</code> ≤ 10<sup>5</sup></li>
<li><code>keyName.length == keyTime.length</code></li>
<li><code>keyTime[i]</code> is in the format "HH:MM".</li>
<li><code>[keyName[i], keyTime[i]]</code> is unique.</li>
<li>1 ≤ <code>keyName[i].length</code> ≤ 10</li>
<li><code>keyName[i]</code> contains only lowercase English letters.</li>
</ul>
