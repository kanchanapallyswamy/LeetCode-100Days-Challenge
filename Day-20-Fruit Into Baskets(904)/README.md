<h2><a href="https://leetcode.com/problems/fruit-into-baskets/">Fruit Into Baskets</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Medium-orange" alt="Difficulty: Medium" />
<hr>

<p>You are visiting a farm that has a single row of fruit trees arranged in a line. The trees are represented by an integer array <code>fruits</code> where <code>fruits[i]</code> is the type of fruit the <code>i<sup>th</sup></code> tree bears.</p>

<p>You want to collect as much fruit as possible. However, the rules are:</p>
<ul>
  <li>You only have two baskets, and each basket can hold only one type of fruit.</li>
  <li>You must pick exactly one fruit from each tree while moving right.</li>
  <li>Once you start picking from one type of fruit, you can only switch to another fruit type if one of your baskets is empty, or you already have that fruit in a basket.</li>
</ul>

<p>Return the maximum number of fruits you can pick.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>
<pre>
<strong>Input:</strong> fruits = [1,2,1]
<strong>Output:</strong> 3
<strong>Explanation:</strong> We can pick fruit types 1 and 2 in sequence: [1,2,1].
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre>
<strong>Input:</strong> fruits = [0,1,2,2]
<strong>Output:</strong> 3
<strong>Explanation:</strong> We can pick from trees [1,2,2].
</pre>

<p><strong class="example">Example 3:</strong></p>
<pre>
<strong>Input:</strong> fruits = [1,2,3,2,2]
<strong>Output:</strong> 4
<strong>Explanation:</strong> We can pick from trees [3,2,2,2].
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 ≤ fruits.length ≤ 10<sup>5</sup></code></li>
  <li><code>0 ≤ fruits[i] < fruits.length</code></li>
</ul>
