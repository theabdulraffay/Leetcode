<h2><a href="https://leetcode.com/problems/number-of-students-unable-to-eat-lunch">1700. Number of Students Unable to Eat Lunch</a></h2>
<h3>Easy</h3>
<hr>
<p>The school cafeteria offers circular and square sandwiches at lunch break, referred to by numbers 0 and 1 respectively. All students stand in a queue. Each student either prefers square or circular sandwiches.</p>
<p>The number of sandwiches in the cafeteria is equal to the number of students. The sandwiches are placed in a stack. At each step:</p>
<ul>
<li>If the student at the front of the queue prefers the sandwich on the top of the stack, they will take it and leave the queue.</li>
<li>Otherwise, they will leave it and go to the queue's end.</li>
<li>This continues until none of the queue students want to take the top sandwich and are thus unable to eat.</li>
</ul>
<p>You are given two integer arrays <em>students</em> and <em>sandwiches</em> where <em>sandwiches[i]</em> is the type of the <em>i​​​​​​th</em> sandwich in the stack (<em>i = 0</em> is the top of the stack) and <em>students[j]</em> is the preference of the <em>j​​​​​​th</em> student in the initial queue (<em>j = 0</em> is the front of the queue). Return the number of students that are unable to eat.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> students = [1,1,0,0], sandwiches = [0,1,0,1]
<strong>Output:</strong> 0 
<strong>Explanation:</strong>
- Front student leaves the top sandwich and returns to the end of the line making students = [1,0,0,1].
- Front student leaves the top sandwich and returns to the end of the line making students = [0,0,1,1].
- Front student takes the top sandwich and leaves the line making students = [0,1,1] and sandwiches = [1,0,1].
- Front student leaves the top sandwich and returns to the end of the line making students = [1,1,0].
- Front student takes the top sandwich and leaves the line making students = [1,0] and sandwiches = [0,1].
- Front student leaves the top sandwich and returns to the end of the line making students = [0,1].
- Front student takes the top sandwich and leaves the line making students = [1] and sandwiches = [1].
- Front student takes the top sandwich and leaves the line making students = [] and sandwiches = [].
Hence all students are able to eat.
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> students = [1,1,1,0,0,1], sandwiches = [1,0,0,0,1,1]
<strong>Output:</strong> 3
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li>1 ≤ <em>students.length</em>, <em>sandwiches.length</em> ≤ 100</li>
<li><em>students.length == sandwiches.length</em></li>
<li><em>sandwiches[i]</em> is 0 or 1.</li>
<li><em>students[i]</em> is 0 or 1.</li>
</ul>
