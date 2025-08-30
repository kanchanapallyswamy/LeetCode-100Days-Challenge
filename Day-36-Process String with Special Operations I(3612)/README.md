<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
</head>
<body>
  <h2>
    <a href="https://leetcode.com/problems/process-string-with-special-operations-i/">
      Process String with Special Operations I
    </a>
  </h2>
  <img src="https://img.shields.io/badge/Difficulty-Medium-orange" alt="Difficulty: Medium" />
  <hr>

  <p>
    You are given a string <code>s</code> consisting of lowercase English letters and the special characters: <code>*</code>, <code>#</code>, and <code>%</code>.
    Build a new string <code>result</code> by processing <code>s</code> according to the following rules from left to right:
  </p>
  <ul>
    <li>If the character is a lowercase English letter, append it to <code>result</code>.</li>
    <li>A <code>*</code> removes the last character from <code>result</code>, if it exists.</li>
    <li>A <code>#</code> duplicates the current <code>result</code> and appends it to itself.</li>
    <li>A <code>%</code> reverses the current <code>result</code>.</li>
  </ul>
  <p>Return the final string <code>result</code> after processing all characters in <code>s</code>.</p>

  <p>&nbsp;</p>

  <p><strong class="example">Example 1:</strong></p>
  <pre>
<strong>Input:</strong> s = "a#b%*"
<strong>Output:</strong> "ba"
<strong>Explanation:</strong>
i = 0, s[0] = 'a' → append → "a"
i = 1, s[1] = '#' → duplicate → "aa"
i = 2, s[2] = 'b' → append → "aab"
i = 3, s[3] = '%' → reverse → "baa"
i = 4, s[4] = '*' → remove last → "ba"
  </pre>

  <p><strong class="example">Example 2:</strong></p>
  <pre>
<strong>Input:</strong> s = "z*#"
<strong>Output:</strong> ""
<strong>Explanation:</strong>
i = 0, s[0] = 'z' → append → "z"
i = 1, s[1] = '*' → remove last → ""
i = 2, s[2] = '#' → duplicate → ""
  </pre>

  <p>&nbsp;</p>

  <p><strong>Constraints:</strong></p>
  <ul>
    <li><code>1 ≤ s.length ≤ 20</code></li>
    <li><code>s</code> consists of only lowercase English letters and special characters <code>*</code>, <code>#</code>, and <code>%</code>.</li>
  </ul>
</body>
</html>
