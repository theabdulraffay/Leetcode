<h2><a href="https://leetcode.com/problems/longest-turbulent-subarray">978. Longest Turbulent Subarray</a></h2>
<h3>Medium</h3>
<hr>
<p>Given an integer array <code>arr</code>, return the length of a maximum size turbulent subarray of <code>arr</code>.</p>

<p>A subarray is turbulent if the comparison sign flips between each adjacent pair of elements in the subarray.</p>

<p>More formally, a subarray <code>[arr[i], arr[i + 1], ..., arr[j]]</code> of <code>arr</code> is said to be turbulent if and only if:</p>

<ul>
    <li>For <code>i <= k < j</code>:
        <ul>
            <li><code>arr[k] > arr[k + 1]</code> when <code>k</code> is odd, and</li>
            <li><code>arr[k] < arr[k + 1]</code> when <code>k</code> is even.</li>
        </ul>
    </li>
    <li>Or, for <code>i <= k < j</code>:
        <ul>
            <li><code>arr[k] > arr[k + 1]</code> when <code>k</code> is even, and</li>
            <li><code>arr[k] < arr[k + 1]</code> when <code>k</code> is odd.</li>
        </ul>
    </li>
</ul>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> arr = [9,4,2,10,7,8,8,1,9]
<strong>Output:</strong> 5
<strong>Explanation:</strong> arr[1] > arr[2] < arr[3] > arr[4] < arr[5]
</pre>

<p><strong>Example 2:</strong></p>
<pre>
<strong>Input:</strong> arr = [4,8,12,16]
<strong>Output:</strong> 2
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> arr = [100]
<strong>Output:</strong> 1
</pre>

<p><strong>Constraints:</strong></p>
<ul>
    <li><code>1 <= arr.length <= 4 * 10<sup>4</sup></code></li>
    <li><code>0 <= arr[i] <= 10<sup>9</sup></code></li>
</ul>
