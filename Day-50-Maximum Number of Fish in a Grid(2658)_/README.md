<h2><a href="https://leetcode.com/problems/maximum-number-of-fish-in-a-grid/">Maximum Number of Fish in a Grid</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Medium-orange" alt="Difficulty: Medium" />
<hr>

<p>You are given an <code>m x n</code> integer matrix <code>grid</code> representing the grid of a fishing area. Initially, all cells are empty, except for some cells containing fish. The fisher can start at any water cell (a cell with value 0) and can move to any adjacent water cell (up, down, left, or right). The fisher can catch all the fish in a connected region of water cells.</p>

<p>Return <em>the maximum number of fish the fisher can catch if he chooses his starting cell optimally</em>, or <code>0</code> if no water cell exists.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>
<img alt="Example 1" src="https://assets.leetcode.com/uploads/2023/03/29/example.png" style="width:300px; height:auto;" />
<pre>
<strong>Input:</strong> grid = [
  [0,2,1,0],
  [1,1,0,0],
  [0,0,1,1],
  [0,0,0,1]
]
<strong>Output:</strong> 4
<strong>Explanation:</strong> The fisher can start at the cell (0,0) and catch all 4 fish in the connected region.
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="Example 2" src="https://assets.leetcode.com/uploads/2023/03/29/example2.png" style="width:300px; height:auto;" />
<pre>
<strong>Input:</strong> grid = [
  [0,0,0,0],
  [0,0,0,0],
  [0,0,0,0],
  [0,0,0,0]
]
<strong>Output:</strong> 0
<strong>Explanation:</strong> There are no fish in the grid.
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>m == grid.length</code></li>
  <li><code>n == grid[i].length</code></li>
  <li><code>1 ≤ m, n ≤ 50</code></li>
  <li><code>0 ≤ grid[i][j] ≤ 100</code></li>
</ul>
