package com.jamison.jianzhi_offer2;

import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val){this.val = val;}
}
//输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
public class reversePrint {
    ArrayList<Integer> arrayList = new ArrayList<>();
    public int[] reversePrint(ListNode head) {
        rescur(head);
        int[] res = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            res[i] = arrayList.get(i);
        }
        return res;
    }

    private void rescur(ListNode head) {
        if(head == null) {
            rescur(head.next);
        }
        arrayList.add(head.val);
    }

}
