<h2><a href="https://leetcode.com/problems/split-array-with-minimum-difference/">
2171. Split Array With Minimum Difference</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Medium-yellow" alt="Difficulty: Medium" />
<hr>

<p>You are given an integer array <code>nums</code>. You must split it into two arrays <code>nums1</code> and <code>nums2</code> such that:</p>
<ul>
  <li>The length of both <code>nums1</code> and <code>nums2</code> is <code>n</code> (where <code>n</code> is half of the length of <code>nums</code>).</li>
  <li>Every element of <code>nums</code> belongs to exactly one of <code>nums1</code> or <code>nums2</code>.</li>
</ul>

<p>Return the <strong>minimum possible absolute difference</strong> between the sum of elements of <code>nums1</code> and the sum of elements of <code>nums2</code>.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [3,9,7,3]
<strong>Output:</strong> 2
<strong>Explanation:</strong> One possible way to split nums is [3,9] and [7,3].
The difference between the sum of the arrays is |12 - 10| = 2.
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [-36,36]
<strong>Output:</strong> 72
<strong>Explanation:</strong> One possible way to split nums is [-36] and [36].
The difference between the sum of the arrays is |-36 - 36| = 72.
</pre>

<p><strong class="example">Example 3:</strong></p>
<pre>
<strong>Input:</strong> nums = [2,-1,0,4,-2,-9]
<strong>Output:</strong> 0
<strong>Explanation:</strong> One possible way to split nums is [2, -1, -9] and [0, 4, -2].
The difference between the sum of the arrays is |(-8) - (2)| = 10, 
but the minimum possible is 0.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 &lt;= n &lt;= 15</code></li>
  <li><code>nums.length == 2 * n</code></li>
  <li><code>-10<sup>7</sup> &lt;= nums[i] &lt;= 10<sup>7</sup></code></li>
</ul>
