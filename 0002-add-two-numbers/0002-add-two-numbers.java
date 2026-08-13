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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res=new ListNode();
        ListNode ans=res;
       
        int carry=0;
        int sum=0;
        while(l1!=null || l2!=null || carry!=0){
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            sum+=carry;
            int val=sum;
            if(sum>=10){
                
                val=sum%10;
                sum=sum/10;
                carry=sum;


            }else{
                carry=0;
            }
            ListNode newNode=new ListNode(val);
           
            res.next=newNode;
            res=res.next;
            sum=0;

        }
        return ans.next;
        
    }
}