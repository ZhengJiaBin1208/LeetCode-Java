给你单链表的头节点 <code>head</code> ，请你反转链表，并返回反转后的链表。

<div class="original__bRMd"> 
 <div> 
  <p>&nbsp;</p> 
 </div>
</div>

<p><strong>示例 1：</strong></p> 
<img alt="" src="https://assets.leetcode.com/uploads/2021/02/19/rev1ex1.jpg" style="width: 542px; height: 222px;" /> 
<pre>
<strong>输入：</strong>head = [1,2,3,4,5]
<strong>输出：</strong>[5,4,3,2,1]
</pre>

<p><strong>示例 2：</strong></p> 
<img alt="" src="https://assets.leetcode.com/uploads/2021/02/19/rev1ex2.jpg" style="width: 182px; height: 222px;" /> 
<pre>
<strong>输入：</strong>head = [1,2]
<strong>输出：</strong>[2,1]
</pre>

<p><strong>示例 3：</strong></p>

<pre>
<strong>输入：</strong>head = []
<strong>输出：</strong>[]
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li>链表中节点的数目范围是 <code>[0, 5000]</code></li> 
 <li><code>-5000 &lt;= Node.val &lt;= 5000</code></li> 
</ul>

<p>&nbsp;</p>

<p><strong>进阶：</strong>链表可以选用迭代或递归方式完成反转。你能否用两种方法解决这道题？</p>

<div><div>Related Topics</div><div><li>递归</li><li>链表</li></div></div><br><div><li>👍 3547</li><li>👎 0</li></div>

**题解**

初始化pre节点和next节点，循环直到头部节点为空，循环中保存下一节点到next变量，当前节点next指向pre实现反转，

移动pre到当前节点，移动当前节点到之前保存的next节点

**代码**

```java
/**
 * 反转链表。
 * 该函数接收一个链表的头节点，并反转整个链表，然后返回新链表的头节点。
 *
 * @param head 链表的头节点，表示要反转的链表的起始点。
 * @return 返回反转后链表的新头节点。
 */
public ListNode reverseList(ListNode head) {
   // 初始化前一个节点为null，用于存储当前节点的前一个节点
    ListNode pre = null;
  // 初始化下一个节点为null，用于存储当前节点的下一个节点
    ListNode next = null; 
   // 遍历链表直到头节点为null
    while (head != null) {
       // 保存当前节点的下一个节点
        next = head.next;
      // 将当前节点的next指向前一个节点，实现反转
        head.next = pre; 
       // 更新前一个节点为当前节点
        pre = head;
       // 更新当前节点为下一个节点
        head = next;
    }
   // 返回反转后链表的新头节点
    return pre;
}
```

