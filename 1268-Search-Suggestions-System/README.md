<h2><a href="https://leetcode.com/problems/search-suggestions-system">1268. Search Suggestions System</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given an array of strings <code>products</code> and a string <code>searchWord</code>.</p>
<p>Design a system that suggests at most three product names from <code>products</code> after each character of <code>searchWord</code> is typed. Suggested products should have a common prefix with <code>searchWord</code>. If there are more than three products with a common prefix, return the three lexicographically smallest products.</p>
<p>Return a list of lists of the suggested products after each character of <code>searchWord</code> is typed.</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> products = ["mobile","mouse","moneypot","monitor","mousepad"], searchWord = "mouse"
<strong>Output:</strong> [["mobile","moneypot","monitor"],["mobile","moneypot","monitor"],["mouse","mousepad"],["mouse","mousepad"],["mouse","mousepad"]]
<strong>Explanation:</strong> 
products sorted lexicographically = ["mobile","moneypot","monitor","mouse","mousepad"].
After typing "m" and "mo", all products match, and the system suggests ["mobile","moneypot","monitor"].
After typing "mou", "mous", and "mouse", the system suggests ["mouse","mousepad"].
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> products = ["havana"], searchWord = "havana"
<strong>Output:</strong> [["havana"],["havana"],["havana"],["havana"],["havana"],["havana"]]
<strong>Explanation:</strong> The only word "havana" will always be suggested while typing the search word.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
<li><code>1 <= products.length <= 1000</code></li>
<li><code>1 <= products[i].length <= 3000</code></li>
<li><code>1 <= sum(products[i].length) <= 2 * 10<sup>4</sup></code></li>
<li>All the strings of <code>products</code> are unique.</li>
<li><code>products[i]</code> consists of lowercase English letters.</li>
<li><code>1 <= searchWord.length <= 1000</code></li>
<li><code>searchWord</code> consists of lowercase English letters.</li>
</ul>
