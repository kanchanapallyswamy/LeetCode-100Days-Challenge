<h2><a href="https://leetcode.com/problems/find-the-minimum-area-to-cover-all-ones-i/description/">
Find the Minimum Area to Cover All Ones I</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Medium-orange" alt="Difficulty: Medium" />
<hr>

<p>You are given a 2D binary <code>grid</code>. Find a rectangle with horizontal and vertical sides of the smallest area such that all the <code>1</code>'s in <code>grid</code> lie inside this rectangle.</p>

<p>Return the minimum possible area of such a rectangle.</p>

<hr>

<p><strong class="example">Example 1:</strong></p>
<img alt="Example 1 diagram" src="https://assets.leetcode.com/uploads/2024/05/08/examplerect0.png" style="width:250px; height:auto;" />
<pre>
<strong>Input:</strong> grid = [[0,1,0],[1,0,1]]
<strong>Output:</strong> 6
<strong>Explanation:</strong> The rectangle from (0,1) to (1,2) covers all 1's with an area of 6.
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="Example 2 diagram" src="https://assets.leetcode.com/uploads/2024/05/08/examplerect1.png" style="width:250px; height:auto;" />
<pre>
<strong>Input:</strong> grid = [[0,0],[1,0]]
<strong>Output:</strong> 1
<strong>Explanation:</strong> The 1 is at (1,0), so the rectangle is just that cell with area 1.
</pre>

<hr>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 ≤ grid.length, grid[i].length ≤ 100</code></li>
  <li><code>grid[i][j]</code> is either <code>0</code> or <code>1</code>.</li>
  <li>There is at least one <code>1</code> in <code>grid</code>.</li>
</ul>
