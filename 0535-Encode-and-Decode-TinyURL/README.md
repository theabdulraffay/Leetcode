<h2><a href="https://leetcode.com/problems/encode-and-decode-tinyurl">535. Encode and Decode TinyURL</a></h2>
<h3>Medium</h3>
<hr>
<p>Note: This is a companion problem to the System Design problem: Design TinyURL.<br>
TinyURL is a URL shortening service where you enter a URL such as <code>https://leetcode.com/problems/design-tinyurl</code> and it returns a short URL such as <code>http://tinyurl.com/4e9iAk</code>. Design a class to encode a URL and decode a tiny URL.</p>

<p>There is no restriction on how your encode/decode algorithm should work. You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can be decoded to the original URL.</p>

<p>Implement the <code>Solution</code> class:</p>
<ul>
    <li><code>Solution()</code> Initializes the object of the system.</li>
    <li><code>String encode(String longUrl)</code> Returns a tiny URL for the given <code>longUrl</code>.</li>
    <li><code>String decode(String shortUrl)</code> Returns the original long URL for the given <code>shortUrl</code>. It is guaranteed that the given <code>shortUrl</code> was encoded by the same object.</li>
</ul>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> url = "https://leetcode.com/problems/design-tinyurl"
<strong>Output:</strong> "https://leetcode.com/problems/design-tinyurl"

<strong>Explanation:</strong> 
Solution obj = new Solution();
string tiny = obj.encode(url
