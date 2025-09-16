<h2><a href="https://leetcode.com/problems/sum-root-to-leaf-numbers/">Sum Root to Leaf Numbers</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Medium-yellow" alt="Difficulty: Medium" />
<hr>

<p>Given the <code>root</code> of a binary tree containing digits from 0 to 9 only, each root-to-leaf path in the tree represents a number. Return the total sum of all root-to-leaf numbers.</p>

<p>A leaf is a node with no children.</p>

<p><strong>Example 1:</strong></p>
<img alt="Example 1" src="https://assets.leetcode.com/uploads/2021/02/19/num1tree.jpg" style="width:300px; height:auto;" />
<pre>
<strong>Input:</strong> root = [1,2,3]
<strong>Output:</strong> 25
<strong>Explanation:</strong> The root-to-leaf paths are:
[1,2] represents the number 12.
[1,3] represents the number 13.
Therefore, the sum is 12 + 13 = 25.
</pre>

<p><strong>Example 2:</strong></p>
<img alt="Example 2" src="https://assets.leetcode.com/uploads/2021/02/19/num2tree.jpg" style="width:300px; height:auto;" />
<pre>
<strong>Input:</strong> root = [4,9,0,5,1]
<strong>Output:</strong> 1026
<strong>Explanation:</strong> The root-to-leaf paths are:
[4,9,5] represents the number 495.
[4,9,1] represents the number 491.
[4,0] represents the number 40.
Therefore, the sum is 495 + 491 + 40 = 1026.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li>The number of nodes in the tree is in the range <code>[1, 1000]</code>.</li>
  <li><code>0 <= Node.val <= 9</code></li>
  <li>The depth of the tree will not exceed <code>10</code>.</li>
</ul>
