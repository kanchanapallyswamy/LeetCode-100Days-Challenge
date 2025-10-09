<h2><a href="https://leetcode.com/problems/course-schedule/description/">
207. Course Schedule</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Medium-yellow" alt="Difficulty: Medium" />
<hr>

<p>There are a total of <code>numCourses</code> courses you have to take, labeled from <code>0</code> to <code>numCourses − 1</code>.</p>
<p>You are given an array <code>prerequisites</code> where <code>prerequisites[i] = [a, b]</code> indicates that you must take course <code>b</code> before you can take course <code>a</code>.</p>
<p>Return <code>true</code> if you can finish all courses. Otherwise, return <code>false</code>.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>
<pre>
<strong>Input:</strong> numCourses = 2, prerequisites = [[1,0]]
<strong>Output:</strong> true
<strong>Explanation:</strong> To take course 1 you need course 0 first, so it is possible.
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre>
<strong>Input:</strong> numCourses = 2, prerequisites = [[1,0],[0,1]]
<strong>Output:</strong> false
<strong>Explanation:</strong> You have a circular dependency: 0 depends on 1 and 1 depends on 0, so you cannot complete both.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 ≤ numCourses ≤ 2000</code></li>
  <li><code>0 ≤ prerequisites.length ≤ 5000</code></li>
  <li><code>prerequisites[i].length == 2</code></li>
  <li><code>0 ≤ ai, bi < numCourses</code></li>
  <li>All the pairs <code>prerequisites[i]</code> are unique.</li>
</ul>
