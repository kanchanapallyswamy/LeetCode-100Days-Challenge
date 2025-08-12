<h2><a href="https://leetcode.com/problems/min-stack/">Min Stack</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Medium-orange" alt="Difficulty: Medium" />
<hr>

<p>Design a stack that supports push, pop, top, and retrieving the minimum element in constant time (<code>O(1)</code>).</p>

<p>Implement the <code>MinStack</code> class:</p>
<ul>
  <li><code>MinStack()</code> initializes the stack object.</li>
  <li><code>void push(int x)</code> pushes element <code>x</code> onto the stack.</li>
  <li><code>void pop()</code> removes the element on the top of the stack.</li>
  <li><code>int top()</code> gets the top element of the stack.</li>
  <li><code>int getMin()</code> retrieves the minimum element in the stack.</li>
</ul>

<p>&nbsp;</p>

<p><strong class="example">Example:</strong></p>
<pre>
<strong>Input:</strong>
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],       [-2],  [0],   [-3],    [],      [],   [],     []]
<strong>Output:</strong>
[null,      null, null,  null,    -3,      null, 0,     -2]
<strong>Explanation:</strong>
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // returns -3
minStack.pop();
minStack.top();    // returns 0
minStack.getMin(); // returns -2
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>
<ul>
  <li>All calls to <code>pop</code>, <code>top</code>, and <code>getMin</code> will be made on non-empty stacks.</li>
  <li>There will be at most <code>3 × 10<sup>4</sup></code> calls total across all methods.</li>
  <li><code>-2<sup>31</sup> ≤ x ≤ 2<sup>31</sup> - 1</code></li>
</ul>
