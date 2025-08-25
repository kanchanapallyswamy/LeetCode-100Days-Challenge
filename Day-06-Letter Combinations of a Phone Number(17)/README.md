<h2><a href="https://leetcode.com/problems/letter-combinations-of-a-phone-number/">Letter Combinations of a Phone Number</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Medium-orange" alt="Difficulty: Medium" />
<hr>

<p>Given a string containing digits from <code>2</code> to <code>9</code> inclusive, return <em>all possible letter combinations</em> that the number could represent. Return the answer in <strong>any order</strong>.</p>

<p>Here is the standard mapping of digits to letters (just like on telephone buttons). Note that <code>1</code> does not map to any letters.</p>

<img alt="telephone keypad" src="https://assets.leetcode.com/uploads/2022/03/15/1200px-telephone-keypad2svg.png" style="width: 600px; max-width:100%; height: auto;" />

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>
<pre>
<strong>Input:</strong> digits = "23"
<strong>Output:</strong> ["ad","ae","af","bd","be","bf","cd","ce","cf"]
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre>
<strong>Input:</strong> digits = ""
<strong>Output:</strong> []
</pre>

<p><strong class="example">Example 3:</strong></p>
<pre>
<strong>Input:</strong> digits = "2"
<strong>Output:</strong> ["a","b","c"]
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>0 &lt;= digits.length &lt;= 4</code></li>
  <li><code>digits[i]</code> is a digit in the range <code>['2','9']</code>.</li>
</ul>
