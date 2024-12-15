<h2><a href="https://leetcode.com/problems/maximum-average-pass-ratio">1792. Maximum Average Pass Ratio</a></h2>
<h3>Medium</h3>
<hr>
<p>There is a school that has classes of students, and each class will have a final exam. You are given a 2D integer array <code>classes</code>, where <code>classes[i] = [passi, totali]</code>. You know beforehand that in the <code>i<sup>th</sup></code> class, there are <code>totali</code> total students, but only <code>passi</code> students will pass the exam.</p>

<p>You are also given an integer <code>extraStudents</code>, representing the number of additional brilliant students who are guaranteed to pass the exam of any class they are assigned to. You want to assign these <code>extraStudents</code> to the classes in a way that maximizes the average pass ratio across all the classes.</p>

<p>The pass ratio of a class is calculated as:</p>
<pre>
pass ratio = passi / totali
</pre>

<p>The average pass ratio is the sum of the pass ratios of all classes divided by the number of classes.</p>

<p>Return the maximum possible average pass ratio after assigning all the <code>extraStudents</code>. Answers within <code>10<sup>-5</sup></code> of the actual answer will be accepted.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> classes = [[1,2],[3,5],[2,2]], extraStudents = 2
<strong>Output:</strong> 0.78333
<strong>Explanation:</strong> 
You can assign the two extra students to the first class. 
The average pass ratio will be:
(3/4 + 3/5 + 2/2) / 3 = 0.78333.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> classes = [[2,4],[3,9],[4,5],[2,10]], extraStudents = 4
<strong>Output:</strong> 0.53485
</pre>

<p><strong>Constraints:</strong></p>
<ul>
    <li><code>1 <= classes.length <= 10<sup>5</sup></code></li>
    <li><code>classes[i].length == 2</code></li>
    <li><code>1 <= passi <= totali <= 10<sup>5</sup></code></li>
    <li><code>1 <= extraStudents <= 10<sup>5</sup></code></li>
</ul>
