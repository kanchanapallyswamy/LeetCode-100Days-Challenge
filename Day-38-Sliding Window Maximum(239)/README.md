<h2><a href="https://leetcode.com/problems/sliding-window-maximum/">Sliding Window Maximum</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Hard-red" alt="Difficulty: Hard" />
<hr>

<p>Given an array of integers <code>nums</code> and an integer <code>k</code> representing the window size, return the maximum value in each sliding window of size <code>k</code> as it moves from left to right.</p>

<p>You must write an algorithm that runs in <code>O(n)</code> time and uses <code>O(k)</code> extra space.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,3,-1,-3,5,3,6,7], k = 3
<strong>Output:</strong> [3,3,5,5,6,7]
<strong>Explanation:</strong>
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [1], k = 1
<strong>Output:</strong> [1]
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 &le; nums.length &le; 10<sup>5</sup></code></li>
  <li><code>-10<sup>4</sup> &le; nums[i] &le; 10<sup>4</sup></code></li>
  <li><code>1 &le; k &le; nums.length</code></li>
</ul>
