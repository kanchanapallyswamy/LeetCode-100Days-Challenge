<h2><a href="https://leetcode.com/problems/unique-paths-iii/description/">
980. Unique Paths III</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Hard-red" alt="Difficulty: Hard" />
<hr>
<p>You are given an m x n integer array <code>grid</code> where <code>grid[i][j]</code> could be:</p>
<ul>
  <li>1 representing the starting square. There is exactly one starting square.</li>
  <li>2 representing the ending square. There is exactly one ending square.</li>
  <li>0 representing empty squares we can walk over.</li>
  <li>-1 representing obstacles that we cannot walk over.</li>
</ul>
<p>Return the number of 4-directional walks from the starting square to the ending square, that walk over every non-obstacle square exactly once.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>
<img alt="Example 1" src="https://assets.leetcode.com/uploads/2021/08/02/lc-unique1.jpg" style="width: 400px; height: auto;" />
<pre>
<strong>Input:</strong> grid = [[1,0,0,0],[0,0,0,0],[0,0,2,-1]]
<strong>Output:</strong> 2
<strong>Explanation:</strong> We have the following two paths: 
1. (0,0),(0,1),(0,2),(0,3),(1,3),(1,2),(1,1),(1,0),(2,0),(2,1),(2,2)
2. (0,0),(1,0),(2,0),(2,1),(1,1),(0,1),(0,2),(0,3),(1,3),(1,2),(2,2)
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="Example 2" src="https://assets.leetcode.com/uploads/2021/08/02/lc-unique2.jpg" style="width: 400px; height: auto;" />
<pre>
<strong>Input:</strong> grid = [[1,0,0,0],[0,0,0,0],[0,0,0,2]]
<strong>Output:</strong> 4
<strong>Explanation:</strong> We have the following four paths: 
1. (0,0),(0,1),(0,2),(0,3),(1,3),(1,2),(1,1),(1,0),(2,0),(2,1),(2,2),(2,3)
2. (0,0),(0,1),(1,1),(1,0),(2,0),(2,1),(2,2),(1,2),(0,2),(0,3),(1,3),(2,3)
3. (0,0),(1,0),(2,0),(2,1),(2,2),(1,2),(1,1),(0,1),(0,2),(0,3),(1,3),(2,3)
4. (0,0),(1,0),(2,0),(2,1),(1,1),(0,1),(0,2),(0,3),(1,3),(1,2),(2,2),(2,3)
</pre>

<p><strong class="example">Example 3:</strong></p>
<img alt="Example 3" src="https://assets.leetcode.com/uploads/2021/08/02/lc-unique3-.jpg" style="width: 400px; height: auto;" />
<pre>
<strong>Input:</strong> grid = [[0,1],[2,0]]
<strong>Output:</strong> 0
<strong>Explanation:</strong> There is no path that walks over every empty square exactly once.
Note that the starting and ending square can be anywhere in the grid.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>m == grid.length</code></li>
  <li><code>n == grid[i].length</code></li>
  <li>1 ≤ m, n ≤ 20</li>
  <li>1 ≤ m * n ≤ 20</li>
  <li>-1 ≤ grid[i][j] ≤ 2</li>
  <li>There is exactly one starting cell and one ending cell.</li>
</ul>
