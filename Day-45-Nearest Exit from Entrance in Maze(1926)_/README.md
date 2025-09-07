<h2><a href="https://leetcode.com/problems/nearest-exit-from-entrance-in-maze/">Nearest Exit from Entrance in Maze</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Medium-orange" alt="Difficulty: Medium" />
<hr>

<p>You are given an <code>m x n</code> matrix <code>maze</code> (0-indexed) with empty cells (represented as <code>'.'</code>) and walls (represented as <code>'+'</code>). You are also given the <code>entrance</code> of the maze, where <code>entrance = [entrancerow, entrancecol]</code> denotes the row and column of the cell you are initially standing at.</p>

<p>In one step, you can move one cell up, down, left, or right. You cannot step into a cell with a wall, and you cannot step outside the maze. Your goal is to find the nearest exit from the <code>entrance</code>. An exit is defined as an empty cell that is at the <strong>border</strong> of the maze. The <code>entrance</code> <strong>does not count</strong> as an exit.</p>

<p>Return <em>the number of steps in the shortest path to the nearest exit, or</em> <code>-1</code> <em>if no such path exists</em>.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>
<img alt="Example 1" src="https://assets.leetcode.com/uploads/2021/06/04/nearest1-grid.jpg" style="width:300px; height:auto;" />
<pre>
<strong>Input:</strong> maze = [["+","+","." , "+"],
                 [".",".",".","+"],
                 ["+","+","+","."]],
       entrance = [1,2]
<strong>Output:</strong> 1
<strong>Explanation:</strong> The nearest exit is at [1,0], which is 1 step left from the entrance.
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="Example 2" src="https://assets.leetcode.com/uploads/2021/06/04/nearesr2-grid.jpg" style="width:300px; height:auto;" />
<pre>
<strong>Input:</strong> maze = [["+","+","+"],
                 [".",".","."],
                 ["+","+","+"]],
       entrance = [1,0]
<strong>Output:</strong> 2
<strong>Explanation:</strong> The nearest exit is at [1,2], which is 2 steps right from the entrance.
</pre>

<p><strong class="example">Example 3:</strong></p>
<img alt="Example 3" src="https://assets.leetcode.com/uploads/2021/06/04/nearest3-grid.jpg" style="width:300px; height:auto;" />
<pre>
<strong>Input:</strong> maze = [[".","+"]],
       entrance = [0,0]
<strong>Output:</strong> -1
<strong>Explanation:</strong> The entrance is the only empty cell, so there are no exits.
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>maze.length == m</code></li>
  <li><code>maze[i].length == n</code></li>
  <li><code>1 &le; m, n &le; 100</code></li>
  <li><code>maze[i][j]</code> is either <code>'.'</code> or <code>'+'</code>.</li>
  <li><code>entrance.length == 2</code></li>
  <li><code>0 &le; entrancerow &lt; m</code></li>
  <li><code>0 &le; entrancecol &lt; n</code></li>
  <li><code>entrance</code> will always be an empty cell.</li>
</ul>
