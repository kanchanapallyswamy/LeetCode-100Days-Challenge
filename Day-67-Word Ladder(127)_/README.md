<h2><a href="https://leetcode.com/problems/word-ladder/description/">
127. Word Ladder</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Medium-yellow" alt="Difficulty: Medium" />
<hr>

<p>Given two words, <code>beginWord</code> and <code>endWord</code>, and a dictionary <code>wordList</code>, return the length of the shortest transformation sequence from <code>beginWord</code> to <code>endWord</code>, or <code>0</code> if no such sequence exists.</p>

<p>Each transformation must change exactly one letter and the new word must exist in <code>wordList</code>. Note that <code>beginWord</code> is not necessarily in <code>wordList</code>.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>
<pre>
<strong>Input:</strong> beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]
<strong>Output:</strong> 5
<strong>Explanation:</strong> One shortest transformation is "hit" → "hot" → "dot" → "dog" → "cog", which is 5 words long.
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre>
<strong>Input:</strong> beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log"]
<strong>Output:</strong> 0
<strong>Explanation:</strong> The endWord "cog" is not in the wordList, so no valid transformation exists.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 &le; beginWord.length &le 10</code></li>
  <li><code>endWord.length == beginWord.length</code></li>
  <li><code>1 &le; wordList.length &le 5000</code></li>
  <li>All strings consist of lowercase English letters.</li>
  <li>No duplicate words in <code>wordList</code>.</li>
</ul>
