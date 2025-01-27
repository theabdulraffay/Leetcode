<h2><a href="https://leetcode.com/problems/course-schedule-iv">1462. Course Schedule IV</a></h2>
<h3>Medium</h3>
<hr>
<p>There are a total of <code>numCourses</code> courses you have to take, labeled from <code>0</code> to <code>numCourses - 1</code>. You are given an array <code>prerequisites</code> where <code>prerequisites[i] = [a<sub>i</sub>, b<sub>i</sub>]</code> indicates that you must take course <code>a<sub>i</sub></code> first if you want to take course <code>b<sub>i</sub></code>.</p>
<p>For example, the pair <code>[0, 1]</code> indicates that you have to take course <code>0</code> before you can take course <code>1</code>.</p>
<p>Prerequisites can also be indirect. If course <code>a</code> is a prerequisite of course <code>b</code>, and course <code>b</code> is a prerequisite of course <code>c</code>, then course <code>a</code> is a prerequisite of course <code>c</code>.</p>
<p>You are also given an array <code>queries</code> where <code>queries[j] = [u<sub>j</sub>, v<sub>j</sub>]</code>. For the <code>j<sup>th</sup></code> query, you should answer whether course <code>u<sub>j</sub></code> is a prerequisite of course <code>v<sub>j</sub></code> or not.</p>
<p>Return a boolean array <code>answer</code>, where <code>answer[j]</code> is the answer to the <code>j<sup>th</sup></code> query.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> numCourses = 2, prerequisites = [[1,0]], queries = [[0,1],[1,0]]
<strong>Output:</strong> [false,true]
<strong>Explanation:</strong> The pair [1, 0] indicates that you have to take course 1 before you can take course 0.
Course 0 is not a prerequisite of course 1, but the opposite is true.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> numCourses = 2, prerequisites = [], queries = [[1,0],[0,1]]
<strong>Output:</strong> [false,false]
<strong>Explanation:</strong> There are no prerequisites, and each course is independent.
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> numCourses = 3, prerequisites = [[1,2],[1,0],[2,0]], queries = [[1,0],[1,2]]
<strong>Output:</strong> [true,true]
<strong>Explanation:</strong> 
- Course 1 is a direct prerequisite of course 0.
- Course 1 is also a direct prerequisite of course 2, and course 2 is a prerequisite of course 0, making course 1 an indirect prerequisite of course 0.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>2 <= numCourses <= 100</code></li>
  <li><code>0 <= prerequisites.length <= (numCourses * (numCourses - 1) / 2)</code></li>
  <li><code>prerequisites[i].length == 2</code></li>
  <li><code>0 <= a<sub>i</sub>, b<sub>i</sub> <= numCourses - 1</code></li>
  <li><code>a<sub>i</sub> != b<sub>i</sub></code></li>
  <li>All the pairs <code>[a<sub>i</sub>, b<sub>i</sub>]</code> are unique.</li>
  <li>The prerequisites graph has no cycles.</li>
  <li><code>1 <= queries.length <= 10<sup>4</sup></code></li>
  <li><code>0 <= u<sub>j</sub>, v<sub>j</sub> <= numCourses - 1</code></li>
  <li><code>u<sub>j</sub> != v<sub>j</sub></code></li>
</ul>
