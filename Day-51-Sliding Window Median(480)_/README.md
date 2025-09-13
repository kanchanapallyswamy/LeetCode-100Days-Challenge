<h2><a href="https://leetcode.com/problems/sliding-window-median/">Sliding Window Median</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Hard-red" alt="Difficulty: Hard" />
<hr>

<p>The median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value, so the median is the mean of the two middle values.</p>

<p>For example:</p>
<ul>
  <li>If <code>arr = [2,3,4]</code>, the median is 3.</li>
  <li>If <code>arr = [1,2,3,4]</code>, the median is (2 + 3) / 2 = 2.5.</li>
</ul>

<p>You are given an integer array <code>nums</code> and an integer <code>k</code>. There is a sliding window of size <code>k</code> which moves from the very left of the array to the very right. You can only see the <code>k</code> numbers in the window. Each time the sliding window moves right by one position.</p>

<p>Return the median array for each window in the original array. Answers within <code>10^-5</code> of the actual value will be accepted.</p>

<p><strong class="example">Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,3,-1,-3,5,3,6,7], k = 3
<strong>Output:</strong> [1.00000,-1.00000,-1.00000,3.00000,5.00000,6.00000]
<strong>Explanation:</strong>
Window position                Median
[1  3  -1] -3  5  3  6  7        1
1 [3  -1  -3] 5  3  6  7       -1
1  3 [-1  -3  5] 3  6  7       -1
1  3  -1 [-3  5  3] 6  7        3
1  3  -1  -3 [5  3  6] 7        5
1  3  -1  -3  5 [3  6  7]       6
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,2,3,4,2,3,1,4,2], k = 3
<strong>Output:</strong> [2.00000,3.00000,3.00000,3.00000,2.00000,3.00000,2.00000]
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li>1 &le; k &le; nums.length &le; 10<sup>5</sup></li>
  <li>-2<sup>31</sup> &le; nums[i] &le; 2<sup>31</sup> - 1</li>
</ul>
