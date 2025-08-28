<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Sort Matrix by Diagonals</title>
</head>
<body>
  <h2>
    <a href="https://leetcode.com/problems/sort-matrix-by-diagonals/">
      Sort Matrix by Diagonals
    </a>
  </h2>
  <img src="https://img.shields.io/badge/Difficulty-Medium-orange" alt="Difficulty: Medium" />
  <hr>

  <p>Given a square matrix <code>grid</code>, sort each diagonal according to the following rules:</p>
  <ul>
    <li>Diagonals with a black arrow (bottom-left triangle) should be sorted in <strong>non-increasing</strong> order.</li>
    <li>Diagonals with a blue arrow (top-right triangle) should be sorted in <strong>non-decreasing</strong> order.</li>
  </ul>

  <p>&nbsp;</p>

  <p><strong class="example">Example 1:</strong></p>
  <img alt="Example 1" src="https://assets.leetcode.com/uploads/2024/12/29/4052example1drawio.png" style="width: 400px;" />
  <pre>
<strong>Input:</strong> grid = [[1,7,3],[9,8,2],[4,5,6]]
<strong>Output:</strong> [[8,2,3],[9,6,7],[4,5,1]]

<strong>Explanation:</strong>
The diagonals with a black arrow (bottom-left triangle) should be sorted in non-increasing order:
[1, 8, 6] becomes [8, 6, 1].
[9, 5] and [4] remain unchanged.

The diagonals with a blue arrow (top-right triangle) should be sorted in non-decreasing order:
[7, 2] becomes [2, 7].
[3] remains unchanged.
  </pre>

  <p><strong class="example">Example 2:</strong></p>
  <img alt="Example 2" src="https://assets.leetcode.com/uploads/2024/12/29/4052example2adrawio.png" style="width: 400px;" />
  <pre>
<strong>Input:</strong> grid = [[0,1],[1,2]]
<strong>Output:</strong> [[2,1],[1,0]]

<strong>Explanation:</strong>
The diagonals with a black arrow must be non-increasing,
so [0, 2] is changed to [2, 0].
The other diagonals are already in the correct order.
  </pre>

  <p><strong class="example">Example 3:</strong></p>
  <pre>
<strong>Input:</strong> grid = [[1]]
<strong>Output:</strong> [[1]]

<strong>Explanation:</strong>
Diagonals with exactly one element are already in order,
so no changes are needed.
  </pre>

  <p>&nbsp;</p>
  <p><strong>Constraints:</strong></p>
  <ul>
    <li><code>grid.length == grid[i].length == n</code></li>
    <li><code>1 ≤ n ≤ 10</code></li>
    <li><code>-10^5 ≤ grid[i][j] ≤ 10^5</code></li>
  </ul>
</body>
</html>
