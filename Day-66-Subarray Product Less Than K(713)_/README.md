<h2><a href="https://leetcode.com/problems/subarray-product-less-than-k/description/">
713. Subarray Product Less Than K</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Medium-yellow" alt="Difficulty: Medium" />
<hr>

<p>Given an array of positive integers <code>nums</code> and an integer <code>k</code>, return *the number of contiguous subarrays* where the product of all the elements in the subarray is **strictly less than** <code>k</code>.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [10, 5, 2, 6], k = 100
<strong>Output:</strong> 8
<strong>Explanation:</strong> The 8 subarrays are: [10], [5], [2], [6], [10,5], [5,2], [2,6], [5,2,6]
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,2,3], k = 0
<strong>Output:</strong> 0
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 &le; nums.length &leq 3 × 10⁴</code></li>
  <li><code>1 ≤ nums[i] ≤ 1000</code></li>
  <li><code>0 ≤ k ≤ 10⁶</code></li>
</ul>
