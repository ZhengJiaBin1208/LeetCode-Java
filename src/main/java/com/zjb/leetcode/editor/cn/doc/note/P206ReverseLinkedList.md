题解

初始化pre节点和next节点，循环直到头部节点为空，循环中保存下一节点到next变量，当前节点next指向pre实现反转，

移动pre到当前节点，移动当前节点到之前保存的next节点

代码

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
