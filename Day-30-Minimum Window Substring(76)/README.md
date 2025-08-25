<h2><a href="https://leetcode.com/problems/minimum-window-substring/">Minimum Window Substring</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Hard-red" alt="Difficulty: Hard" />
<hr>

<p>Given two strings <code>s</code> and <code>t</code> of lengths <code>m</code> and <code>n</code> respectively, return <em>the minimum window substring of</em> <code>s</code> <em>such that every character in</em> <code>t</code> <em>(including duplicates) is included in the window</em>. If there is no such substring, return an empty string <code>""</code>.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>
<pre>
<strong>Input:</strong> s = "ADOBECODEBANC", t = "ABC"
<strong>Output:</strong> "BANC"
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre>
<strong>Input:</strong> s = "a", t = "a"
<strong>Output:</strong> "a"
</pre>

<p><strong class="example">Example 3:</strong></p>
<pre>
<strong>Input:</strong> s = "a", t = "aa"
<strong>Output:</strong> ""
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>m == s.length</code></li>
  <li><code>n == t.length</code></li>
  <li><code>1 &le; m, n &le; 10<sup>5</sup></code></li>
  <li><code>s</code> and <code>t</code> consist of uppercase and lowercase English letters.</li>
</ul>

<p>&nbsp;</p>

<p><strong>Follow up:</strong> Could you find an algorithm that runs in <code>O(m + n)</code> time?</p>
