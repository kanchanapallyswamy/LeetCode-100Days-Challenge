<h2><a href="https://leetcode.com/problems/pacific-atlantic-water-flow/description">
417. Pacific Atlantic Water Flow</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Medium-yellow" alt="Difficulty: Medium" />
<hr>

<p>There is an <code>m x n</code> rectangular island that borders both the Pacific Ocean and Atlantic Ocean. 
The Pacific Ocean touches the island's left and top edges, and the Atlantic Ocean touches the island's right and bottom edges.</p>

<p>The island is partitioned into a grid of square cells. You are given an <code>m x n</code> integer matrix <code>heights</code> 
where <code>heights[r][c]</code> represents the height above sea level of the cell at coordinate <code>(r, c)</code>.</p>

<p>The island receives a lot of rain, and the rain water can flow to neighboring cells directly north, south, east, and west 
if the neighboring cell's height is less than or equal to the current cell's height. 
Water can flow from any cell adjacent to an ocean into the ocean.</p>

<p>Return a 2D list of grid coordinates <code>result</code> where <code>result[i] = [ri, ci]</code> denotes that rain water can 
flow from cell <code>(ri, ci)</code> to both the Pacific and Atlantic oceans.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>
<img alt="Pacific Atlantic Example 1" src="https://assets.leetcode.com/uploads/2021/06/08/waterflow-grid.jpg" style="width:500px; height:auto;" />
<pre>
<strong>Input:</strong> heights = [[1,2,2,3,5],
                 [3,2,3,4,4],
                 [2,4,5,3,1],
                 [6,7,1,4,5],
                 [5,1,1,2,4]]
<strong>Output:</strong> [[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]
<strong>Explanation:</strong> The following cells can flow to both the Pacific and Atlantic oceans:
[0,4]: [0,4] -> Pacific Ocean 
       [0,4] -> Atlantic Ocean
[1,3]: [1,3] -> [0,3] -> Pacific Ocean 
       [1,3] -> [1,4] -> Atlantic Ocean
[1,4]: [1,4] -> [1,3] -> [0,3] -> Pacific Ocean 
       [1,4] -> Atlantic Ocean
[2,2]: [2,2] -> [1,2] -> [0,2] -> Pacific Ocean 
       [2,2] -> [2,3] -> [2,4] -> Atlantic Ocean
[3,0]: [3,0] -> Pacific Ocean 
       [3,0] -> [4,0] -> Atlantic Ocean
[3,1]: [3,1] -> [3,0] -> Pacific Ocean 
       [3,1] -> [4,1] -> Atlantic Ocean
[4,0]: [4,0] -> Pacific Ocean 
       [4,0] -> Atlantic Ocean
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre>
<strong>Input:</strong> heights = [[1]]
<strong>Output:</strong> [[0,0]]
<strong>Explanation:</strong> The water can flow from the only cell to both the Pacific and Atlantic oceans.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>m == heights.length</code></li>
  <li><code>n == heights[r].length</code></li>
  <li><code>1 &lt;= m, n &lt;= 200</code></li>
  <li><code>0 &lt;= heights[r][c] &lt;= 10<sup>5</sup></code></li>
</ul>
