<h2><a href="https://leetcode.com/problems/zigzag-conversion/">Zigzag Conversion</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Medium-orange" alt="Difficulty: Medium" />
<hr>

<p>The string <code>"PAYPALISHIRING"</code> is written in a zigzag pattern on a given number of rows like this (viewing in monospaced font):</p>
<pre style="font-family: monospace; line-height: 1.2;">
P   A   H   N
A P L S I I G
Y   I   R
</pre>
<p>Then, reading line by line, it becomes:</p>
<pre><code>"PAHNAPLSIIGYIR"</code></pre>

<p>Write a function with the signature:</p>
<pre><code>string convert(string s, int numRows);</code></pre>

<p>that converts any string <code>s</code> into its zigzag pattern and returns the result when read line by line.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>
<pre>
<strong>Input:</strong> s = "PAYPALISHIRING", numRows = 3
<strong>Output:</strong> "PAHNAPLSIIGYIR"
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre>
<strong>Input:</strong> s = "PAYPALISHIRING", numRows = 4
<strong>Output:</strong> "PINALSIGYAHRPI"
</pre>

<p><strong class="example">Example 3:</strong></p>
<pre>
<strong>Input:</strong> s = "A", numRows = 1
<strong>Output:</strong> "A"
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 &le; s.length &le; 1000</code></li>
  <li><code>s</code> consists of English letters (both lowercase and uppercase), commas, and periods.</li>
  <li><code>1 &le; numRows &le; 1000</code></li>
</ul>
