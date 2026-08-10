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
    public ListNode removeElements(ListNode head, int val) {
        ListNode du=new ListNode(0);
        du.next=head;
        ListNode cu=du;
        while(cu.next!=null){
            if(cu.next.val==val){
            cu.next=cu.next.next;
            }else{
                cu=cu.next;
            }
        }
            return du.next;
        
    }
}