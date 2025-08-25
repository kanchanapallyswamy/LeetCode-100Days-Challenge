<h2><a href="https://leetcode.com/problems/minimum-path-sum">Minimum Path Sum</a></h2>
<img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' />
<hr>
<p>Given an <code>m &times; n</code> grid filled with non-negative numbers, find a path from the top-left to the bottom-right which minimizes the sum of all numbers along its path.</p>
<p>You can only move <strong>down</strong> or <strong>right</strong> at any point in time.</p>

<p>&nbsp;</p>
<p><strong class="example">Example:</strong></p>
<img alt="Minimum Path Sum diagram" src="https://assets.leetcode.com/uploads/2020/11/05/minpath.jpg" style="width:523px; height:342px;" />
<pre>
<strong>Input:</strong> grid = [[1,3,1],[1,5,1],[4,2,1]]
<strong>Output:</strong> 7
<strong>Explanation:</strong> The path 1 → 3 → 1 → 1 → 1 minimizes the sum.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>
<ul>
    <li><code>m == grid.length</code></li>
    <li><code>n == grid[i].length</code></li>
    <li><code>1 ≤ m, n ≤ 200</code></li>
    <li><code>0 ≤ grid[i][j] ≤ 200</code></li>
</ul>
