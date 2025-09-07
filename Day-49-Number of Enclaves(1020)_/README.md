<h2><a href="https://leetcode.com/problems/number-of-enclaves/">Number of Enclaves</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Medium-orange" alt="Difficulty: Medium" />
<hr>

<p>You are given an <code>m x n</code> binary grid <code>grid</code> where:</p>
<ul>
  <li><code>0</code> represents a water cell,</li>
  <li><code>1</code> represents a land cell.</li>
</ul>

<p>An <strong>enclave</strong> is a group of <code>1</code>'s (land cells) that are completely surrounded by <code>0</code>'s (water cells). Return the number of land cells in all enclaves.</p>

<p><strong>Note:</strong> An enclave is a group of land cells that cannot reach the boundary of the grid by moving 4-directionally.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>
<img alt="Enclaves Example 1" src="https://assets.leetcode.com/uploads/2021/02/18/enclaves1.jpg" style="width:300px; height:auto;" />
<pre>
<strong>Input:</strong> grid = [
  [0,0,0,0],
  [1,0,1,0],
  [0,1,1,0],
  [0,0,0,0]
]
<strong>Output:</strong> 3
<strong>Explanation:</strong> There are three 1's that are enclosed by 0's.
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="Enclaves Example 2" src="https://assets.leetcode.com/uploads/2021/02/18/enclaves2.jpg" style="width:300px; height:auto;" />
<pre>
<strong>Input:</strong> grid = [
  [0,1,1,0],
  [0,1,0,0],
  [0,0,1,1],
  [0,0,0,0]
]
<strong>Output:</strong> 0
<strong>Explanation:</strong> There are no 1's that are enclosed by 0's.
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>m == grid.length</code></li>
  <li><code>n == grid[i].length</code></li>
  <li><code>1 ≤ m, n ≤ 100</code></li>
  <li><code>grid[i][j]</code> is either <code>0</code> or <code>1</code>.</li>
</ul>
