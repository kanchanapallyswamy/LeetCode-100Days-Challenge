<h2><a href="https://leetcode.com/problems/construct-product-matrix/">Construct Product Matrix</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Medium-yellow" alt="Difficulty: Medium" />
<hr>

<p>You are given a 0-indexed 2D integer matrix <code>grid</code> of size <code>n × m</code>. Define a 0-indexed 2D matrix <code>p</code> of the same size as the product matrix of <code>grid</code> if the following condition holds:</p>

<p>Each element <code>p[i][j]</code> is calculated as the product of *all* elements in <code>grid</code> except <code>grid[i][j]</code> itself. The result is then taken modulo <code>12345</code>.</p>

<p>Return the product matrix <code>p</code> of <code>grid</code>.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>
<pre>
<strong>Input:</strong> grid = [[1,2],[3,4]]
<strong>Output:</strong> [[24,12],[8,6]]
<strong>Explanation:</strong>
p[0][0] = 2 × 3 × 4 = 24  
p[0][1] = 1 × 3 × 4 = 12  
p[1][0] = 1 × 2 × 4 =  8  
p[1][1] = 1 × 2 × 3 =  6  
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre>
<strong>Input:</strong> grid = [[12345],[2],[1]]
<strong>Output:</strong> [[2],[0],[0]]
<strong>Explanation:</strong>
p[0][0] = 2 × 1 = 2  
p[1][0] = 12345 × 1 = 12345 ≡ 0 (mod 12345)  
p[2][0] = 12345 × 2 = 24690 ≡ 0 (mod 12345)  
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 ≤ n = grid.length ≤ 10⁵</code></li>
  <li><code>1 ≤ m = grid[i].length ≤ 10⁵</code></li>
  <li><code>2 ≤ n × m ≤ 10⁵</code></li>
  <li><code>1 ≤ grid[i][j] ≤ 10⁹</code></li>
</ul>
