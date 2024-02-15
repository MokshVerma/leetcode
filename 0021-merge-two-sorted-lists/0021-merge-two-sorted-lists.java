/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        } else if(list2 == null){
            return list1;
        }
        ListNode curr = null;
        ListNode temp1 = list1, temp2 = list2;
        while(temp1 != null && temp2 != null) {
            ListNode main = null;
            if(temp1.val < temp2.val) {
                main = temp1;
                temp1 = temp1.next;
            } else {
                main = temp2;
                temp2 = temp2.next;
            }
            
            if(curr == null){
                curr = main;
            } else {
                curr.next = main;
                curr = curr.next;
            }
        }
        
        while(temp1 != null) {
            curr.next = temp1;
            temp1 = temp1.next;
            curr = curr.next;
        }
        while(temp2 != null) {
            curr.next = temp2;
            temp2 = temp2.next;
            curr = curr.next;
        }
        return list1.val < list2.val ? list1: list2;
    }
}