package com.jamison.jianzhi_offer2;

import java.util.LinkedList;

//用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
//
//来源：力扣（LeetCode）
//链接：https://leetcode.cn/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
public class CQueue {
    LinkedList<Integer> A, B;
    public CQueue(){
        this.A = new LinkedList<Integer>();
        this.B = new LinkedList<Integer>();
    }

    public void appendTail(int value) {
        A.add(value);
    }

    public int deleteHead() {
        if(!B.isEmpty()) {
            return B.removeLast();
        }
        //B为空
        if(A.isEmpty()) {
            return -1;
        }
        while(!A.isEmpty()) {
            B.add(A.removeLast());
        }
        return B.removeLast();
    }
}
