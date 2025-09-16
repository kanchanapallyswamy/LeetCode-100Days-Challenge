<h2><a href="https://leetcode.com/problems/replace-non-coprime-numbers-in-array/">Replace Non-Coprime Numbers in Array</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Hard-red" alt="Difficulty: Hard" />
<hr>

<p>You are given an array of integers <code>nums</code>. Perform the following steps:</p>
<ol>
  <li>Find any two **adjacent** numbers in <code>nums</code> that are **non-coprime**.</li>
  <li>If no such numbers are found, stop the process.</li>
  <li>Otherwise, delete the two numbers and replace them with their <strong>LCM</strong> (Least Common Multiple).</li>
  <li>Repeat this process as long as you keep finding adjacent non-coprime numbers.</li>
</ol>

<p>Return the final modified array. It can be shown that replacing adjacent non-coprime numbers in any arbitrary order will lead to the same result.</p>

<p>Two values <code>x</code> and <code>y</code> are non-coprime if <code>GCD(x, y) &gt; 1</code>, where <code>GCD</code> is the greatest common divisor.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [6,4,3,2,7,6,2]
<strong>Output:</strong> [12,7,6]

<strong>Explanation:</strong>
- (6, 4) are non-coprime with LCM(6, 4) = 12 → nums becomes [12,3,2,7,6,2]  
- (12, 3) are non-coprime → replace with 12 → [12,2,7,6,2]  
- (12, 2) are non-coprime → replace with 12 → [12,7,6,2]  
- (6, 2) are non-coprime → replace with 6 → [12,7,6]  
No more adjacent non-coprime pairs.  
Final result: [12,7,6]
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [2,2,1,1,3,3,3]
<strong>Output:</strong> [2,1,1,3]

<strong>Explanation:</strong>
- (3, 3) → 3 → [2,2,1,1,3,3]  
- (3, 3) → 3 → [2,2,1,1,3]  
- (2, 2) → 2 → [2,1,1,3]  
No more non-coprime adjacent pairs.  
Final result: [2,1,1,3]
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 ≤ nums.length ≤ 10⁵</code></li>
  <li><code>1 ≤ nums[i] ≤ 10⁵</code></li>
  <li>The test cases are generated such that the values in the final array are ≤ 10⁸.</li>
</ul>
