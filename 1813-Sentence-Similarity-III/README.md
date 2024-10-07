<h2><a href="https://leetcode.com/problems/sentence-similarity-iii">1813. Sentence Similarity III</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given two strings <code>sentence1</code> and <code>sentence2</code>, each representing a sentence composed of words. A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of only uppercase and lowercase English characters.</p>

<p>Two sentences <code>s1</code> and <code>s2</code> are considered similar if it is possible to insert an arbitrary sentence (possibly empty) inside one of these sentences such that the two sentences become equal. Note that the inserted sentence must be separated from existing words by spaces.</p>

<p>For example:</p>
<ul>
<li><code>s1 = "Hello Jane"</code> and <code>s2 = "Hello my name is Jane"</code> can be made equal by inserting <code>"my name is"</code> between <code>"Hello"</code> and <code>"Jane"</code> in <code>s1</code>.</li>
<li><code>s1 = "Frog cool"</code> and <code>s2 = "Frogs are cool"</code> are not similar, since although there is a sentence <code>"s are"</code> inserted into <code>s1</code>, it is not separated from <code>"Frog"</code> by a space.</li>
</ul>

<p>Given two sentences <code>sentence1</code> and <code>sentence2</code>, return <code>true</code> if <code>sentence1</code> and <code>sentence2</code> are similar. Otherwise, return <code>false</code>.</p>

<h3>Example 1:</h3>
<pre>
<strong>Input:</strong> sentence1 = "My name is Haley", sentence2 = "My Haley"
<strong>Output:</strong> true
<strong>Explanation:</strong> sentence2 can be turned into sentence1 by inserting "name is" between "My" and "Haley".
</pre>

<h3>Example 2:</h3>
<pre>
<strong>Input:</strong> sentence1 = "of", sentence2 = "A lot of words"
<strong>Output:</strong> false
<strong>Explanation:</strong> No single sentence can be inserted inside one of the sentences to make it equal to the other.
</pre>

<h3>Example 3:</h3>
<pre>
<strong>Input:</strong> sentence1 = "Eating right now", sentence2 = "Eating"
<strong>Output:</strong> true
<strong>Explanation:</strong> sentence2 can be turned into sentence1 by inserting "right now" at the end of the sentence.
</pre>

<h3>Constraints:</h3>
<ul>
<li><code>1 <= sentence1.length, sentence2.length <= 100</code></li>
<li><code>sentence1</code> and <code>sentence2</code> consist of lowercase and uppercase English letters and spaces.</li>
<li>The words in <code>sentence1</code> and <code>sentence2</code> are separated by a single space.</li>
</ul>
