<h2><a href="https://leetcode.com/problems/student-attendance-record-i">551. Student Attendance Record I</a></h2>
<h3>Easy</h3>
<hr>
<p>You are given a string <em>s</em> representing an attendance record for a student where each character signifies whether the student was absent, late, or present on that day. The record only contains the following three characters:</p>
<ul>
<li>'A': Absent.</li>
<li>'L': Late.</li>
<li>'P': Present.</li>
</ul>
<p>The student is eligible for an attendance award if they meet both of the following criteria:</p>
<ol>
<li>The student was absent ('A') for strictly fewer than 2 days total.</li>
<li>The student was never late ('L') for 3 or more consecutive days.</li>
</ol>
<p>Return true if the student is eligible for an attendance award, or false otherwise.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> s = "PPALLP"
<strong>Output:</strong> true
<strong>Explanation:</strong> The student has fewer than 2 absences and was never late 3 or more consecutive days.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> s = "PPALLL"
<strong>Output:</strong> false
<strong>Explanation:</strong> The student was late 3 consecutive days in the last 3 days, so is not eligible for the award.
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ <em>s.length</em> ≤ 1000</li>
<li><em>s[i]</em> is either 'A', 'L', or 'P'.</li>
</ul>
