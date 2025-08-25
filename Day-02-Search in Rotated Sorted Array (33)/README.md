<h2><a href="https://leetcode.com/problems/search-in-rotated-sorted-array/">Search in Rotated Sorted Array</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Medium-orange" alt="Difficulty: Medium" />
<hr>

<p>There is an integer array <code>nums</code> sorted in ascending order (with <strong>distinct</strong> values).</p>
<p>Prior to being passed to your function, <code>nums</code> is <strong>possibly rotated</strong> at an unknown pivot index <code>k</code> (<code>0 &le; k &lt; nums.length</code>) such that the resulting array is <code>[nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]</code>.</p>
<p>Given the array <code>nums</code> after the possible rotation and an integer <code>target</code>, return the <em>index</em> of <code>target</code> if it is in <code>nums</code>, or <code>-1</code> if it is not in <code>nums</code>.</p>

<p>You must write an algorithm with <code>O(log n)</code> runtime complexity.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [4,5,6,7,0,1,2], target = 0
<strong>Output:</strong> 4
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [4,5,6,7,0,1,2], target = 3
<strong>Output:</strong> -1
</pre>

<p><strong class="example">Example 3:</strong></p>
<pre>
<strong>Input:</strong> nums = [1], target = 0
<strong>Output:</strong> -1
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 &le; nums.length &le; 5 &times; 10<sup>3</sup></code></li>
  <li><code>-10<sup>4</sup> &le; nums[i] &le; 10<sup>4</sup></code></li>
  <li>All values of <code>nums</code> are <strong>unique</strong>.</li>
  <li><code>nums</code> is sorted and then <strong>rotated</strong> at some pivot.</li>
  <li><code>-10<sup>4</sup> &le; target &le; 10<sup>4</sup></code></li>
</ul>
