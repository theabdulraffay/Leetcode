<h2><a href="https://leetcode.com/problems/find-elements-in-a-contaminated-binary-tree">1261. Find Elements in a Contaminated Binary Tree</a></h2>
<h3>Medium</h3>
<hr>
<p>Given a binary tree with the following rules:</p>
<ul>
  <li><code>root.val == 0</code></li>
  <li>For any <code>treeNode</code>:
    <ul>
      <li>If <code>treeNode.val</code> has a value <code>x</code> and <code>treeNode.left != null</code>, then <code>treeNode.left.val == 2 * x + 1</code></li>
      <li>If <code>treeNode.val</code> has a value <code>x</code> and <code>treeNode.right != null</code>, then <code>treeNode.right.val == 2 * x + 2</code></li>
    </ul>
  </li>
</ul>
<p>Now the binary tree is contaminated, which means all <code>treeNode.val</code> have been changed to <code>-1</code>.</p>
<p>Implement the <code>FindElements</code> class:</p>
<ul>
  <li><code>FindElements(TreeNode* root)</code> Initializes the object with a contaminated binary tree and recovers it.</li>
  <li><code>bool find(int target)</code> Returns <code>true</code> if the target value exists in the recovered binary tree.</li>
</ul>
<p><strong>Example 1:</strong></p>
<pre>
<strong>Input</strong>
["FindElements","find","find"]
[[[-1,null,-1]],[1],[2]]
<strong>Output</strong>
[null,false,true]
<strong>Explanation</strong>
FindElements findElements = new FindElements([-1,null,-1]);
findElements.find(1); // return False
findElements.find(2); // return True
</pre>
<p><strong>Example 2:</strong></p>
<pre>
<strong>Input</strong>
["FindElements","find","find","find"]
[[[-1,-1,-1,-1,-1]],[1],[3],[5]]
<strong>Output</strong>
[null,true,true,false]
<strong>Explanation</strong>
FindElements findElements = new FindElements([-1,-1,-1,-1,-1]);
findElements.find(1); // return True
findElements.find(3); // return True
findElements.find(5); // return False
</pre>
<p><strong>Example 3:</strong></p>
<pre>
<strong>Input</strong>
["FindElements","find","find","find","find"]
[[[-1,null,-1,-1,null,-1]],[2],[3],[4],[5]]
<strong>Output</strong>
[null,true,false,false,true]
<strong>Explanation</strong>
FindElements findElements = new FindElements([-1,null,-1,-1,null,-1]);
findElements.find(2); // return True
findElements.find(3); // return False
findElements.find(4); // return False
findElements.find(5); // return True
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li><code>TreeNode.val == -1</code></li>
  <li>The height of the binary tree is less than or equal to 20</li>
  <li>The total number of nodes is between [1, 10<sup>4</sup>]</li>
  <li>Total calls of <code>find()</code> is between [1, 10<sup>4</sup>]</li>
  <li>0 <= <code>target</code> <= 10<sup>6</sup></li>
</ul>
