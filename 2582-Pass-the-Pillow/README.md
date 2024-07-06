<h2><a href="https://leetcode.com/problems/pass-the-pillow">2582. Pass the Pillow</a></h2>
<h3>Easy</h3>
<hr>
<p>There are <code>n</code> people standing in a line labeled from 1 to <code>n</code>. The first person in the line is holding a pillow initially. Every second, the person holding the pillow passes it to the next person standing in the line. Once the pillow reaches the end of the line, the direction changes, and people continue passing the pillow in the opposite direction.</p>

<p>For example, once the pillow reaches the <code>n</code>th person they pass it to the <code>n - 1</code>th person, then to the <code>n - 2</code>th person and so on.</p>
<p>Given the two positive integers <code>n</code> and <code>time</code>, return the index of the person holding the pillow after <code>time</code> seconds.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> n = 4, time = 5
<strong>Output:</strong> 2
<strong>Explanation:</strong> People pass the pillow in the following way: 1 -> 2 -> 3 -> 4 -> 3 -> 2.
After five seconds, the 2nd person is holding the pillow.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> n = 3, time = 2
<strong>Output:</strong> 3
<strong>Explanation:</strong> People pass the pillow in the following way: 1 -> 2 -> 3.
After two seconds, the 3rd person is holding the pillow.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>2 ≤ <code>n</code> ≤ 1000</li>
<li>1 ≤ <code>time</code> ≤ 1000</li>
</ul>
