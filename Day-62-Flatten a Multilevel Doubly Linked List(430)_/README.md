<h2><a href="https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/description/?envType=problem-list-v2&envId=linked-list">
430. Flatten a Multilevel Doubly Linked List</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Medium-yellow" alt="Difficulty: Medium" />
<hr>

<p>You are given a doubly linked list, which contains nodes that have a next pointer, a previous pointer, and an additional <strong>child pointer</strong>. 
This child pointer may or may not point to a separate doubly linked list, also containing these special nodes. 
These child lists may have one or more children of their own, and so on, to produce a <strong>multilevel data structure</strong>.</p>

<p>Given the <code>head</code> of the first level of the list, <strong>flatten</strong> the list so that all the nodes appear in a single-level, doubly linked list. 
The nodes in the child list must appear <em>after</em> the current node and <em>before</em> the next node in the flattened list.</p>

<p>Return the <code>head</code> of the flattened list. All child pointers must be set to <code>null</code>.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>
<img alt="Example 1" src="https://assets.leetcode.com/uploads/2021/11/09/flatten11.jpg" style="width:600px; height:auto;" />
<pre>
<strong>Input:</strong> head = [1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12]
<strong>Output:</strong> [1,2,3,7,8,11,12,9,10,4,5,6]
</pre>
<img alt="Example 1 Flattened" src="https://assets.leetcode.com/uploads/2021/11/09/flatten12.jpg" style="width:600px; height:auto;" />

<p><strong class="example">Example 2:</strong></p>
<img alt="Example 2" src="https://assets.leetcode.com/uploads/2021/11/09/flatten2.1jpg" style="width:300px; height:auto;" />
<pre>
<strong>Input:</strong> head = [1,2,null,3]
<strong>Output:</strong> [1,3,2]
</pre>

<p><strong class="example">Example 3:</strong></p>
<img alt="Example 3" src="https://assets.leetcode.com/uploads/2021/11/24/list.jpg" style="width:300px; height:auto;" />
<pre>
<strong>Input:</strong> head = []
<strong>Output:</strong> []
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li>The number of nodes will not exceed <code>1000</code>.</li>
  <li><code>1 &lt;= Node.val &lt;= 10^5</code></li>
</ul>
