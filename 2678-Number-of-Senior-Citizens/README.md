<h2><a href="https://leetcode.com/problems/number-of-senior-citizens">2678. Number of Senior Citizens</a></h2>
<h3>Easy</h3>
<hr>
<p>You are given a 0-indexed array of strings <code>details</code>. Each element of <code>details</code> provides information about a given passenger compressed into a string of length 15. The system is such that:</p>
<ul>
<li>The first ten characters consist of the phone number of passengers.</li>
<li>The next character denotes the gender of the person.</li>
<li>The following two characters are used to indicate the age of the person.</li>
<li>The last two characters determine the seat allotted to that person.</li>
</ul>
<p>Return the number of passengers who are strictly more than 60 years old.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> details = ["7868190130M7522","5303914400F9211","9273338290F4010"]
<strong>Output:</strong> 2
<strong>Explanation:</strong> The passengers at indices 0, 1, and 2 have ages 75, 92, and 40. Thus, there are 2 people who are over 60 years old.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> details = ["1313579440F2036","2921522980M5644"]
<strong>Output:</strong> 0
<strong>Explanation:</strong> None of the passengers are older than 60.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ <code>details.length</code> ≤ 100</li>
<li><code>details[i].length == 15</code></li>
<li><code>details[i]</code> consists of digits from '0' to '9'.</li>
<li><code>details[i][10]</code> is either 'M', 'F', or 'O'.</li>
<li>The phone numbers and seat numbers of the passengers are distinct.</li>
</ul>
