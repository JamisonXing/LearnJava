package com.jamison.jianzhi_offer2;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0), fakeHead = listNode;
        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                fakeHead.next = l1;
                l1 = l1.next;
            } else {
                fakeHead.next = l2;
                l2 = l2.next;
            }
            fakeHead = fakeHead.next;
        }
        fakeHead.next = l1 != null ? l1 : l2;
        return listNode.next;
    }
}
