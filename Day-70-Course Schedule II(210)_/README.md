<h2><a href="https://leetcode.com/problems/course-schedule-ii/description/">
210. Course Schedule II</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Medium-yellow" alt="Difficulty: Medium" />
<hr>

<p>There are a total of <code>numCourses</code> courses you have to take, labeled from <code>0</code> to <code>numCourses − 1</code>.</p>
<p>You are given an array <code>prerequisites</code> where <code>prerequisites[i] = [a, b]</code> indicates that you must take course <code>b</code> before you can take course <code>a</code>.</p>
<p>Return *any order* of courses you should take to finish all courses. If it is impossible to finish all courses, return an empty array <code>[]</code>.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>
<pre>
<strong>Input:</strong> numCourses = 2, prerequisites = [[1,0]]
<strong>Output:</strong> [0,1]
<strong>Explanation:</strong> To take course 1 you need course 0 first, so one possible order is [0,1].
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre>
<strong>Input:</strong> numCourses = 4, prerequisites = [[1,0],[2,0],[3,1],[3,2]]
<strong>Output:</strong> [0,1,2,3] or [0,2,1,3]
<strong>Explanation:</strong> There are multiple valid orders to finish all courses.
</pre>

<p><strong class="example">Example 3:</strong></p>
<pre>
<strong>Input:</strong> numCourses = 1, prerequisites = []
<strong>Output:</strong> [0]
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 ≤ numCourses ≤ 2000</code></li>
  <li><code>0 ≤ prerequisites.length ≤ 5000</code></li>
  <li><code>prerequisites[i].length == 2</code></li>
  <li><code>0 ≤ ai, bi < numCourses</code></li>
  <li>All the pairs <code>prerequisites[i]</code> are unique.</li>
</ul>
