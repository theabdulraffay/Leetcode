<h2><a href="https://leetcode.com/problems/robot-collisions">2751. Robot Collisions</a></h2>
<h3>Hard</h3>
<hr>
<p>There are <code>n</code> 1-indexed robots, each having a position on a line, health, and movement direction.</p>

<p>You are given 0-indexed integer arrays <code>positions</code>, <code>healths</code>, and a string <code>directions</code> (directions[i] is either 'L' for left or 'R' for right). All integers in <code>positions</code> are unique.</p>

<p>All robots start moving on the line simultaneously at the same speed in their given directions. If two robots ever share the same position while moving, they will collide.</p>

<p>If two robots collide, the robot with lower health is removed from the line, and the health of the other robot decreases by one. The surviving robot continues in the same direction it was going. If both robots have the same health, they are both removed from the line.</p>

<p>Your task is to determine the health of the robots that survive the collisions, in the same order that the robots were given, i.e. final health of robot 1 (if survived), final health of robot 2 (if survived), and so on. If there are no survivors, return an empty array.</p>

<p>Return an array containing the health of the remaining robots (in the order they were given in the input), after no further collisions can occur.</p>

<p><strong>Note:</strong> The positions may be unsorted.</p>

<p><strong>Example 1:</strong></p>

<pre>
<strong>Input:</strong> positions = [5,4,3,2,1], healths = [2,17,9,15,10], directions = "RRRRR"
<strong>Output:</strong> [2,17,9,15,10]
<strong>Explanation:</strong> No collision occurs in this example, since all robots are moving in the same direction. So, the health of the robots in order from the first robot is returned, [2, 17, 9, 15, 10].
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input:</strong> positions = [3,5,2,6], healths = [10,10,15,12], directions = "RLRL"
<strong>Output:</strong> [14]
<strong>Explanation:</strong> There are 2 collisions in this example. Firstly, robot 1 and robot 2 will collide, and since both have the same health, they will be removed from the line. Next, robot 3 and robot 4 will collide and since robot 4's health is smaller, it gets removed, and robot 3's health becomes 15 - 1 = 14. Only robot 3 remains, so we return [14].
</pre>

<p><strong>Example 3:</strong></p>

<pre>
<strong>Input:</strong> positions = [1,2,5,6], healths = [10,10,11,11], directions = "RLRL"
<strong>Output:</strong> []
<strong>Explanation:</strong> Robot 1 and robot 2 will collide and since both have the same health, they are both removed. Robot 3 and 4 will collide and since both have the same health, they are both removed. So, we return an empty array, [].
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li>1 <= positions.length == healths.length == directions.length == n <= 10<sup>5</sup></li>
  <li>1 <= positions[i], healths[i] <= 10<sup>9</sup></li>
  <li>directions[i] == 'L' or directions[i] == 'R'</li>
  <li>All values in positions are distinct</li>
</ul>
