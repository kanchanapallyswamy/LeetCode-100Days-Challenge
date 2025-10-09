<h2><a href="https://leetcode.com/problems/clone-graph/description/">
133. Clone Graph</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Medium-yellow" alt="Difficulty: Medium" />
<hr>

<p>You are given a reference to a node in a <strong>connected</strong> undirected graph.</p>
<p>Each node in the graph contains:</p>
<ul>
  <li><code>val</code> (an integer) and</li>
  <li>a list of its <code>neighbors</code> (<code>Node</code> objects).</li>
</ul>
<p>Design an algorithm to clone the graph. Each node in the graph has a unique integer value and it is guaranteed that the graph is connected.</p>
<p>Return a <strong>deep copy</strong> of the graph.</p>

<p><strong>Test Case 1:</strong></p>
<img alt="Graph for Test Case 1" src="https://assets.leetcode.com/uploads/2019/11/04/133_clone_graph_question.png" style="width: 500px; height: auto;" />
<pre>
<strong>Input:</strong> adjList = [[2,4],[1,3],[2,4],[1,3]]
<strong>Output:</strong> [[2,4],[1,3],[2,4],[1,3]]
<strong>Explanation:</strong> There are 4 nodes in the graph.
Node 1's value is 1 and it has two neighbors: nodes 2 and 4.
Node 2's value is 2 and it has two neighbors: nodes 1 and 3.
Node 3's value is 3 and it has two neighbors: nodes 2 and 4.
Node 4's value is 4 and it has two neighbors: nodes 1 and 3.
</pre>

<p><strong>Test Case 2:</strong></p>
<img alt="Graph for Test Case 2" src="https://assets.leetcode.com/uploads/2020/01/07/graph.png" style="width: 500px; height: auto;" />
<pre>
<strong>Input:</strong> adjList = [[]]
<strong>Output:</strong> [[]]
<strong>Explanation:</strong> The graph consists of a single node with a value of 1 and no neighbors.
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>0 ≤ val ≤ 100</code></li>
  <li><code>Node.val</code> is unique for each node.</li>
  <li>There are no repeated edges and no self-loops in the graph.</li>
  <li>The graph is connected and there is at least one node.</li>
</ul>
