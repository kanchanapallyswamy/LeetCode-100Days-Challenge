<h2><a href="https://leetcode.com/problems/binary-tree-right-side-view/">Binary Tree Right Side View</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Medium-yellow" alt="Difficulty: Medium" />
<hr>

<p>Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>
<img alt="Binary Tree Right Side View Example 1" src="https://assets.leetcode.com/uploads/2024/11/24/tmpd5jn43fs-1.png" style="width:300px; height:auto;" />
<pre>
<strong>Input:</strong> root = [1,2,3,null,5,null,4]
<strong>Output:</strong> [1,3,4]
<strong>Explanation:</strong>
  1 <--- Rightmost node at level 0
 / \
2   3 <--- Rightmost node at level 1
     \
      4 <--- Rightmost node at level 2
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="Binary Tree Right Side View Example 2" src="https://assets.leetcode.com/uploads/2024/11/24/tmpkpe40xeh-1.png" style="width:300px; height:auto;" />
<pre>
<strong>Input:</strong> root = [1,null,3]
<strong>Output:</strong> [1,3]
<strong>Explanation:</strong>
  1 <--- Rightmost node at level 0
   \
    3 <--- Rightmost node at level 1
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li>The number of nodes in the tree is in the range [0, 1000].</li>
  <li>0 <= Node.val <= 1000</li>
</ul>

<p><strong>Explanation:</strong></p>
<ul>
  <li>Perform a level-order traversal (BFS) of the binary tree.</li>
  <li>At each level, the last node encountered is the rightmost node.</li>
  <li>Collect these rightmost nodes to form the right side view of the tree.</li>
</ul>
