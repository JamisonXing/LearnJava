package com.jamison.jianzhi_offer2;

public class GetKthFromEnd {
    public ListNode getKthFromEnd(ListNode head, int k) {
        int len = 0;
        ListNode cur = head;
        while (head.next != null) {
            head = head.next;
            len++;
        }
        int index = len - k;
        while(index >= 0 && cur.next != null) {
            cur = cur.next;
            index--;
        }
        return cur;
    }
}
