<h2><a href="https://leetcode.com/problems/group-anagrams/">Group Anagrams</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Medium-orange" alt="Difficulty: Medium" />
<hr>

<p>Given an array of strings <code>strs</code>, group the anagrams together. You can return the answer in <strong>any order</strong>.</p>

<p>An <em>anagram</em> is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>
<pre>
<strong>Input:</strong> strs = ["eat","tea","tan","ate","nat","bat"]
<strong>Output:</strong> [
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre>
<strong>Input:</strong> strs = [""]
<strong>Output:</strong> [[""]]
</pre>

<p><strong class="example">Example 3:</strong></p>
<pre>
<strong>Input:</strong> strs = ["a"]
<strong>Output:</strong> [["a"]]
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 &le; strs.length &le; 10<sup>4</sup></code></li>
  <li><code>0 &le; strs[i].length &le; 100</code></li>
  <li><code>strs[i]</code> consists of lowercase English letters.</li>
</ul>
