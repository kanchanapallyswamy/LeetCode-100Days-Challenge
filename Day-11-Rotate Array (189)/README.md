<h2><a href="https://leetcode.com/problems/rotate-array/">Rotate Array</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Medium-orange" alt="Difficulty: Medium" />
<hr>

<p>Given an integer array <code>nums</code>, rotate the array to the right by <code>k</code> steps, where <code>k</code> is non-negative.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,2,3,4,5,6,7], k = 3
<strong>Output:</strong> [5,6,7,1,2,3,4]
<strong>Explanation:</strong>
Rotate to the right by 1 step: [7,1,2,3,4,5,6]  
Rotate to the right by 2 steps: [6,7,1,2,3,4,5]  
Rotate to the right by 3 steps: [5,6,7,1,2,3,4]
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [-1,-100,3,99], k = 2
<strong>Output:</strong> [3,99,-1,-100]
<strong>Explanation:</strong>  
Rotate to the right by 1 step: [99,-1,-100,3]  
Rotate to the right by 2 steps: [3,99,-1,-100]
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 &le; nums.length &le; 10<sup>5</sup></code></li>
  <li><code>-2<sup>31</sup> &le; nums[i] &le; 2<sup>31</sup> - 1</code></li>
  <li><code>0 &le; k &le; 10<sup>5</sup></code></li>
</ul>
