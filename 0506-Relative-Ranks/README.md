<h2><a href="https://leetcode.com/problems/relative-ranks">506. Relative Ranks</a></h2>
<h3>Easy</h3>
<hr>
<p>You are given an integer array <code>score</code> of size <code>n</code>, where <code>score[i]</code> is the score of the <code>ith</code> athlete in a competition. All the scores are guaranteed to be unique.</p>
<p>The athletes are placed based on their scores, where the 1st place athlete has the highest score, the 2nd place athlete has the 2nd highest score, and so on. The placement of each athlete determines their rank:</p>
<ul>
<li>The 1st place athlete's rank is "Gold Medal".</li>
<li>The 2nd place athlete's rank is "Silver Medal".</li>
<li>The 3rd place athlete's rank is "Bronze Medal".</li>
<li>For the 4th place to the <code>nth</code> place athlete, their rank is their placement number (i.e., the <code>x</code>th place athlete's rank is "<code>x</code>").</li>
</ul>
<p>Return an array <code>answer</code> of size <code>n</code> where <code>answer[i]</code> is the rank of the <code>ith</code> athlete.</p>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> score = [5,4,3,2,1]
<strong>Output:</strong> ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
<strong>Explanation:</strong> The placements are [1st, 2nd, 3rd, 4th, 5th].
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> score = [10,3,8,9,4]
<strong>Output:</strong> ["Gold Medal","5","Bronze Medal","Silver Medal","4"]
<strong>Explanation:</strong> The placements are [1st, 5th, 3rd, 2nd, 4th].
</pre>
<p><strong>Constraints:</strong></p>
<ul>
<li><code>n == score.length</code></li>
<li><code>1 <= n <= 10^4</code></li>
<li><code>0 <= score[i] <= 10^6</code></li>
<li>All the values in <code>score</code> are unique.</li>
</ul>
