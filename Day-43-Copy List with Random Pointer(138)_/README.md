<h2><a href="https://leetcode.com/problems/copy-list-with-random-pointer/">Copy List with Random Pointer</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Medium-orange" alt="Difficulty: Medium" />
<hr>

<p>A linked list of length <code>n</code> is given such that each node contains an additional <strong>random</strong> pointer, which could point to any node in the list, or <code>null</code>.</p>

<p>Construct a <strong>deep copy</strong> of the list. The deep copy should consist of exactly <code>n</code> brand new nodes, where each new node has its value set to the value of its corresponding original node. Both the <code>next</code> and <code>random</code> pointers of the new nodes should point to new nodes in the copied list such that the pointers in the original list and copied list represent the same list state. None of the pointers in the new list should point to nodes in the original list.</p>

<p>Return the head of the copied linked list.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>
<img alt="Example 1" src="https://assets.leetcode.com/uploads/2019/12/18/e1.png" style="width:300px; height:auto;" />
<pre>
<strong>Input:</strong> head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
<strong>Output:</strong> [[7,null],[13,0],[11,4],[10,2],[1,0]]
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="Example 2" src="https://assets.leetcode.com/uploads/2019/12/18/e2.png" style="width:300px; height:auto;" />
<pre>
<strong>Input:</strong> head = [[1,1],[2,1]]
<strong>Output:</strong> [[1,1],[2,1]]
</pre>

<p><strong class="example">Example 3:</strong></p>
<img alt="Example 3" src="https://assets.leetcode.com/uploads/2019/12/18/e3.png" style="width:300px; height:auto;" />
<pre>
<strong>Input:</strong> head = [[3,null],[3,0],[3,null]]
<strong>Output:</strong> [[3,null],[3,0],[3,null]]
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>0 &le; n &le; 1000</code></li>
  <li><code>-10<sup>4</sup> &le; Node.val &le; 10<sup>4</sup></code></li>
  <li><code>Node.random</code> is <code>null</code> or is pointing to some node in the linked list.</li>
</ul>
