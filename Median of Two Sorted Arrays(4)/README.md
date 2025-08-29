<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
</head>
<body>
  <h2>
    <a href="https://leetcode.com/problems/median-of-two-sorted-arrays/">
      Median of Two Sorted Arrays
    </a>
  </h2>
  <img src="https://img.shields.io/badge/Difficulty-Hard-red" alt="Difficulty: Hard" />
  <hr>

  <p>
    There are two sorted arrays <code>nums1</code> and <code>nums2</code> of size <code>m</code> and <code>n</code> respectively.
    Return the median of the two sorted arrays.
    The overall run time complexity should be <code>O(log (m + n))</code>.
  </p>

  <p>&nbsp;</p>

  <p><strong>Example 1:</strong></p>
  <pre>
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
  </pre>

  <p><strong>Example 2:</strong></p>
  <pre>
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
  </pre>

  <p><strong>Example 3:</strong></p>
  <pre>
Input: nums1 = [0,0], nums2 = [0,0]
Output: 0.00000
  </pre>

  <p><strong>Example 4:</strong></p>
  <pre>
Input: nums1 = [], nums2 = [1]
Output: 1.00000
  </pre>

  <p><strong>Example 5:</strong></p>
  <pre>
Input: nums1 = [2], nums2 = []
Output: 2.00000
  </pre>

  <p>&nbsp;</p>

  <p><strong>Constraints:</strong></p>
  <ul>
    <li><code>nums1.length == m</code></li>
    <li><code>nums2.length == n</code></li>
    <li><code>0 ≤ m, n ≤ 1000</code></li>
    <li><code>1 ≤ m + n ≤ 2000</code></li>
    <li><code>-10^6 ≤ nums1[i], nums2[i] ≤ 10^6</code></li>
  </ul>
</body>
</html>
