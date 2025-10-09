<h2><a href="https://leetcode.com/problems/word-search-ii/description/">
212. Word Search II</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Hard-red" alt="Difficulty: Hard" />
<hr>

<p>Given an <code>m x n</code> board of characters and a list of strings <code>words</code>, return *all words* on the board.</p>
<p>Each word must be constructed from letters of sequentially adjacent cells, where “adjacent” cells are horizontally or vertically neighboring. The same letter cell may not be used more than once in a word.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>
<img alt="Word Search II Example 1" src="https://assets.leetcode.com/uploads/2020/11/07/search1.jpg" style="width:300px; height:auto;" />
<pre>
<strong>Input:</strong> board = [["o","a","a","n"],
                               ["e","t","a","e"],
                               ["i","h","k","r"],
                               ["i","f","l","v"]],
       words = ["oath","pea","eat","rain"]
<strong>Output:</strong> ["eat","oath"]
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="Word Search II Example 2" src="https://assets.leetcode.com/uploads/2020/11/07/search2.jpg" style="width:300px; height:auto;" />
<pre>
<strong>Input:</strong> board = [["a","b"],["c","d"]], words = ["abcb"]
<strong>Output:</strong> []
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>m == board.length</code></li>
  <li><code>n == board[i].length</code></li>
  <li><code>1 &le; m, n &le; 12</code></li>
  <li><code>1 &le; words.length &leq 3 × 10⁴</code></li>
  <li><code>1 ≤ words[i].length ≤ 10</code></li>
  <li>All strings in <code>words</code> are **unique**.</li>
</ul>
