<h2><a href="https://leetcode.com/problems/rotting-oranges/">Rotting Oranges</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Medium-orange" alt="Difficulty: Medium" />
<hr>

<p>You are given an <code>m x n</code> grid where each cell can have one of three values:
<ul>
  <li><code>0</code> representing an empty cell,</li>
  <li><code>1</code> representing a fresh orange, or</li>
  <li><code>2</code> representing a rotten orange.</li>
</ul>
</p>

<p>Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten. Return the minimum number of minutes that must elapse until no cell has a fresh orange. If <strong>this is impossible</strong>, return <code>-1</code>.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>
<img alt="Rotting Oranges Example 1" src="https://assets.leetcode.com/uploads/2019/02/16/oranges.png" style="width:300px; height:auto;" />
<pre>
<strong>Input:</strong> grid = [
  [2,1,1],
  [1,1,0],
  [0,1,1]
]
<strong>Output:</strong> 4
<strong>Explanation:</strong> After 4 minutes, all oranges become rotten.
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre>
<strong>Input:</strong> grid = [
  [2,1,1],
  [0,1,1],
  [1,0,1]
]
<strong>Output:</strong> -1
<strong>Explanation:</strong> The fresh oranges in the bottom-left and top-right corners cannot rot because they are isolated by empty cells.
</pre>

<p><strong class="example">Example 3:</strong></p>
<pre>
<strong>Input:</strong> grid = [
  [0,2]
]
<strong>Output:</strong> 0
<strong>Explanation:</strong> Since there are no fresh oranges, the answer is 0.
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>m == grid.length</code></li>
  <li><code>n == grid[i].length</code></li>
  <li><code>1 ≤ m, n ≤ 10<sup>3</sup></code></li>
  <li><code>grid[i][j]</code> is <code>0</code>, <code>1</code>, or <code>2</code>.</li>
</ul>
