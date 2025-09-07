<h2><a href="https://leetcode.com/problems/word-search/">Word Search</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Medium-orange" alt="Difficulty: Medium" />
<hr>

<p>Given an <code>m x n</code> grid of characters <code>board</code> and a string <code>word</code>, return <code>true</code> if <code>word</code> exists in the grid.</p>

<p>The word can be constructed from letters of sequentially adjacent cells, where <strong>adjacent cells</strong> are horizontally or vertically neighboring. The same letter cell may not be used more than once.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>
<img alt="Example 1" src="https://assets.leetcode.com/uploads/2020/11/04/word2.jpg" style="width:300px; height:auto;" />
<pre>
<strong>Input:</strong> board = [["A","B","C","E"],
                 ["S","F","C","S"],
                 ["A","D","E","E"]], word = "ABCCED"
<strong>Output:</strong> true
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="Example 2" src="https://assets.leetcode.com/uploads/2020/11/04/word-1.jpg" style="width:300px; height:auto;" />
<pre>
<strong>Input:</strong> board = [["A","B","C","E"],
                 ["S","F","C","S"],
                 ["A","D","E","E"]], word = "SEE"
<strong>Output:</strong> true
</pre>

<p><strong class="example">Example 3:</strong></p>
<img alt="Example 3" src="https://assets.leetcode.com/uploads/2020/10/15/word3.jpg" style="width:300px; height:auto;" />
<pre>
<strong>Input:</strong> board = [["A","B","C","E"],
                 ["S","F","C","S"],
                 ["A","D","E","E"]], word = "ABCB"
<strong>Output:</strong> false
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>m == board.length</code></li>
  <li><code>n == board[i].length</code></li>
  <li><code>1 &le; m, n &le; 6</code></li>
  <li><code>1 &le; word.length &le; 15</code></li>
  <li><code>board</code> and <code>word</code> consist of only lowercase and uppercase English letters.</li>
</ul>

<p><strong>Follow up:</strong> Could you use search pruning to make your solution more optimal?</p>
