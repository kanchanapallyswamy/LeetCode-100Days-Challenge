<h2><a href="https://leetcode.com/problems/swim-in-rising-water/description/">
778. Swim in Rising Water</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Hard-red" alt="Difficulty: Hard" />
<hr>

<p>You are given an <code>n x n</code> integer matrix <code>grid</code> where each value <code>grid[i][j]</code> represents the elevation at that point <code>(i, j)</code>.</p>

<p>It starts raining, and water gradually rises over time. At time <code>t</code>, the water level is <code>t</code>, meaning any cell with elevation less than or equal to <code>t</code> is submerged or reachable.</p>

<p>You can swim from a square to another 4-directionally adjacent square if and only if the elevation of both squares individually are at most <code>t</code>. You can swim infinite distances in zero time. 
Of course, you must stay within the boundaries of the grid during your swim.</p>

<p>Return the minimum time until you can reach the bottom right square <code>(n - 1, n - 1)</code> if you start at the top left square <code>(0, 0)</code>.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>
<img alt="Swim Example 1" src="https://assets.leetcode.com/uploads/2021/06/29/swim1-grid.jpg" style="width:350px; height:auto;" />
<pre>
<strong>Input:</strong> grid = [[0,2],[1,3]]
<strong>Output:</strong> 3
<strong>Explanation:</strong> 
At time 0, you are in grid location (0, 0).
You cannot go anywhere else because 4-directionally adjacent neighbors have a higher elevation than t = 0.
You cannot reach point (1, 1) until time 3.
When the depth of water is 3, we can swim anywhere inside the grid.
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="Swim Example 2" src="https://assets.leetcode.com/uploads/2021/06/29/swim2-grid-1.jpg" style="width:400px; height:auto;" />
<pre>
<strong>Input:</strong> grid = [[0,1,2,3,4],
                 [24,23,22,21,5],
                 [12,13,14,15,16],
                 [11,17,18,19,20],
                 [10,9,8,7,6]]
<strong>Output:</strong> 16
<strong>Explanation:</strong> 
The final route is shown. 
We need to wait until time 16 so that (0, 0) and (4, 4) are connected.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>n == grid.length</code></li>
  <li><code>n == grid[i].length</code></li>
  <li><code>1 &lt;= n &lt;= 50</code></li>
  <li><code>0 &lt;= grid[i][j] &lt; n<sup>2</sup></code></li>
  <li>Each value <code>grid[i][j]</code> is unique.</li>
</ul>
