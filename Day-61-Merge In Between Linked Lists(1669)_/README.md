<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  
</head>
<body>
  <h1>1669. Merge In Between Linked Lists</h1>
  <p><strong>Medium</strong></p>

  <p>You are given two linked lists: <code>list1</code> and <code>list2</code> of sizes <code>n</code> and <code>m</code> respectively.</p>
  <p>Remove <code>list1</code>'s nodes from the <code>a<sup>th</sup></code> node to the <code>b<sup>th</sup></code> node, and put <code>list2</code> in their place.</p>
  <p>The blue edges and nodes in the following figure indicate the result:</p>

  <img src="https://assets.leetcode.com/uploads/2020/11/05/fig1.png" alt="Problem diagram" width="500">

  <p><i>Build the result list and return its head.</i></p>

  <h2>Example 1:</h2>
  <img src="https://assets.leetcode.com/uploads/2024/03/01/ll.png" alt="Example 1 diagram" width="500">
  <pre>
Input: list1 = [10,1,13,6,9,5], a = 3, b = 4, list2 = [1000000,1000001,1000002]
Output: [10,1,13,1000000,1000001,1000002,5]
Explanation: We remove the nodes 3 and 4 and put the entire list2 in their place. 
The blue edges and nodes in the above figure indicate the result.
  </pre>

  <h2>Example 2:</h2>
  <img src="https://assets.leetcode.com/uploads/2020/11/05/merge_linked_list_ex2.png" alt="Example 2 diagram" width="500">
  <pre>
Input: list1 = [0,1,2,3,4,5,6], a = 2, b = 5, list2 = [1000000,1000001,1000002,1000003,1000004]
Output: [0,1,1000000,1000001,1000002,1000003,1000004,6]
Explanation: The blue edges and nodes in the above figure indicate the result.
  </pre>

  <h2>Constraints:</h2>
  <ul>
    <li><code>3 &lt;= list1.length &lt;= 10<sup>4</sup></code></li>
    <li><code>1 &lt;= a &lt;= b &lt; list1.length - 1</code></li>
    <li><code>1 &lt;= list2.length &lt;= 10<sup>4</sup></code></li>
  </ul>
</body>
</html>
