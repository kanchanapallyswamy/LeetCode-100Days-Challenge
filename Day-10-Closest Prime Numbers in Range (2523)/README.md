<h2><a href="https://leetcode.com/problems/closest-prime-numbers-in-range/">Closest Prime Numbers in Range</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Medium-orange" alt="Difficulty: Medium" />
<hr>

<p>Given two integers <code>left</code> and <code>right</code>, find two prime numbers <strong>p1</strong> and <strong>p2</strong> such that:</p>
<ul>
  <li><code>left ≤ p1 < p2 ≤ right</code></li>
  <li>The difference <code>p2 - p1</code> is minimized.</li>
</ul>
<p>If there are multiple answers, return the pair with the smallest <code>p1</code>. If there are no two prime numbers in the range, return <code>[-1, -1]</code>.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>
<pre>
<strong>Input:</strong> left = 10, right = 19
<strong>Output:</strong> [11,13]
<strong>Explanation:</strong> The primes in this range are [11, 13, 17, 19], and the closest pair is (11, 13).
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre>
<strong>Input:</strong> left = 4, right = 4
<strong>Output:</strong> [-1,-1]
<strong>Explanation:</strong> There are no two primes in the range.
</pre>

<p><strong class="example">Example 3:</strong></p>
<pre>
<strong>Input:</strong> left = 1, right = 2
<strong>Output:</strong> [-1,-1]
<strong>Explanation:</strong> Only the prime [2] is in the range—only one prime => no pair.
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 ≤ left ≤ right ≤ 10<sup>6</sup></code></li>
</ul>
