<h2><a href="https://leetcode.com/problems/diagonal-traverse-ii/">Diagonal Traverse II</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Medium-orange" alt="Difficulty: Medium" />
<hr>

<p>Given a list of lists of integers <code>nums</code>, return all elements of <code>nums</code> in diagonal order as shown in the images below.</p>

<p>The traversal groups elements by the sum of their row and column indices (<code>d = i + j</code>), and for each diagonal (in increasing order of <code>d</code>) the elements are output from bottom to top (i.e., reversed order within each diagonal).</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>
<img alt="Diagonal Traverse II example 1" src="https://assets.leetcode.com/uploads/2020/04/08/sample_1_1784.png" style="width:300px; height:auto;" />
<pre>
<strong>Input:</strong> nums = [[1,2,3],[4,5,6],[7,8,9]]
<strong>Output:</strong> [1,4,2,7,5,3,8,6,9]
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="Diagonal Traverse II example 2" src="https://assets.leetcode.com/uploads/2020/04/08/sample_2_1784.png" style="width:300px; height:auto;" />
<pre>
<strong>Input:</strong> nums = [[1,2,3,4,5],[6,7],[8],[9,10,11],[12,13,14,15,16]]
<strong>Output:</strong> [1,6,2,8,7,3,9,4,12,10,5,13,11,14,15,16]
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 &le; nums.length &le; 10<sup>5</sup></code></li>
  <li><code>1 &le; nums[i].length &le; 10<sup>5</sup></code></li>
  <li><code>1 &le; sum(nums[i].length) &le; 10<sup>5</sup></code></li>
  <li><code>1 &le; nums[i][j] &le; 10<sup>5</sup></code></li>
</ul>
