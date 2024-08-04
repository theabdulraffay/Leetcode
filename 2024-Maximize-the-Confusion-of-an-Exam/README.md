<h2><a href="https://leetcode.com/problems/maximize-the-confusion-of-an-exam">2024. Maximize the Confusion of an Exam</a></h2>
<h3>Medium</h3>
<hr>
<p>A teacher is writing a test with <code>n</code> true/false questions, with <code>'T'</code> denoting true and <code>'F'</code> denoting false. He wants to confuse the students by maximizing the number of consecutive questions with the same answer (multiple trues or multiple falses in a row).</p>

<p>You are given a string <code>answerKey</code>, where <code>answerKey[i]</code> is the original answer to the <code>i</code>th question. In addition, you are given an integer <code>k</code>, the maximum number of times you may perform the following operation:</p>
<ul>
  <li>Change the answer key for any question to <code>'T'</code> or <code>'F'</code> (i.e., set <code>answerKey[i]</code> to <code>'T'</code> or <code>'F'</code>).</li>
</ul>
<p>Return the maximum number of consecutive <code>'T'</code>s or <code>'F'</code>s in the answer key after performing the operation at most <code>k</code> times.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> answerKey = "TTFF", k = 2
<strong>Output:</strong> 4
<strong>Explanation:</strong> We can replace both the 'F's with 'T's to make answerKey = "TTTT". There are four consecutive 'T's.
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> answerKey = "TFFT", k = 1
<strong>Output:</strong> 3
<strong>Explanation:</strong> We can replace the first 'T' with an 'F' to make answerKey = "FFFT". Alternatively, we can replace the second 'T' with an 'F' to make answerKey = "TFFF". In both cases, there are three consecutive 'F's.
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> answerKey = "TTFTTFTT", k = 1
<strong>Output:</strong> 5
<strong>Explanation:</strong> We can replace the first 'F' to make answerKey = "TTTTTFTT". Alternatively, we can replace the second 'F' to make answerKey = "TTFTTTTT". In both cases, there are five consecutive 'T's.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>n == answerKey.length</code></li>
  <li><code>1 <= n <= 5 * 10<sup>4</sup></code></li>
  <li><code>answerKey[i]</code> is either <code>'T'</code> or <code>'F'</code></li>
  <li><code>1 <= k <= n</code></li>
</ul>
