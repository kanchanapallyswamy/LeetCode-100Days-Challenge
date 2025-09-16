<h2><a href="https://leetcode.com/problems/path-sum-ii/">Path Sum II</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Medium-yellow" alt="Difficulty: Medium" />
<hr>

<p>Given the <code>root</code> of a binary tree and an integer <code>targetSum</code>, return all root-to-leaf paths where the sum of the node values in the path equals <code>targetSum</code>. Each path should be returned as a list of the node values, not node references.</p>

<p>A root-to-leaf path is a path starting from the root and ending at any leaf node. A leaf is a node with no children.</p>

<p><strong>Example 1:</strong></p>
<img alt="Example 1" src="https://assets.leetcode.com/uploads/2021/01/18/pathsumii1.jpg" style="width:300px; height:auto;" />
<pre>
<strong>Input:</strong> root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
<strong>Output:</strong> [[5,4,11,2],[5,8,4,5]]
<strong>Explanation:</strong> There are two paths whose sum equals targetSum:
5 + 4 + 11 + 2 = 22
5 + 8 + 4 + 5 = 22
</pre>

<p><strong>Example 2:</strong></p>
<img alt="Example 2" src="https://assets.leetcode.com/uploads/2021/01/18/pathsum2.jpg" style="width:300px; height:auto;" />
<pre>
<strong>Input:</strong> root = [1,2,3], targetSum = 5
<strong>Output:</strong> []
<strong>Explanation:</strong> There are no paths whose sum equals targetSum.
</pre>

<p><strong>Example 3:</strong></p>
<pre>
<strong>Input:</strong> root = [1,2], targetSum = 0
<strong>Output:</strong> []
<strong>Explanation:</strong> There are no paths whose sum equals targetSum.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li>The number of nodes in the tree is in the range <code>[0, 5000]</code>.</li>
  <li><code>-1000 <= Node.val <= 1000</code></li>
  <li><code>-1000 <= targetSum <= 1000</code></li>
</ul>
