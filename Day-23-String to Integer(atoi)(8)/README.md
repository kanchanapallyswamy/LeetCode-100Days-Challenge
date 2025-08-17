<h2><a href="https://leetcode.com/problems/string-to-integer-atoi/">String to Integer (atoi)</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Medium-orange" alt="Difficulty: Medium" />
<hr>

<p>Implement the <code>myAtoi(string s)</code> function, which converts a string to a 32-bit signed integer.</p>

<p>The algorithm for <code>myAtoi(string s)</code> is as follows:</p>
<ol>
  <li><strong>Whitespace:</strong> Ignore any leading whitespace (<code>" "</code>).</li>
  <li><strong>Signedness:</strong> Determine the sign by checking if the next character is <code>'-'</code> or <code>'+'</code>, assuming positivity if neither present.</li>
  <li><strong>Conversion:</strong> Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.</li>
  <li><strong>Rounding:</strong> If the integer is out of the 32-bit signed integer range <code>[−2<sup>31</sup>, 2<sup>31</sup> − 1]</code>, then round the integer to remain in the range. 
      Specifically, integers less than <code>−2<sup>31</sup></code> should be rounded to <code>−2<sup>31</sup></code>, and integers greater than <code>2<sup>31</sup> − 1</code> should be rounded to <code>2<sup>31</sup> − 1</code>.
  </li>
</ol>

<p>Return the integer as the final result.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>
<pre>
<strong>Input:</strong> s = "42"
<strong>Output:</strong> 42
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre>
<strong>Input:</strong> s = "   -42"
<strong>Output:</strong> -42
</pre>

<p><strong class="example">Example 3:</strong></p>
<pre>
<strong>Input:</strong> s = "1337c0d3"
<strong>Output:</strong> 1337
</pre>

<p><strong class="example">Example 4:</strong></p>
<pre>
<strong>Input:</strong> s = "0-1"
<strong>Output:</strong> 0
</pre>

<p><strong class="example">Example 5:</strong></p>
<pre>
<strong>Input:</strong> s = "words and 987"
<strong>Output:</strong> 0
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>0 &lt;= s.length &lt;= 200</code></li>
  <li><code>s</code> consists of English letters (lower-case and upper-case), digits (<code>0-9</code>), <code>' '</code>, <code>'+'</code>, <code>'-'</code>, and <code>'.'</code>.</li>
</ul>
