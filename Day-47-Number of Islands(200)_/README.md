<h2><a href="https://leetcode.com/problems/number-of-islands/">Number of Islands</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Medium-orange" alt="Difficulty: Medium" />
<hr>

<p>You are given an <code>m × n</code> 2D binary grid <code>grid</code> consisting of <code>'1'</code> (land) and <code>'0'</code> (water). Return <em>the number of islands</em>.</p>

<p>An <strong>island</strong> is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are surrounded by water.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>
<img alt="Example 1" src="https://myinterview.guru/leetcode-200-number-of-islands-63b59ffa547f?gi=98abc508dffa" style="width:300px; height:auto;" />
<pre>
<strong>Input:</strong> grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
<strong>Output:</strong> 1
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre>
<strong>Input:</strong> grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
<strong>Output:</strong> 3
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>m == grid.length</code></li>
  <li><code>n == grid[i].length</code></li>
  <li><code>1 ≤ m, n ≤ 300</code></li>
  <li><code>grid[i][j]</code> is <code>'0'</code> or <code>'1'</code></li>
</ul>
