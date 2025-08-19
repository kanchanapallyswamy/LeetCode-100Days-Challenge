<h2><a href="https://leetcode.com/problems/clumsy-factorial/">Clumsy Factorial</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Medium-orange" alt="Difficulty: Medium" />
<hr>

<p>The factorial of a positive integer <code>n</code> is the product of all positive integers less than or equal to <code>n</code>. For example, <code>factorial(10) = 10 * 9 * 8 * … * 2 * 1</code>.</p>

<p>We define a <em>clumsy factorial</em> by performing a fixed rotation of operations over the descending sequence of integers from <code>n</code> to <code>1</code>, applying <code>*</code>, <code>/</code>, <code>+</code>, and <code>-</code> in this exact order repeatedly. Importantly, multiplication and division take precedence over addition and subtraction, and division is performed as floor division (meaning the result is rounded down to the nearest integer).</p>

<p>For example:</p>
<pre>clumsy(10) = 10 * 9 / 8 + 7 - 6 * 5 / 4 + 3 - 2 * 1</pre>

<p>Your task: implement the <code>clumsy</code> function that takes integer <code>n</code> and returns its clumsy factorial.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>
<pre>
<strong>Input:</strong> n = 4  
<strong>Output:</strong> 7  
<strong>Explanation:</strong> clumsy(4) = 4 * 3 / 2 + 1 = 6 + 1 = 7
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre>
<strong>Input:</strong> n = 10  
<strong>Output:</strong> 12  
<strong>Explanation:</strong> clumsy(10) = 10 * 9 / 8 + 7 - 6 * 5 / 4 + 3 - 2 * 1 = 12
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 ≤ n ≤ 10⁴</code></li>
  <li>The result fits in a signed 32-bit integer: <code>-2³¹ ≤ answer ≤ 2³¹ - 1</code></li>
</ul>
