<h2><a href="https://leetcode.com/problems/rotate-image/">Rotate Image</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Medium-orange" alt="Difficulty: Medium" />
<hr>

<p>You are given an <code>n × n</code> 2D matrix representing an image, rotate the image by 90 degrees (clockwise), <strong>in-place</strong>.</p>
<p>You must rotate the image by modifying the input 2D matrix directly. <strong>DO NOT</strong> allocate another 2D matrix to perform the rotation.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>
<img alt="Rotate Image example - before" src="https://assets.leetcode.com/uploads/2020/08/28/mat1.jpg" style="width: 300px; max-width:100%; margin-right: 10px;" />
<pre>
<strong>Input:</strong>
matrix = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9]
]
<strong>Output:</strong>
[
  [7, 4, 1],
  [8, 5, 2],
  [9, 6, 3]
]
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="Rotate Image example 2 - before/after" src="https://assets.leetcode.com/uploads/2020/08/28/mat2.jpg" style="width: 523px; height: auto;" />
<pre>
<strong>Input:</strong>
matrix = [
  [5,  1,  9, 11],
  [2,  4,  8, 10],
  [13, 3,  6,  7],
  [15,14, 12, 16]
]
<strong>Output:</strong>
[
  [15,13, 2, 5],
  [14, 3, 4, 1],
  [12, 6, 8, 9],
  [16, 7,10,11]
]
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>matrix.length == n</code></li>
  <li><code>matrix[i].length == n</code></li>
  <li><code>1 ≤ n ≤ 20</code></li>
  <li><code>-1000 ≤ matrix[i][j] ≤ 1000</code></li>
</ul>
