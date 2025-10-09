<h2><a href="https://leetcode.com/problems/course-schedule-iv/description/">
1462. Course Schedule IV</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Medium-yellow" alt="Difficulty: Medium" />
<hr>

<p>There are a total of <code>numCourses</code> courses you have to take, labeled from <code>0</code> to <code>numCourses - 1</code>.</p>
<p>You are given a <code>prerequisites</code> array where <code>prerequisites[i] = [a, b]</code> indicates that to take course <code>a</code> you have to take course <code>b</code> first.</p>
<p>You are also given a <code>queries</code> array where <code>queries[i] = [a, b]</code> represents a query asking if course <code>b</code> is a prerequisite of course <code>a</code>.</p>
<p>Return a boolean array <code>answer</code> where <code>answer[i]</code> is <code>true</code> if course <code>b</code> is a prerequisite of course <code>a</code>, otherwise <code>false</code>.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>
<img alt="Graph for Example 1" src="https://assets.leetcode.com/uploads/2021/05/01/courses4-1-graph.jpg" style="width: 500px; height: auto;" />
<pre>
<strong>Input:</strong> numCourses = 2, prerequisites = [[1,0]], queries = [[0,1],[1,0]]
<strong>Output:</strong> [false,true]
<strong>Explanation:</strong> Course 0 is not a prerequisite of course 1, but course 1 is a prerequisite of course 0.
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="Graph for Example 2" src="https://assets.leetcode.com/uploads/2021/05/01/courses4-3-graph.jpg" style="width: 500px; height: auto;" />
<pre>
<strong>Input:</strong> numCourses = 3, prerequisites = [[1,2],[1,0],[2,0]], queries = [[1,0],[1,2]]
<strong>Output:</strong> [true,true]
<strong>Explanation:</strong> Course 1 is a prerequisite of course 0 and course 2.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>2 ≤ numCourses ≤ 100</code></li>
  <li><code>0 ≤ prerequisites.length ≤ numCourses * (numCourses - 1) / 2</code></li>
  <li><code>0 ≤ prerequisites[i][0], prerequisites[i][1] < numCourses</code></li>
  <li><code>prerequisites[i][0] ≠ prerequisites[i][1]</code></li>
  <li><code>1 ≤ queries.length ≤ 10^4</code></li>
  <li><code>queries[i][0] ≠ queries[i][1]</code></li>
</ul>
