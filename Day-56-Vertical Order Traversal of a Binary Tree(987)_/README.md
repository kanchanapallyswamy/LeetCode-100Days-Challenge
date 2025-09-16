<h2><a href="https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/">Vertical Order Traversal of a Binary Tree</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Hard-red" alt="Difficulty: Hard" />
<hr>

<p>Given the root of a binary tree, calculate the vertical order traversal of its nodes' values. (i.e., from top to bottom, column by column). If two nodes are in the same row and column, the order should be from left to right.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>
<img alt="Vertical Tree Example 1" src="https://assets.leetcode.com/uploads/2021/01/29/vtree1.jpg" style="width:300px; height:auto;" />
<pre>
<strong>Input:</strong> root = [3,9,20,null,null,15,7]
<strong>Output:</strong> [[9],[3,15],[20],[7]]
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="Vertical Tree Example 2" src="https://assets.leetcode.com/uploads/2021/01/29/vtree2.jpg" style="width:300px; height:auto;" />
<pre>
<strong>Input:</strong> root = [1,2,3,4,5,6,7]
<strong>Output:</strong> [[4],[2],[1,5,6],[3],[7]]
</pre>

<p><strong class="example">Example 3:</strong></p>
<img alt="Vertical Tree Example 3" src="https://assets.leetcode.com/uploads/2021/01/29/vtree3.jpg" style="width:300px; height:auto;" />
<pre>
<strong>Input:</strong> root = [1,2,3,4,6,5,7]
<strong>Output:</strong> [[4],[2],[1,5,6],[3],[7]]
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>root</code> is a binary tree with <code>n</code> nodes.</li>
  <li><code>1 &lt;= n &lt;= 1000</code></li>
  <li><code>-1000 &lt;= Node.val &lt;= 1000</code></li>
</ul>
