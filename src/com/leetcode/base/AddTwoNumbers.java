package com.leetcode.base;

import java.util.logging.Logger;

/**
 * @author cx
 * @date 2/1/2019
 **/
public class AddTwoNumbers {

    ListNode listNode1 = new ListNode(1);
    ListNode listNode2 = new ListNode(8);
    ListNode listNode3 = new ListNode(3);

    ListNode listNode4 = new ListNode(4);
    ListNode listNode5 = new ListNode(5);
    ListNode listNode6 = new ListNode(6);

    public void initListNodes(){
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        listNode4.next = listNode5;
        listNode5.next = listNode6;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int l1_size = 0, l2_size = 0;

        ListNode l1_temp = l1, l2_temp = l2, l_result = new ListNode(0), curr = l_result;

        int carry = 0;
        while (l1_temp != null || l2_temp != null){
            int x = l1_temp != null ? l1_temp.val: 0;
            int y = l2_temp != null ? l2_temp.val: 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            l1_temp = l1_temp != null? l1_temp.next: null;
            l2_temp = l2_temp != null? l2_temp.next: null;
        }
        if(carry > 0){
            curr.next = new ListNode(1);
        }
        return l_result.next;
    }

    public static void main(String[] args) {

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        addTwoNumbers.initListNodes();
        ListNode listNode = addTwoNumbers.addTwoNumbers(addTwoNumbers.listNode1, addTwoNumbers.listNode4);
        System.out.println(listNode.next.val);
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}