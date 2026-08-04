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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int index=0;
        while(temp!=null){
            index++;
            temp=temp.next;
        }
        if(index==n) return head.next;
        temp=head;
        for(int i=1;i<index-n;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}