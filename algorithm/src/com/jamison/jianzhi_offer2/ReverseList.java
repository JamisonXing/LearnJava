package com.jamison.jianzhi_offer2;

import java.util.List;

public class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode cur = head, pre = null, tmp = null;
        while(cur != null) {
            tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }
}
