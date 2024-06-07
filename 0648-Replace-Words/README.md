<h2><a href="https://leetcode.com/problems/replace-words">648. Replace Words</a></h2>
<h3>Medium</h3>
<hr>
<p>In English, we have a concept called root, which can be followed by some other word to form another longer word - let's call this word derivative. For example, when the root "help" is followed by the word "ful", we can form a derivative "helpful".</p>

<p>Given a dictionary consisting of many roots and a sentence consisting of words separated by spaces, replace all the derivatives in the sentence with the root forming it. If a derivative can be replaced by more than one root, replace it with the root that has the shortest length.</p>

<p>Return the sentence after the replacement.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> dictionary = ["cat","bat","rat"], sentence = "the cattle was rattled by the battery"
<strong>Output:</strong> "the cat was rat by the bat"
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> dictionary = ["a","b","c"], sentence = "aadsfasf absbs bbab cadsfafs"
<strong>Output:</strong> "a a b c"
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li>1 <= dictionary.length <= 1000</li>
<li>1 <= dictionary[i].length <= 100</li>
<li>dictionary[i] consists of only lower-case letters.</li>
<li>1 <= sentence.length <= 10<sup>6</sup></li>
<li>sentence consists of only lower-case letters and spaces.</li>
<li>The number of words in sentence is in the range [1, 1000]</li>
<li>The length of each word in sentence is in the range [1, 1000]</li>
<li>Every two consecutive words in sentence will be separated by exactly one space.</li>
<li>sentence does not have leading or trailing spaces.</li>
</ul>
