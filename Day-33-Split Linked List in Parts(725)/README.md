<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
  <h2><a href="https://leetcode.com/problems/split-linked-list-in-parts/">Split Linked List in Parts</a></h2>
  <img src="https://img.shields.io/badge/Difficulty-Medium-orange" alt="Difficulty: Medium" />
  <hr>

  <p>Given the head of a singly linked list and an integer <code>k</code>, split the linked list into <code>k</code> consecutive linked list parts.</p>
  <p>Each part should have a length as equal as possible: no two parts should have a size differing by more than one. This may lead to some parts being <code>null</code> if there are fewer nodes than <code>k</code>. The earlier parts should have a greater or equal size than the later parts.</p>

  <p>&nbsp;</p>

  <p><strong class="example">Example 1:</strong></p>
  <img alt="Split Linked List Example 1" src="https://assets.leetcode.com/uploads/2021/06/13/split1-lc.jpg" style="width: 400px;" />
  <pre>
<strong>Input:</strong> head = [1,2,3], k = 5
<strong>Output:</strong> [[1],[2],[3],[],[]]
Explanation: The first three parts have one node each; the remaining two are empty.
  </pre>

  <p><strong class="example">Example 2:</strong></p>
  <img alt="Split Linked List Example 2" src="https://assets.leetcode.com/uploads/2021/06/13/split2-lc.jpg" style="width: 400px;" />
  <pre>
<strong>Input:</strong> head = [1,2,3,4,5,6,7,8,9,10], k = 3
<strong>Output:</strong> [[1,2,3,4],[5,6,7],[8,9,10]]
Explanation: Sizes are 4,3,3 because 10 divided by 3 = 3 with remainder 1, so the first part gets an extra node.
  </pre>

  <p>&nbsp;</p>
  <p><strong>Constraints:</strong></p>
  <ul>
    <li>The number of nodes in the list is in the range <code>[0, 1000]</code>.</li>
    <li><code>0 ≤ Node.val ≤ 1000</code></li>
    <li><code>1 ≤ k ≤ 50</code></li>
  </ul>

</body>
</html>
