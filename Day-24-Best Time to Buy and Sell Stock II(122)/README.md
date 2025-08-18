<h2><a href="https://leetcode.us/problems/best-time-to-buy-and-sell-stock-ii/">Best Time to Buy and Sell Stock II</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Medium-orange" alt="Difficulty: Medium" />
<hr>

<p>You are given an integer array <code>prices</code> where <code>prices[i]</code> is the price of a given stock on the <code>i<sup>th</sup></code> day.</p>

<p>You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).</p>
<p>However, you must sell the stock before you buy again.</p>

<p>Return <em>the maximum profit you can achieve</em>.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>
<pre>
<strong>Input:</strong> prices = [7,1,5,3,6,4]
<strong>Output:</strong> 7
<strong>Explanation:</strong> Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5−1 = 4.
Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6−3 = 3.
Total profit = 4 + 3 = 7.
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre>
<strong>Input:</strong> prices = [1,2,3,4,5]
<strong>Output:</strong> 4
<strong>Explanation:</strong> Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5−1 = 4.
Total profit = 4.
</pre>

<p><strong class="example">Example 3:</strong></p>
<pre>
<strong>Input:</strong> prices = [7,6,4,3,1]
<strong>Output:</strong> 0
<strong>Explanation:</strong> No transaction is done—max profit = 0.
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 ≤ prices.length ≤ 3 × 10<sup>4</sup></code></li>
  <li><code>0 ≤ prices[i] ≤ 10<sup>4</sup></code></li>
</ul>
